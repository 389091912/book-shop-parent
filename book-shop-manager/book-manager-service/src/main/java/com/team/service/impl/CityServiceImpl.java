package com.team.service.impl;

import com.team.core.AbstractService;
import com.team.dao.CityMapper;
import com.team.pojo.City;
import com.team.service.CityService;
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
public class CityServiceImpl extends AbstractService<City> implements CityService {
    @Resource
    private CityMapper tCityMapper;

    @Override
    public void save(City model) {

    }

    @Override
    public void save(List<City> models) {

    }

    @Override
    public void deleteById(Integer id) {

    }

    @Override
    public void deleteByIds(String ids) {

    }

    @Override
    public void update(City model) {

    }

    @Override
    public City findById(Integer id) {
        return null;
    }

    @Override
    public City findBy(String fieldName, Object value) throws TooManyResultsException {
        return null;
    }

    @Override
    public List<City> findByIds(String ids) {
        return null;
    }

    @Override
    public List<City> findByCondition(Condition condition) {
        return null;
    }

    @Override
    public List<City> findAll() {
        return null;
    }
}
