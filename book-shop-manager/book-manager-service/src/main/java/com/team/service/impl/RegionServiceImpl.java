package com.team.service.impl;

import com.team.core.AbstractService;
import com.team.dao.RegionMapper;
import com.team.pojo.Region;
import com.team.service.RegionService;
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
public class RegionServiceImpl extends AbstractService<Region> implements RegionService {
    @Resource
    private RegionMapper tRegionMapper;

    @Override
    public void save(Region model) {

    }

    @Override
    public void save(List<Region> models) {

    }

    @Override
    public void deleteById(Integer id) {

    }

    @Override
    public void deleteByIds(String ids) {

    }

    @Override
    public void update(Region model) {

    }

    @Override
    public Region findById(Integer id) {
        return null;
    }

    @Override
    public Region findBy(String fieldName, Object value) throws TooManyResultsException {
        return null;
    }

    @Override
    public List<Region> findByIds(String ids) {
        return null;
    }

    @Override
    public List<Region> findByCondition(Condition condition) {
        return null;
    }

    @Override
    public List<Region> findAll() {
        return null;
    }
}
