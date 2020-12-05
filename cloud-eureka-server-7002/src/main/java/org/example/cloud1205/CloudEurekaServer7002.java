package org.example.cloud1205;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author looko
 */
@SpringBootApplication
@EnableEurekaServer
public class CloudEurekaServer7002 {
    public static void main(String[] args) {
        SpringApplication.run(CloudEurekaServer7002.class, args);
    }
}
