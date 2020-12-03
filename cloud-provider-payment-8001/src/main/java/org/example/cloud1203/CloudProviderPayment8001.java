package org.example.cloud1203;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @author looko
 */
@MapperScan(basePackages = "org.example.cloud1203.dao")
@SpringBootApplication
public class CloudProviderPayment8001 {
    public static void main(String[] args) {
        SpringApplication.run(CloudProviderPayment8001.class, args);
    }
}
