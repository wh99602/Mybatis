package org.test.wh.mapper;

import org.apache.ibatis.annotations.MapKey;
import org.apache.ibatis.annotations.Param;
import org.test.wh.bean.User;

import java.util.List;
import java.util.Map;
import java.util.Objects;

public interface SelectUserMapper {
    @MapKey("id")
    Map<Long, Object> SelectUser(@Param("id") int id ,@Param("name") String name);
}
