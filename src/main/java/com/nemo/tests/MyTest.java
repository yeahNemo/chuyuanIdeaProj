package com.nemo.tests;

import com.nemo.dao.myinterface.ItemDao;
import com.nemo.pojo.Item;
import com.nemo.utils.MybatisUtil;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class MyTest {
    public static void main(String[] args) {
        SqlSession sqlSession = MybatisUtil.getSqlSessionFactory();
        ItemDao mapper = sqlSession.getMapper(ItemDao.class);
        List<Item> itemList = mapper.getItemList();
        for(Item item : itemList){
            System.out.println(item);
        }
    }
}
