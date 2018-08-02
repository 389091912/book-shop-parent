package com.team.service.impl;

import com.team.core.AbstractService;
import com.team.dao.ManagerUserMapper;
import com.team.pojo.ManagerUser;
import com.team.service.ManagerUserService;
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
public class ManagerUserServiceImpl extends AbstractService<ManagerUser> implements ManagerUserService {
    @Resource
    private ManagerUserMapper tManagerUserMapper;

    @Override
    public void save(ManagerUser model) {

    }

    @Override
    public void save(List<ManagerUser> models) {

    }

    @Override
    public void deleteById(Integer id) {

    }

    @Override
    public void deleteByIds(String ids) {

    }

    @Override
    public void update(ManagerUser model) {

    }

    @Override
    public ManagerUser findById(Integer id) {
        return null;
    }

    @Override
    public ManagerUser findBy(String fieldName, Object value) throws TooManyResultsException {
        return null;
    }

    @Override
    public List<ManagerUser> findByIds(String ids) {
        return null;
    }

    @Override
    public List<ManagerUser> findByCondition(Condition condition) {
        return null;
    }

    @Override
    public List<ManagerUser> findAll() {
        return null;
    }
}
