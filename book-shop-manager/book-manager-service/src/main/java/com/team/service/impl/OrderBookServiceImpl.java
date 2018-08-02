package com.team.service.impl;

import com.team.core.AbstractService;
import com.team.dao.OrderBookMapper;
import com.team.pojo.OrderBook;
import com.team.service.OrderBookService;
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
public class OrderBookServiceImpl extends AbstractService<OrderBook> implements OrderBookService {
    @Resource
    private OrderBookMapper tOrderBookMapper;

    @Override
    public void save(OrderBook model) {

    }

    @Override
    public void save(List<OrderBook> models) {

    }

    @Override
    public void deleteById(Integer id) {

    }

    @Override
    public void deleteByIds(String ids) {

    }

    @Override
    public void update(OrderBook model) {

    }

    @Override
    public OrderBook findById(Integer id) {
        return null;
    }

    @Override
    public OrderBook findBy(String fieldName, Object value) throws TooManyResultsException {
        return null;
    }

    @Override
    public List<OrderBook> findByIds(String ids) {
        return null;
    }

    @Override
    public List<OrderBook> findByCondition(Condition condition) {
        return null;
    }

    @Override
    public List<OrderBook> findAll() {
        return null;
    }
}
