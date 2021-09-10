package com.atxiaoxin.dao;

import com.atxiaoxin.domain.Books;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author xiaoxin
 * @Description:
 * @version: $
 * @creat 2021 -08 -14 -16:21
 */
public interface BookMapper {


    //增加一本书
    int addBook(Books books);

    //删除一本书
    int deleteBookById(int id);
    //更新一本书
    int updateBook(Books books);
    //查询一本书
    Books  queryBookById(@Param("bookId") int id);
    //查询全部的书
    List<Books> queryAllBook();
    //根据书名查询书籍
    Books queryBookByName(@Param("bookName")String bookName);
}
