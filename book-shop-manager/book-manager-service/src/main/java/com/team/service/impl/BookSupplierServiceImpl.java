package com.team.service.impl;


import com.team.core.AbstractService;
import com.team.dao.BookSupplierMapper;
import com.team.pojo.BookSupplier;
import com.team.service.BookSupplierService;
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
public class BookSupplierServiceImpl extends AbstractService<BookSupplier> implements BookSupplierService {
    @Resource
    private BookSupplierMapper tBookSupplierMapper;

    @Override
    public void save(BookSupplier model) {

    }

    @Override
    public void save(List<BookSupplier> models) {

    }

    @Override
    public void deleteById(Integer id) {

    }

    @Override
    public void deleteByIds(String ids) {

    }

    @Override
    public void update(BookSupplier model) {

    }

    @Override
    public BookSupplier findById(Integer id) {
        return null;
    }

    @Override
    public BookSupplier findBy(String fieldName, Object value) throws TooManyResultsException {
        return null;
    }

    @Override
    public List<BookSupplier> findByIds(String ids) {
        return null;
    }

    @Override
    public List<BookSupplier> findByCondition(Condition condition) {
        return null;
    }

    @Override
    public List<BookSupplier> findAll() {
        return null;
    }
}
