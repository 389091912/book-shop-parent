package com.team.service.impl;


import com.team.core.AbstractService;
import com.team.dao.RoleMapper;
import com.team.pojo.Role;
import com.team.service.RoleService;
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
public class RoleServiceImpl extends AbstractService<Role> implements RoleService {
    @Resource
    private RoleMapper tRoleMapper;


    @Override
    public void save(Role model) {

    }

    @Override
    public void save(List<Role> models) {

    }

    @Override
    public void deleteById(Integer id) {

    }

    @Override
    public void deleteByIds(String ids) {

    }

    @Override
    public void update(Role model) {

    }

    @Override
    public Role findById(Integer id) {
        return null;
    }

    @Override
    public Role findBy(String fieldName, Object value) throws TooManyResultsException {
        return null;
    }

    @Override
    public List<Role> findByIds(String ids) {
        return null;
    }

    @Override
    public List<Role> findByCondition(Condition condition) {
        return null;
    }

    @Override
    public List<Role> findAll() {
        return null;
    }
}
