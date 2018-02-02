package com.heitian.ssm.mapping;

import com.heitian.ssm.model.RpCreditBankConfig;
import com.heitian.ssm.model.RpCreditBankConfigExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RpCreditBankConfigMapper {
    int countByExample(RpCreditBankConfigExample example);

    int deleteByExample(RpCreditBankConfigExample example);

    int deleteByPrimaryKey(String name);

    int insert(RpCreditBankConfig record);

    int insertSelective(RpCreditBankConfig record);

    List<RpCreditBankConfig> selectByExample(RpCreditBankConfigExample example);

    RpCreditBankConfig selectByPrimaryKey(String name);

    int updateByExampleSelective(@Param("record") RpCreditBankConfig record, @Param("example") RpCreditBankConfigExample example);

    int updateByExample(@Param("record") RpCreditBankConfig record, @Param("example") RpCreditBankConfigExample example);

    int updateByPrimaryKeySelective(RpCreditBankConfig record);

    int updateByPrimaryKey(RpCreditBankConfig record);
}