package org.example.cloud1203.dao;

import org.example.cloud1203.entity.Payment;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

/**
 * @author looko
 */
@Repository
public interface PaymentMapper extends Mapper<Payment> {
}
