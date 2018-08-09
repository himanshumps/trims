package citi.com.recive.camel;

import org.apache.camel.ConsumerTemplate;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;	

@Component
public class ReciveRouter extends RouteBuilder {

  /*  
    @Autowired
    private ConsumerTemplate consumerTemplate;
*/
    @Override
    public void configure() throws Exception {
    	//Consumer queue
        from("activemq://test-queue")
        .process(new Processor() {
        @Override
        public void process(Exchange exchange) throws Exception {

           String message = exchange.getIn().getBody(String.class);
           log.info("--------------------------------");
           log.info("Receive message '{}' from queue.", message);
         }
        });

    }
}
