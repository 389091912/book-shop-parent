package com.team.service.impl;

import com.team.core.AbstractService;
import com.team.dao.BookMapper;
import com.team.pojo.Book;
import com.team.service.BookService;
import org.apache.ibatis.exceptions.TooManyResultsException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tk.mybatis.mapper.entity.Condition;

import javax.annotation.Resource;
import java.util.List;


/**
 * Created by CodeGenerator on 2018/08/01.
 */
@Service
@Transactional
public class BookServiceImpl extends AbstractService<Book> implements BookService {
    @Resource
    private BookMapper tBookMapper;

    @Override
    public void save(Book model) {

    }

    @Override
    public void save(List<Book> models) {

    }

    @Override
    public void deleteById(Integer id) {

    }

    @Override
    public void deleteByIds(String ids) {

    }

    @Override
    public void update(Book model) {

    }

    @Override
    public Book findById(Integer id) {
        return null;
    }

    @Override
    public Book findBy(String fieldName, Object value) throws TooManyResultsException {
        return null;
    }

    @Override
    public List<Book> findByIds(String ids) {
        return null;
    }

    @Override
    public List<Book> findByCondition(Condition condition) {
        return null;
    }

    @Override
    public List<Book> findAll() {
        return null;
    }
}
