package com.team.service.impl;

import com.team.core.AbstractService;
import com.team.dao.ExamineMapper;
import com.team.pojo.Examine;
import com.team.service.ExamineService;
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
public class ExamineServiceImpl extends AbstractService<Examine> implements ExamineService {
    @Resource
    private ExamineMapper tExamineMapper;

    @Override
    public void save(Examine model) {

    }

    @Override
    public void save(List<Examine> models) {

    }

    @Override
    public void deleteById(Integer id) {

    }

    @Override
    public void deleteByIds(String ids) {

    }

    @Override
    public void update(Examine model) {

    }

    @Override
    public Examine findById(Integer id) {
        return null;
    }

    @Override
    public Examine findBy(String fieldName, Object value) throws TooManyResultsException {
        return null;
    }

    @Override
    public List<Examine> findByIds(String ids) {
        return null;
    }

    @Override
    public List<Examine> findByCondition(Condition condition) {
        return null;
    }

    @Override
    public List<Examine> findAll() {
        return null;
    }
}
