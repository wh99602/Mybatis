package org.test.wh;

import org.apache.ibatis.session.SqlSession;
import org.test.wh.mapper.UserMapper;
import org.test.wh.util.SqlSessionUtil;

import java.io.IOException;

// 按两次 Shift 打开“随处搜索”对话框并输入 `show whitespaces`，
// 然后按 Enter 键。现在，您可以在代码中看到空格字符。
public class Main {
    public static void main(String[] args) throws IOException {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        //通过代理模式创建UserMapper接口的代理实现类对象
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        //调用UserMapper接口中的方法，就可以根据UserMapper的全类名匹配元素文件，通过调用的方法名匹配映射文件中的SQL标签，并执行标签中的SQL语句
        int result = userMapper.insertUser();
        System.out.println("结果："+result);
    }
}