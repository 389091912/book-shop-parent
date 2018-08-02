package com.team.service.impl;

import com.team.core.AbstractService;
import com.team.dao.PressMapper;
import com.team.pojo.Press;
import com.team.service.PressService;
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
public class PressServiceImpl extends AbstractService<Press> implements PressService {
    @Resource
    private PressMapper tPressMapper;

    @Override
    public void save(Press model) {

    }

    @Override
    public void save(List<Press> models) {

    }

    @Override
    public void deleteById(Integer id) {

    }

    @Override
    public void deleteByIds(String ids) {

    }

    @Override
    public void update(Press model) {

    }

    @Override
    public Press findById(Integer id) {
        return null;
    }

    @Override
    public Press findBy(String fieldName, Object value) throws TooManyResultsException {
        return null;
    }

    @Override
    public List<Press> findByIds(String ids) {
        return null;
    }

    @Override
    public List<Press> findByCondition(Condition condition) {
        return null;
    }

    @Override
    public List<Press> findAll() {
        return null;
    }
}
