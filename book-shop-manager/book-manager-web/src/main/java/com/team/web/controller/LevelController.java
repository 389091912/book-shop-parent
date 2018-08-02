package com.team.web.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.team.core.Result;
import com.team.core.ResultGenerator;
import com.team.pojo.Level;
import com.team.service.LevelService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
* Created by CodeGenerator on 2018/08/01.
*/
@RestController
@RequestMapping("/level")
public class LevelController {
    @Resource
    private LevelService levelService;

    @PostMapping
    public Result add(@RequestBody Level level) {
        levelService.save(level);
        return ResultGenerator.genSuccessResult();
    }

    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Integer id) {
        levelService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PutMapping
    public Result update(@RequestBody Level level) {
        levelService.update(level);
        return ResultGenerator.genSuccessResult();
    }

    @GetMapping("/{id}")
    public Result detail(@PathVariable Integer id) {
        Level level = levelService.findById(id);
        return ResultGenerator.genSuccessResult(level);
    }

    @GetMapping
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<Level> list = levelService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
