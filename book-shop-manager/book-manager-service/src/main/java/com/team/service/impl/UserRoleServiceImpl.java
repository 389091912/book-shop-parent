package com.team.service.impl;

import com.team.core.AbstractService;
import com.team.dao.UserRoleMapper;
import com.team.pojo.UserRole;
import com.team.service.UserRoleService;
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
public class UserRoleServiceImpl extends AbstractService<UserRole> implements UserRoleService {
    @Resource
    private UserRoleMapper tUserRoleMapper;

    @Override
    public void save(UserRole model) {

    }

    @Override
    public void save(List<UserRole> models) {

    }

    @Override
    public void deleteById(Integer id) {

    }

    @Override
    public void deleteByIds(String ids) {

    }

    @Override
    public void update(UserRole model) {

    }

    @Override
    public UserRole findById(Integer id) {
        return null;
    }

    @Override
    public UserRole findBy(String fieldName, Object value) throws TooManyResultsException {
        return null;
    }

    @Override
    public List<UserRole> findByIds(String ids) {
        return null;
    }

    @Override
    public List<UserRole> findByCondition(Condition condition) {
        return null;
    }

    @Override
    public List<UserRole> findAll() {
        return null;
    }
}
