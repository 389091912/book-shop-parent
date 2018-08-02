package com.team.web.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.team.core.Result;
import com.team.core.ResultGenerator;
import com.team.pojo.BookSupplier;
import com.team.service.BookSupplierService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
* Created by CodeGenerator on 2018/08/01.
*/
@RestController
@RequestMapping("/book/supplier")
public class BookSupplierController {
    @Resource
    private BookSupplierService bookSupplierService;

    @PostMapping
    public Result add(@RequestBody BookSupplier bookSupplier) {
        bookSupplierService.save(bookSupplier);
        return ResultGenerator.genSuccessResult();
    }

    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Integer id) {
        bookSupplierService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PutMapping
    public Result update(@RequestBody BookSupplier bookSupplier) {
        bookSupplierService.update(bookSupplier);
        return ResultGenerator.genSuccessResult();
    }

    @GetMapping("/{id}")
    public Result detail(@PathVariable Integer id) {
        BookSupplier bookSupplier = bookSupplierService.findById(id);
        return ResultGenerator.genSuccessResult(bookSupplier);
    }

    @GetMapping
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<BookSupplier> list = bookSupplierService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
