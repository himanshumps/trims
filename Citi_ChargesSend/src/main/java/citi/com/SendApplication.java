package citi.com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.PropertySource;
import org.springframework.scheduling.annotation.AsyncConfigurerSupport;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
@EnableAsync
//@ImportResource("classpath:applicationContext.xml")
//@PropertySource(ignoreResourceNotFound = true, value = "classpath:application.properties")
public class SendApplication extends AsyncConfigurerSupport {

    public static void main(String[] args) {
        SpringApplication.run(SendApplication.class, args);
        while (true){}
    }

}
