package com.team.service.impl;

import com.team.core.AbstractService;
import com.team.dao.SupplierMapper;
import com.team.pojo.Supplier;
import com.team.service.SupplierService;
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
public class SupplierServiceImpl extends AbstractService<Supplier> implements SupplierService {
    @Resource
    private SupplierMapper tSupplierMapper;

    @Override
    public void save(Supplier model) {

    }

    @Override
    public void save(List<Supplier> models) {

    }

    @Override
    public void deleteById(Integer id) {

    }

    @Override
    public void deleteByIds(String ids) {

    }

    @Override
    public void update(Supplier model) {

    }

    @Override
    public Supplier findById(Integer id) {
        return null;
    }

    @Override
    public Supplier findBy(String fieldName, Object value) throws TooManyResultsException {
        return null;
    }

    @Override
    public List<Supplier> findByIds(String ids) {
        return null;
    }

    @Override
    public List<Supplier> findByCondition(Condition condition) {
        return null;
    }

    @Override
    public List<Supplier> findAll() {
        return null;
    }
}
