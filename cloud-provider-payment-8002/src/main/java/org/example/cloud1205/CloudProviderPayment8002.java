package org.example.cloud1205;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @author looko
 */
@SpringBootApplication
@EnableEurekaClient
@MapperScan(basePackages = "org.example.cloud1205.dao")
public class CloudProviderPayment8002 {
    public static void main(String[] args) {
        SpringApplication.run(CloudProviderPayment8002.class, args);
    }
}
