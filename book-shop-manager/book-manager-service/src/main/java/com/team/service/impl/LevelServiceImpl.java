package com.team.service.impl;

import com.team.core.AbstractService;
import com.team.dao.LevelMapper;
import com.team.pojo.Level;
import com.team.service.LevelService;
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
public class LevelServiceImpl extends AbstractService<Level> implements LevelService {
    @Resource
    private LevelMapper tLevelMapper;

    @Override
    public void save(Level model) {

    }

    @Override
    public void save(List<Level> models) {

    }

    @Override
    public void deleteById(Integer id) {

    }

    @Override
    public void deleteByIds(String ids) {

    }

    @Override
    public void update(Level model) {

    }

    @Override
    public Level findById(Integer id) {
        return null;
    }

    @Override
    public Level findBy(String fieldName, Object value) throws TooManyResultsException {
        return null;
    }

    @Override
    public List<Level> findByIds(String ids) {
        return null;
    }

    @Override
    public List<Level> findByCondition(Condition condition) {
        return null;
    }

    @Override
    public List<Level> findAll() {
        return null;
    }
}
