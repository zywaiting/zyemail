package com.heitian.ssm.mapping;

import com.heitian.ssm.model.RpCreditSmsCtcc;
import com.heitian.ssm.model.RpCreditSmsCtccExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RpCreditSmsCtccMapper {
    int countByExample(RpCreditSmsCtccExample example);

    int deleteByExample(RpCreditSmsCtccExample example);

    int deleteByPrimaryKey(Long id);

    int insert(RpCreditSmsCtcc record);

    int insertSelective(RpCreditSmsCtcc record);

    List<RpCreditSmsCtcc> selectByExample(RpCreditSmsCtccExample example);

    RpCreditSmsCtcc selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") RpCreditSmsCtcc record, @Param("example") RpCreditSmsCtccExample example);

    int updateByExample(@Param("record") RpCreditSmsCtcc record, @Param("example") RpCreditSmsCtccExample example);

    int updateByPrimaryKeySelective(RpCreditSmsCtcc record);

    int updateByPrimaryKey(RpCreditSmsCtcc record);
}