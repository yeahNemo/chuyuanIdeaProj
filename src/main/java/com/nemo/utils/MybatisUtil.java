package com.nemo.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class MybatisUtil {
    private static SqlSessionFactory sqlSessionFactory;
    static {
        String res = "mybatis-config.xml";
        try {
            InputStream in = Resources.getResourceAsStream(res);
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(in);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static SqlSession getSqlSessionFactory() {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        return sqlSession;
    }
}
