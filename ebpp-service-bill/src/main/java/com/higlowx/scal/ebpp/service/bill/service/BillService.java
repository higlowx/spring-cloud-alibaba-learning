package com.higlowx.scal.ebpp.service.bill.service;

import com.higlowx.scal.ebpp.service.bill.dao.BillDao;
import com.higlowx.scal.ebpp.service.bill.entity.Bill;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

/**
 * @author Dylan.Li
 * @date 2021/7/8
 * @since
 */
@Service
public class BillService {

    @Autowired
    private BillDao billDao;


    public Bill create(BigDecimal amount, Integer tradeId) {
        Bill bill = new Bill();
        bill.setTradeId(tradeId);
        bill.setAmount(amount);
        billDao.insert(bill);
        return bill;
    }
}