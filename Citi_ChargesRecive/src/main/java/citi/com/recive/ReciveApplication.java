package citi.com.recive;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.AsyncConfigurerSupport;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
@EnableAsync
public class ReciveApplication extends AsyncConfigurerSupport {

    public static void main(String[] args) {
        SpringApplication.run(ReciveApplication.class, args);
        while (true){}
    }

}
