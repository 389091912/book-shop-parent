package com.team.service.impl;


import com.team.core.AbstractService;
import com.team.dao.AddressMapper;
import com.team.pojo.Address;
import com.team.service.AddressService;
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
public class AddressServiceImpl extends AbstractService<Address> implements AddressService {
    @Resource
    private AddressMapper tAddressMapper;

    @Override
    public void save(Address model) {

    }

    @Override
    public void save(List<Address> models) {

    }

    @Override
    public void deleteById(Integer id) {

    }

    @Override
    public void deleteByIds(String ids) {

    }

    @Override
    public void update(Address model) {

    }

    @Override
    public Address findById(Integer id) {
        return null;
    }

    @Override
    public Address findBy(String fieldName, Object value) throws TooManyResultsException {
        return null;
    }

    @Override
    public List<Address> findByIds(String ids) {
        return null;
    }

    @Override
    public List<Address> findByCondition(Condition condition) {
        return null;
    }

    @Override
    public List<Address> findAll() {
        return null;
    }
}
