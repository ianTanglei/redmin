package com.lotus.dao.mapper;

import com.lotus.dao.bean.RedminRedisParameter;
import java.util.List;

public interface RedminRedisParameterMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(RedminRedisParameter record);

    RedminRedisParameter selectByPrimaryKey(Integer id);

    List<RedminRedisParameter> selectAll();

    int updateByPrimaryKey(RedminRedisParameter record);
}