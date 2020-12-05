package org.example.cloud1205.controller;

import io.swagger.annotations.Api;
import org.example.cloud1205.entity.CommonResult;
import org.example.cloud1205.entity.Payment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

/**
 * @author looko
 */
@Api
@RestController
@RequestMapping("/order")
public class OrderController {

    private static final String PAYMENT_URL = "http://cloud-payment-service";

    @Autowired
    private RestTemplate restTemplate;

    @PostMapping("/payment")
    private CommonResult<Payment> createPayment(@RequestBody Payment payment) {
        return restTemplate.postForObject(PAYMENT_URL + "/payment/", payment, CommonResult.class);
    }

    @GetMapping("/payment/{id}")
    private CommonResult<Payment> getPayment(@PathVariable Long id) {
        return restTemplate.getForObject(PAYMENT_URL + "/payment/" + id, CommonResult.class);
    }
}
