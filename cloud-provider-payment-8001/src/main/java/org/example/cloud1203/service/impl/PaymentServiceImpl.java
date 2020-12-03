package org.example.cloud1203.service.impl;

import org.example.cloud1203.dao.PaymentMapper;
import org.example.cloud1203.entity.Payment;
import org.example.cloud1203.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author looko
 */
@Service("paymentService")
public class PaymentServiceImpl implements PaymentService {

    @Autowired
    private PaymentMapper paymentMapper;

    @Override
    public Long create(Payment payment) {
        return (long) paymentMapper.insert(payment);
    }

    @Override
    public Payment getById(Long id) {
        return paymentMapper.selectByPrimaryKey(id);
    }
}
