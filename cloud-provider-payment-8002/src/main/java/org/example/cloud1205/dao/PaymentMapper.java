package org.example.cloud1205.dao;

import org.example.cloud1205.entity.Payment;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

/**
 * @author looko
 */
@Repository("paymentMapper")
public interface PaymentMapper extends Mapper<Payment> {
}
