package com.team.service.impl;

import com.team.core.AbstractService;
import com.team.dao.CommentMapper;
import com.team.pojo.Comment;
import com.team.service.CommentService;
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
public class CommentServiceImpl extends AbstractService<Comment> implements CommentService {
    @Resource
    private CommentMapper tCommentMapper;

    @Override
    public void save(Comment model) {

    }

    @Override
    public void save(List<Comment> models) {

    }

    @Override
    public void deleteById(Integer id) {

    }

    @Override
    public void deleteByIds(String ids) {

    }

    @Override
    public void update(Comment model) {

    }

    @Override
    public Comment findById(Integer id) {
        return null;
    }

    @Override
    public Comment findBy(String fieldName, Object value) throws TooManyResultsException {
        return null;
    }

    @Override
    public List<Comment> findByIds(String ids) {
        return null;
    }

    @Override
    public List<Comment> findByCondition(Condition condition) {
        return null;
    }

    @Override
    public List<Comment> findAll() {
        return null;
    }
}
