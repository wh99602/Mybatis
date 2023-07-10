/**
 * @(#)BlurSelectUser.java, 2023-07-10.
 * <p>
 * Copyright 2023 Youdao, Inc. All rights reserved.
 * YOUDAO PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package org.test.wh.app;

import org.apache.ibatis.session.SqlSession;
import org.test.wh.mapper.BlurSelectUserMapper;
import org.test.wh.util.SqlSessionUtil;

import java.util.Map;

/**
 * BlurSelectUser
 *
 * @author wangheng
 * @since 2023/07/10
 */
public class BlurSelectUser {
    public static void main(String[] args) {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        BlurSelectUserMapper blurSelectUserMapper = sqlSession.getMapper(BlurSelectUserMapper.class);
        
        Map<Long, Object> blurSelectUser = blurSelectUserMapper.BlurSelectUser("河南");
        blurSelectUser.forEach((k,v)->{
            System.out.println(k + "=" + v);
        });
    }
}