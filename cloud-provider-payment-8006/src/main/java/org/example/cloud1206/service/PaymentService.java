package org.example.cloud1206.service;

import org.example.cloud1205.entity.Payment;

import java.util.List;

/**
 * @author looko
 */
public interface PaymentService {

    /**
     * create payment
     * @param payment
     * @return
     */
    Long create(Payment payment);

    /**
     * get Payment by payment id
     * @param id
     * @return
     */
    Payment getById(Long id);

    /**
     * get all Payments
     * @return
     */
    List<Payment> findAll();
}
