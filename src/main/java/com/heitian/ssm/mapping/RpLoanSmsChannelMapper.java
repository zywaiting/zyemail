package com.heitian.ssm.mapping;

import com.heitian.ssm.model.RpLoanSmsChannel;
import com.heitian.ssm.model.RpLoanSmsChannelExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RpLoanSmsChannelMapper {
    int countByExample(RpLoanSmsChannelExample example);

    int deleteByExample(RpLoanSmsChannelExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(RpLoanSmsChannel record);

    int insertSelective(RpLoanSmsChannel record);

    List<RpLoanSmsChannel> selectByExample(RpLoanSmsChannelExample example);

    RpLoanSmsChannel selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") RpLoanSmsChannel record, @Param("example") RpLoanSmsChannelExample example);

    int updateByExample(@Param("record") RpLoanSmsChannel record, @Param("example") RpLoanSmsChannelExample example);

    int updateByPrimaryKeySelective(RpLoanSmsChannel record);

    int updateByPrimaryKey(RpLoanSmsChannel record);
}