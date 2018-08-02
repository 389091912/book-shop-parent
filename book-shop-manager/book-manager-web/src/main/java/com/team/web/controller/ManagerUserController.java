package com.team.web.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.team.core.Result;
import com.team.core.ResultGenerator;
import com.team.pojo.ManagerUser;
import com.team.service.ManagerUserService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
* Created by CodeGenerator on 2018/08/01.
*/
@RestController
@RequestMapping("/manager/user")
public class ManagerUserController {
    @Resource
    private ManagerUserService managerUserService;

    @PostMapping
    public Result add(@RequestBody ManagerUser managerUser) {
        managerUserService.save(managerUser);
        return ResultGenerator.genSuccessResult();
    }

    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Integer id) {
        managerUserService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PutMapping
    public Result update(@RequestBody ManagerUser managerUser) {
        managerUserService.update(managerUser);
        return ResultGenerator.genSuccessResult();
    }

    @GetMapping("/{id}")
    public Result detail(@PathVariable Integer id) {
        ManagerUser managerUser = managerUserService.findById(id);
        return ResultGenerator.genSuccessResult(managerUser);
    }

    @GetMapping
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<ManagerUser> list = managerUserService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
