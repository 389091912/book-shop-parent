package com.team.service.impl;

import com.team.core.AbstractService;
import com.team.dao.PermissionMapper;
import com.team.pojo.Permission;
import com.team.service.PermissionService;
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
public class PermissionServiceImpl extends AbstractService<Permission> implements PermissionService {
    @Resource
    private PermissionMapper permissionMapper;

    @Override
    public void save(Permission model) {

    }

    @Override
    public void save(List<Permission> models) {

    }

    @Override
    public void deleteById(Integer id) {

    }

    @Override
    public void deleteByIds(String ids) {

    }

    @Override
    public void update(Permission model) {

    }

    @Override
    public Permission findById(Integer id) {
        return null;
    }

    @Override
    public Permission findBy(String fieldName, Object value) throws TooManyResultsException {
        return null;
    }

    @Override
    public List<Permission> findByIds(String ids) {
        return null;
    }

    @Override
    public List<Permission> findByCondition(Condition condition) {
        return null;
    }

    @Override
    public List<Permission> findAll() {
        return null;
    }
}
