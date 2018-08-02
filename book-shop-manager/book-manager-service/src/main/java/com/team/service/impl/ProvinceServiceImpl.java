package com.team.service.impl;

import com.team.core.AbstractService;
import com.team.dao.ProvinceMapper;
import com.team.pojo.Province;
import com.team.service.ProvinceService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2018/08/01.
 */
@Service
@Transactional
public class ProvinceServiceImpl extends AbstractService<Province> implements ProvinceService {
    @Resource
    private ProvinceMapper tProvinceMapper;

}
