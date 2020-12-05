package org.example.cloud1205;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author looko
 */
@SpringBootApplication
@EnableEurekaServer
public class CloudEurekaServer7001 {
    public static void main(String[] args) {
        SpringApplication.run(CloudEurekaServer7001.class, args);
    }
}
