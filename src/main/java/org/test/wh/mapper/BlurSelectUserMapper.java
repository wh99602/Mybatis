package org.test.wh.mapper;

import org.apache.ibatis.annotations.MapKey;
import org.apache.ibatis.annotations.Param;

import java.util.Map;

public interface BlurSelectUserMapper {
    @MapKey("id")
    Map<Long,Object> BlurSelectUser(@Param("name") String blurName);
}
