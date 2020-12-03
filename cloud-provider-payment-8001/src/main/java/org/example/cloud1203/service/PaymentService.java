package org.example.cloud1203.service;

import org.example.cloud1203.entity.Payment;

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
}
