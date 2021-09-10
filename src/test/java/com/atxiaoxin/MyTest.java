package com.atxiaoxin;

import com.atxiaoxin.dao.BookMapper;
import com.atxiaoxin.domain.Books;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @author xiaoxin
 * @Description:
 * @version: $
 * @creat 2021 -08 -14 -21:27
 */
public class MyTest {
    @Test
    public void testqueryBookById() throws IOException {
        //1.定义mybatis主配置文件的名称，从类路径的根开始
        String resource = "mybatis-config.xml";
        //2.读取这个resource表示的文件
        InputStream inputStream = Resources.getResourceAsStream(resource);
        //3.创建SqlSessionFactory对象
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        //4.【重要】创建SqlSession对象，从SqlSessionFactory中获取SqlSession
        SqlSession session = sqlSessionFactory.openSession();
        //5.【重要】指定要执行的sql语句的标识
        BookMapper bookMapper = session.getMapper(BookMapper.class);
        Books book = bookMapper.queryBookById(2);
        System.out.println("book"+book);
    }

    @Test
    public void testqueryAllBook() throws IOException {
        //1.定义mybatis主配置文件的名称，从类路径的根开始
        String resource = "mybatis-config.xml";
        //2.读取这个resource表示的文件
        InputStream inputStream = Resources.getResourceAsStream(resource);
        //3.创建SqlSessionFactory对象
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        //4.【重要】创建SqlSession对象，从SqlSessionFactory中获取SqlSession
        SqlSession session = sqlSessionFactory.openSession();
        //5.【重要】指定要执行的sql语句的标识
        BookMapper bookMapper = session.getMapper(BookMapper.class);
        List<Books> books = bookMapper.queryAllBook();
        for (Books book:books) {
            System.out.println(book);
        }
       // System.out.println("book"+book);
    }


    @Test
    public void testGit(){
        System.out.println("Git Test1!");
        System.out.println("Git Test2!");
        System.out.println("Git Test3!");
        System.out.println("Git Test4!");
        System.out.println("master Test!");
        System.out.println("Push Test!");
    }
}
