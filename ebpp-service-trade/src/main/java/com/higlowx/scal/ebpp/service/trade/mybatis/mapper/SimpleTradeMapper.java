package com.higlowx.scal.ebpp.service.trade.mybatis.mapper;

import com.higlowx.scal.ebpp.service.trade.entity.Trade;
import com.higlowx.scal.ebpp.service.trade.mybatis.example.TradeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SimpleTradeMapper {
    long countByExample(TradeExample example);

    int deleteByExample(TradeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Trade record);

    int insertSelective(Trade record);

    List<Trade> selectByExample(TradeExample example);

    Trade selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Trade record, @Param("example") TradeExample example);

    int updateByExample(@Param("record") Trade record, @Param("example") TradeExample example);

    int updateByPrimaryKeySelective(Trade record);

    int updateByPrimaryKey(Trade record);
}