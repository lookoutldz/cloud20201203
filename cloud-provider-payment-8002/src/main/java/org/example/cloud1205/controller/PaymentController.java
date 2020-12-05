package org.example.cloud1205.controller;

import io.swagger.annotations.Api;
import org.example.cloud1205.service.PaymentService;
import org.example.cloud1205.entity.CommonResult;
import org.example.cloud1205.entity.Payment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author looko
 */
@Api
@RestController
@RequestMapping("/payment")
public class PaymentController {

    @Value("${server.port}")
    private String serverPort;

    @Autowired
    private PaymentService paymentService;

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
}
