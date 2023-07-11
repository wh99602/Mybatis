/**
 * @(#)WhUser.java, 2023-07-11.
 * <p>
 * Copyright 2023 Youdao, Inc. All rights reserved.
 * YOUDAO PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.atguigu.mybatis.app;

import com.atguigu.mybatis.mapper.WhUserMapper;
import org.apache.ibatis.session.SqlSession;
import org.test.wh.util.SqlSessionUtil;

import java.util.List;

/**
 * WhUser
 *
 * @author wangheng
 * @since 2023/07/11
 */
public class WhUser {
    public static void main(String[] args) {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        WhUserMapper whUserMapper = sqlSession.getMapper(WhUserMapper.class);
        List<com.atguigu.mybatis.bean.WhUser> whUsers = whUserMapper.selectAll();
        for (com.atguigu.mybatis.bean.WhUser whUser : whUsers) {
            System.out.println(whUser);
        }
    }
}