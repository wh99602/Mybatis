/**
 * @(#)SelectUser.java, 2023-07-10.
 * <p>
 * Copyright 2023 Youdao, Inc. All rights reserved.
 * YOUDAO PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package org.test.wh.app;

import org.apache.ibatis.session.SqlSession;
import org.test.wh.bean.User;
import org.test.wh.mapper.SelectUserMapper;
import org.test.wh.util.SqlSessionUtil;

import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * SelectUser
 *
 * @author wangheng
 * @since 2023/07/10
 */
public class SelectUser {
    public static void main(String[] args) {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        SelectUserMapper selectUserMapper = sqlSession.getMapper(SelectUserMapper.class);
        Map<Long, Object> map = selectUserMapper.SelectUser(1007,"河南科技大学");
        map.forEach((k,v)->{
            System.out.println(k + "=" + v);
        });
    }
}