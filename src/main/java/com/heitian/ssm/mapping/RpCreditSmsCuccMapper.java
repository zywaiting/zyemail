package com.heitian.ssm.mapping;

import com.heitian.ssm.model.RpCreditSmsCucc;
import com.heitian.ssm.model.RpCreditSmsCuccExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RpCreditSmsCuccMapper {
    int countByExample(RpCreditSmsCuccExample example);

    int deleteByExample(RpCreditSmsCuccExample example);

    int deleteByPrimaryKey(Long id);

    int insert(RpCreditSmsCucc record);

    int insertSelective(RpCreditSmsCucc record);

    List<RpCreditSmsCucc> selectByExample(RpCreditSmsCuccExample example);

    RpCreditSmsCucc selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") RpCreditSmsCucc record, @Param("example") RpCreditSmsCuccExample example);

    int updateByExample(@Param("record") RpCreditSmsCucc record, @Param("example") RpCreditSmsCuccExample example);

    int updateByPrimaryKeySelective(RpCreditSmsCucc record);

    int updateByPrimaryKey(RpCreditSmsCucc record);
}