package citi.com.camel;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.ProducerTemplate;
import org.apache.camel.builder.RouteBuilder;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.databind.ObjectMapper;

import citi.com.domain.CacheDTO;
import citi.com.domain.PartiesPayingServiceDTO;
import citi.com.utils.MessageRepository;
import citi.com.utils.Utils;



@Component
public class SendRouter extends RouteBuilder {

    @Autowired
    private ProducerTemplate producerTemplate;
   
    @Autowired
    MessageRepository messageRepo;
    @Override
    public void configure() throws Exception {
        //Producer route
    	onException(Exception.class).maximumRedeliveries(2).redeliveryDelay(0);
       from("timer://test?period=5000&repeatCount=2")    	 
       .process(new Processor() {
    	   @Override
			public void process(Exchange exchange) throws Exception {
				Utils utils = new Utils();
				CacheDTO cacheDto = utils.getCaheData();
				String jsonString = "";				
				try {
					ObjectMapper objMapper = new ObjectMapper();
					PartiesPayingServiceDTO partiesPayingServiceDTO = utils.getChargeData(cacheDto);
					jsonString = objMapper.writeValueAsString(partiesPayingServiceDTO);
					log.info("**********************************");
					log.info("Send message '{}' to queue....", jsonString);
					producerTemplate.sendBody("activemq://test-queue", jsonString);
				} catch (Exception e) {
					log.info("Send message in Exception block '{}' to queue.", e);
					log.info(" cacheDto.getRefNum()'{}' ", cacheDto.getRefNum());
					log.info("jsonString '{}' to queue.", jsonString);					
					int insertValue = messageRepo.saveData(cacheDto.getRefNum(), jsonString);
					System.out.println("insertValue :: "+insertValue);
					//utils.emailCommunition();

				}
			}
         });      

    }
}
