package com.higlowx.scal.ebpp.service.bill.mybatis.mapper;

import com.higlowx.scal.ebpp.service.bill.entity.Bill;
import com.higlowx.scal.ebpp.service.bill.mybatis.example.BillExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SimpleBillMapper {
    long countByExample(BillExample example);

    int deleteByExample(BillExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Bill record);

    int insertSelective(Bill record);

    List<Bill> selectByExample(BillExample example);

    Bill selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Bill record, @Param("example") BillExample example);

    int updateByExample(@Param("record") Bill record, @Param("example") BillExample example);

    int updateByPrimaryKeySelective(Bill record);

    int updateByPrimaryKey(Bill record);
}