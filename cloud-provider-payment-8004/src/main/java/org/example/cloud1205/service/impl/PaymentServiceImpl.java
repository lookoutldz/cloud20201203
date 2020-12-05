package org.example.cloud1205.service.impl;

import org.example.cloud1205.dao.PaymentMapper;
import org.example.cloud1205.service.PaymentService;
import org.example.cloud1205.entity.Payment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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

    @Override
    public List<Payment> findAll() {
        return paymentMapper.selectAll();
    }
}
