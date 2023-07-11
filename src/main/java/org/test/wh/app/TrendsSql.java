/**
 * @(#)TrendsSql.java, 2023-07-11.
 * <p>
 * Copyright 2023 Youdao, Inc. All rights reserved.
 * YOUDAO PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package org.test.wh.app;

import org.apache.ibatis.session.SqlSession;
import org.test.wh.mapper.TrendsSqlMapper;
import org.test.wh.util.SqlSessionUtil;

import java.util.Map;

/**
 * TrendsSql
 *
 * @author wangheng
 * @since 2023/07/11
 */
public class TrendsSql {
    public static void main(String[] args) {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        TrendsSqlMapper sqlSessionMapper = sqlSession.getMapper(TrendsSqlMapper.class);
        Map<Long, Object> result = sqlSessionMapper.trendsSqlSelect(10000,null);
        result.forEach((k,v)->{
            System.out.println(k + "=" + v);
        });
    }
}