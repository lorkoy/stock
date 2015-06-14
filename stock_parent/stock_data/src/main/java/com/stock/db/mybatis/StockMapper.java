package com.stock.db.mybatis;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.stock.db.MyBatisRepository;
import com.stock.db.entity.Stock;
import com.stock.db.entity.StockExample;

@MyBatisRepository
public interface StockMapper {
    int countByExample(StockExample example);

	int deleteByExample(StockExample example);

	int deleteByPrimaryKey(Integer id);

	int insert(Stock record);

	int insertSelective(Stock record);

	List<Stock> selectByExample(StockExample example);

	Stock selectByPrimaryKey(Integer id);

	int updateByExampleSelective(@Param("record") Stock record,
			@Param("example") StockExample example);

	int updateByExample(@Param("record") Stock record,
			@Param("example") StockExample example);

	int updateByPrimaryKeySelective(Stock record);

	int updateByPrimaryKey(Stock record);

}