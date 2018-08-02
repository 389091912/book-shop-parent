package com.team.service.impl;

import com.team.core.AbstractService;
import com.team.dao.RolePermissionMapper;
import com.team.pojo.RolePermission;
import com.team.service.RolePermissionService;
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
public class RolePermissionServiceImpl extends AbstractService<RolePermission> implements RolePermissionService {
    @Resource
    private RolePermissionMapper tRolePermissionMapper;

    @Override
    public void save(RolePermission model) {

    }

    @Override
    public void save(List<RolePermission> models) {

    }

    @Override
    public void deleteById(Integer id) {

    }

    @Override
    public void deleteByIds(String ids) {

    }

    @Override
    public void update(RolePermission model) {

    }

    @Override
    public RolePermission findById(Integer id) {
        return null;
    }

    @Override
    public RolePermission findBy(String fieldName, Object value) throws TooManyResultsException {
        return null;
    }

    @Override
    public List<RolePermission> findByIds(String ids) {
        return null;
    }

    @Override
    public List<RolePermission> findByCondition(Condition condition) {
        return null;
    }

    @Override
    public List<RolePermission> findAll() {
        return null;
    }
}
