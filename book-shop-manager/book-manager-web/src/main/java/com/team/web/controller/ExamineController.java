package com.team.web.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.team.core.Result;
import com.team.core.ResultGenerator;
import com.team.pojo.Examine;
import com.team.service.ExamineService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
* Created by CodeGenerator on 2018/08/01.
*/
@RestController
@RequestMapping("/examine")
public class ExamineController {
    @Resource
    private ExamineService examineService;

    @PostMapping
    public Result add(@RequestBody Examine examine) {
        examineService.save(examine);
        return ResultGenerator.genSuccessResult();
    }

    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Integer id) {
        examineService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PutMapping
    public Result update(@RequestBody Examine examine) {
        examineService.update(examine);
        return ResultGenerator.genSuccessResult();
    }

    @GetMapping("/{id}")
    public Result detail(@PathVariable Integer id) {
        Examine examine = examineService.findById(id);
        return ResultGenerator.genSuccessResult(examine);
    }

    @GetMapping
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<Examine> list = examineService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
