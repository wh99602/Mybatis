package org.test.wh.mapper;

import org.apache.ibatis.annotations.MapKey;
import org.apache.ibatis.annotations.Param;

import java.util.Map;

public interface TrendsSqlMapper {
    @MapKey("id")
    Map<Long,Object> trendsSqlSelect(@Param("id") int id,@Param("name") String name );
    Map<Long,Object> trendsSqlSelect(@Param("id") int id);
}
