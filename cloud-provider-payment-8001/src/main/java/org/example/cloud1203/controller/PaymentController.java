package org.example.cloud1203.controller;

import io.swagger.annotations.Api;
import io.swagger.v3.oas.annotations.Operation;
import org.example.cloud1203.entity.CommonResult;
import org.example.cloud1203.entity.Payment;
import org.example.cloud1203.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author looko
 */
@Api
@RestController
@RequestMapping("/payment")
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    @Operation
    @GetMapping("/{id}")
    private CommonResult<Payment> getById(@PathVariable Long id) {
        CommonResult<Payment> result = new CommonResult<>();
        Payment payment = paymentService.getById(id);
        if (payment != null) {
            result.setCode(200);
            result.setMessage("success");
            result.setData(payment);
        } else {
            result.setCode(500);
            result.setMessage("fail");
            result.setData(null);
        }
        return result;
    }

    @Operation
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
