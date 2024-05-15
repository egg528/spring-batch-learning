package org.example.springbatchguide;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

@ConfigurationPropertiesScan
@SpringBootApplication
public class SpringBatchGuideApplication {


    public static void main(String[] args) {
        System.exit(SpringApplication.exit(SpringApplication.run(SpringBatchGuideApplication.class, args)));
    }
}
