package com.higlowx.scal.ebpp.service.bill.dao;

import com.higlowx.scal.ebpp.common.utils.AssertUtils;
import com.higlowx.scal.ebpp.service.bill.entity.Bill;
import com.higlowx.scal.ebpp.service.bill.mybatis.mapper.SimpleBillMapper;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Date;

/**
 * @author Dylan.Li
 * @date 2021/7/8
 * @since
 */
@Repository
public class BillDao {

    @Resource
    private SimpleBillMapper mapper;

    public void insert(Bill row) {
        Date time = new Date();
        row.setCreateTime(time);
        row.setUpdateTime(time);
        int rows = mapper.insert(row);
        AssertUtils.isTrue(rows == 1);
    }
}
