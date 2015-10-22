package com.stock.db.mybatis;

import com.stock.db.entity.Bankroll;
import com.stock.db.entity.BankrollExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BankrollMapper {
    int countByExample(BankrollExample example);

    int deleteByExample(BankrollExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Bankroll record);

    int insertSelective(Bankroll record);

    List<Bankroll> selectByExample(BankrollExample example);

    Bankroll selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Bankroll record, @Param("example") BankrollExample example);

    int updateByExample(@Param("record") Bankroll record, @Param("example") BankrollExample example);

    int updateByPrimaryKeySelective(Bankroll record);

    int updateByPrimaryKey(Bankroll record);
    
    int batchInsert(List<Bankroll> list);
}