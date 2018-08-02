package com.team.service.impl;

import com.team.core.AbstractService;
import com.team.dao.BookTypeMapper;
import com.team.pojo.BookType;
import com.team.service.BookTypeService;
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
public class BookTypeServiceImpl extends AbstractService<BookType> implements BookTypeService {
    @Resource
    private BookTypeMapper tBookTypeMapper;

    @Override
    public void save(BookType model) {

    }

    @Override
    public void save(List<BookType> models) {

    }

    @Override
    public void deleteById(Integer id) {

    }

    @Override
    public void deleteByIds(String ids) {

    }

    @Override
    public void update(BookType model) {

    }

    @Override
    public BookType findById(Integer id) {
        return null;
    }

    @Override
    public BookType findBy(String fieldName, Object value) throws TooManyResultsException {
        return null;
    }

    @Override
    public List<BookType> findByIds(String ids) {
        return null;
    }

    @Override
    public List<BookType> findByCondition(Condition condition) {
        return null;
    }

    @Override
    public List<BookType> findAll() {
        return null;
    }
}
