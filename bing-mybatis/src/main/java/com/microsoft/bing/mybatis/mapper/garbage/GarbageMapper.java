package com.microsoft.bing.mybatis.mapper.garbage;

import com.microsoft.bing.mybatis.model.garbage.Garbage;
import com.microsoft.bing.mybatis.model.garbage.GarbageExample;
import org.apache.ibatis.annotations.Param;

/**
 * Created by nbj-mybatis-generator-plugins
 * @author 雅诗兰黛
 * @since 2021-08-06.
 */
public interface GarbageMapper {
    long countByExample(GarbageExample example);

    int deleteByExample(GarbageExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Garbage record);

    int insertSelective(Garbage record);

    Garbage selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Garbage record, @Param("example") GarbageExample example);

    int updateByPrimaryKeySelective(Garbage record);
}