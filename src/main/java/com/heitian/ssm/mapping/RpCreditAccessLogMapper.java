package com.heitian.ssm.mapping;

import com.heitian.ssm.model.RpCreditAccessLog;
import com.heitian.ssm.model.RpCreditAccessLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RpCreditAccessLogMapper {
    int countByExample(RpCreditAccessLogExample example);

    int deleteByExample(RpCreditAccessLogExample example);

    int deleteByPrimaryKey(Long id);

    int insert(RpCreditAccessLog record);

    int insertSelective(RpCreditAccessLog record);

    List<RpCreditAccessLog> selectByExample(RpCreditAccessLogExample example);

    RpCreditAccessLog selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") RpCreditAccessLog record, @Param("example") RpCreditAccessLogExample example);

    int updateByExample(@Param("record") RpCreditAccessLog record, @Param("example") RpCreditAccessLogExample example);

    int updateByPrimaryKeySelective(RpCreditAccessLog record);

    int updateByPrimaryKey(RpCreditAccessLog record);
}