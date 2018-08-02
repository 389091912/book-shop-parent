package com.team.service.impl;

import com.team.core.AbstractService;
import com.team.dao.UserMapper;
import com.team.pojo.User;
import com.team.service.UserService;
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
public class UserServiceImpl extends AbstractService<User> implements UserService {
    @Resource
    private UserMapper tUserMapper;

    @Override
    public void save(User model) {

    }

    @Override
    public void save(List<User> models) {

    }

    @Override
    public void deleteById(Integer id) {

    }

    @Override
    public void deleteByIds(String ids) {

    }

    @Override
    public void update(User model) {

    }

    @Override
    public User findById(Integer id) {
        return null;
    }

    @Override
    public User findBy(String fieldName, Object value) throws TooManyResultsException {
        return null;
    }

    @Override
    public List<User> findByIds(String ids) {
        return null;
    }

    @Override
    public List<User> findByCondition(Condition condition) {
        return null;
    }

    @Override
    public List<User> findAll() {
        return null;
    }
}
