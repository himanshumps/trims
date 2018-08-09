package citi.com.camel;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.ProducerTemplate;
import org.apache.camel.builder.RouteBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import citi.com.domain.MessageData;
import citi.com.utils.MessageRepository;
import java.util.List;
@Component
public class ReprocessRouter extends RouteBuilder {
    @Autowired
    private ProducerTemplate producerTemplate;   
    @Autowired
    MessageRepository itemRepo;
    @Override
    public void configure() throws Exception {
        //Producer route
    	onException(Exception.class).maximumRedeliveries(0).redeliveryDelay(0);
       from("timer://test?period=5000")    	 
       .process(new Processor() {
    	   @Override
			public void process(Exchange exchange) throws Exception {
				try {					
					List<MessageData> messageList = itemRepo.getAllItems();
					for(MessageData message: messageList){String jsonString = "";
					jsonString = message.getMessage();
					log.info("**********************************");
					log.info("Reprocess message '{}' to queue....", jsonString);
					producerTemplate.sendBody("activemq://test-queue", jsonString);
					int deleteValue = itemRepo.deleteItem(message.getRefnum());
					log.info("Reprocess message  message.getRefnum()'{}' ", message.getRefnum());
					log.info("Reprocess message jsonString '{}' to queue.", jsonString);
					log.info("Reprocess message deleteValue'{}' ", deleteValue);
					}
				} catch (Exception e) {
					log.info("Reprocess message in Exception block '{}' to queue.", e);					
					}
			}
    	   
         });      

    }
}
