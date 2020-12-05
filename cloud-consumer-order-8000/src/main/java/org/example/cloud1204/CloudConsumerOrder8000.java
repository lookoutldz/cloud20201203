package org.example.cloud1204;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author looko
 */
@EnableEurekaClient
@SpringBootApplication
public class CloudConsumerOrder8000 {
    public static void main(String[] args) {
        SpringApplication.run(CloudConsumerOrder8000.class, args);
    }
}
