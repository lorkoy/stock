package com.stock.db.mybatis;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.stock.db.MyBatisRepository;
import com.stock.db.entity.StockInfo;
import com.stock.db.entity.StockInfoExample;

@MyBatisRepository
public interface StockInfoMapper {
    int countByExample(StockInfoExample example);

    int deleteByExample(StockInfoExample example);

    int deleteByPrimaryKey(String id);

    int insert(StockInfo record);

    int insertSelective(StockInfo record);

    List<StockInfo> selectByExample(StockInfoExample example);

    StockInfo selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") StockInfo record, @Param("example") StockInfoExample example);

    int updateByExample(@Param("record") StockInfo record, @Param("example") StockInfoExample example);

    int updateByPrimaryKeySelective(StockInfo record);

    int updateByPrimaryKey(StockInfo record);
    
    int batchInsert(final List<StockInfo> list);
    int batchInsertHalfHour(final List<StockInfo> list);
    int batchInsertTwoHour(final List<StockInfo> list);
    int batchInsertPerHour(final List<StockInfo> list);
}