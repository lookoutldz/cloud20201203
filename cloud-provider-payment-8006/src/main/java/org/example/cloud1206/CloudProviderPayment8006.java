package org.example.cloud1206;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @author looko
 */
@SpringBootApplication
@MapperScan(basePackages = "org.example.cloud1206.dao")
@EnableDiscoveryClient
public class CloudProviderPayment8006 {
    public static void main(String[] args) {
        SpringApplication.run(CloudProviderPayment8006.class, args);
    }
}
