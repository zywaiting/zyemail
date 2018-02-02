package com.heitian.ssm.mapping;

import com.heitian.ssm.model.RpCreditSmsCmcc;
import com.heitian.ssm.model.RpCreditSmsCmccExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RpCreditSmsCmccMapper {
    int countByExample(RpCreditSmsCmccExample example);

    int deleteByExample(RpCreditSmsCmccExample example);

    int deleteByPrimaryKey(Long id);

    int insert(RpCreditSmsCmcc record);

    int insertSelective(RpCreditSmsCmcc record);

    List<RpCreditSmsCmcc> selectByExample(RpCreditSmsCmccExample example);

    RpCreditSmsCmcc selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") RpCreditSmsCmcc record, @Param("example") RpCreditSmsCmccExample example);

    int updateByExample(@Param("record") RpCreditSmsCmcc record, @Param("example") RpCreditSmsCmccExample example);

    int updateByPrimaryKeySelective(RpCreditSmsCmcc record);

    int updateByPrimaryKey(RpCreditSmsCmcc record);
}