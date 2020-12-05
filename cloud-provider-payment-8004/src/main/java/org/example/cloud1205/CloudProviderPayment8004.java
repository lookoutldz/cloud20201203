package org.example.cloud1205;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @author looko
 */
@MapperScan("org.example.cloud1205.dao")
@EnableDiscoveryClient
@SpringBootApplication
public class CloudProviderPayment8004 {
    public static void main(String[] args) {
        SpringApplication.run(CloudProviderPayment8004.class, args);
    }
}
