package org.example.cloud1206.controller;

import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;
import org.example.cloud1205.entity.CommonResult;
import org.example.cloud1205.entity.Payment;
import org.example.cloud1206.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author looko
 */
@Slf4j
@Api
@RestController
@RequestMapping("/payment")
public class PaymentController {

    @Value("${server.port}")
    private String serverPort;

    @Autowired
    private PaymentService paymentService;

    @Resource
    private DiscoveryClient discoveryClient;

    @GetMapping("/{id}")
    private CommonResult<Payment> getById(@PathVariable Long id) {
        CommonResult<Payment> result = new CommonResult<>();
        Payment payment = paymentService.getById(id);
        if (payment != null) {
            result.setCode(200);
            result.setMessage("success" + serverPort);
            result.setData(payment);
        } else {
            result.setCode(500);
            result.setMessage("fail" + serverPort);
            result.setData(null);
        }
        return result;
    }

    @GetMapping("/")
    private CommonResult<List<Payment>> findAll() {
        CommonResult<List<Payment>> result = new CommonResult<>();
        List<Payment> payments = paymentService.findAll();
        result.setCode(200);
        result.setMessage("success");
        result.setData(payments);
        return result;
    }

    @PostMapping("/")
    private CommonResult<Long> create(@RequestBody Payment payment) {
        CommonResult<Long> result = new CommonResult<>();
        Long id = paymentService.create(payment);
        if (id != null && id > 0) {
            result.setCode(200);
            result.setMessage("success");
            result.setData(id);
        } else {
            result.setCode(500);
            result.setMessage("fail");
            result.setData(null);
        }
        return result;
    }

    @GetMapping("/discovery")
    private Object getInfo() {
        List<String> services = discoveryClient.getServices();
        for (String service : services) {
            log.info(service);
        }
        List<ServiceInstance> instances = discoveryClient.getInstances("CLOUD-PAYMENT-SERVICE");
        for (ServiceInstance instance : instances) {
            log.info(instance.getUri() + "\t" + instance.getHost() + "\t" + instance.getPort() + "\t" + instance.getScheme() + "\t" + instance.getServiceId() + "\t" + instance.getInstanceId());
        }
        return null;
    }
}
