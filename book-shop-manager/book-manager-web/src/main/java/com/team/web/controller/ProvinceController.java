package com.team.web.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.team.core.Result;
import com.team.core.ResultGenerator;
import com.team.pojo.Province;
import com.team.service.ProvinceService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
* Created by CodeGenerator on 2018/08/01.
*/
@RestController
@RequestMapping("/province")
public class ProvinceController {
    @Resource
    private ProvinceService provinceService;

    @PostMapping
    public Result add(@RequestBody Province province) {
        provinceService.save(province);
        return ResultGenerator.genSuccessResult();
    }

    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Integer id) {
        provinceService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PutMapping
    public Result update(@RequestBody Province province) {
        provinceService.update(province);
        return ResultGenerator.genSuccessResult();
    }

    @GetMapping("/{id}")
    public Result detail(@PathVariable Integer id) {
        Province province = provinceService.findById(id);
        return ResultGenerator.genSuccessResult(province);
    }

    @GetMapping
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<Province> list = provinceService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
