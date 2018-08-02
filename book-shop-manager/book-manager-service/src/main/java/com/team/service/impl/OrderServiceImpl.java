package com.team.service.impl;

import com.team.core.AbstractService;
import com.team.dao.OrderMapper;
import com.team.pojo.Order;
import com.team.service.OrderService;
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
public class OrderServiceImpl extends AbstractService<Order> implements OrderService {
    @Resource
    private OrderMapper tOrderMapper;

    @Override
    public void save(Order model) {

    }

    @Override
    public void save(List<Order> models) {

    }

    @Override
    public void deleteById(Integer id) {

    }

    @Override
    public void deleteByIds(String ids) {

    }

    @Override
    public void update(Order model) {

    }

    @Override
    public Order findById(Integer id) {
        return null;
    }

    @Override
    public Order findBy(String fieldName, Object value) throws TooManyResultsException {
        return null;
    }

    @Override
    public List<Order> findByIds(String ids) {
        return null;
    }

    @Override
    public List<Order> findByCondition(Condition condition) {
        return null;
    }

    @Override
    public List<Order> findAll() {
        return null;
    }
}
