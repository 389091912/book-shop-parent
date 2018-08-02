package com.team.pojo;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Table(name = "t_comment")
public class Comment implements Serializable {
    /**
     * 主键
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 书籍ID
     */
    private Integer bookid;

    /**
     * 用户ID
     */
    private Integer userid;

    /**
     * 评论等级
     */
    private Integer level;

    /**
     * 评论日期
     */
    private Date createtime;

    /**
     * 评论详情
     */
    private String info;

    /**
     * 获取主键
     *
     * @return id - 主键
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置主键
     *
     * @param id 主键
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取书籍ID
     *
     * @return bookid - 书籍ID
     */
    public Integer getBookid() {
        return bookid;
    }

    /**
     * 设置书籍ID
     *
     * @param bookid 书籍ID
     */
    public void setBookid(Integer bookid) {
        this.bookid = bookid;
    }

    /**
     * 获取用户ID
     *
     * @return userid - 用户ID
     */
    public Integer getUserid() {
        return userid;
    }

    /**
     * 设置用户ID
     *
     * @param userid 用户ID
     */
    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    /**
     * 获取评论等级
     *
     * @return level - 评论等级
     */
    public Integer getLevel() {
        return level;
    }

    /**
     * 设置评论等级
     *
     * @param level 评论等级
     */
    public void setLevel(Integer level) {
        this.level = level;
    }

    /**
     * 获取评论日期
     *
     * @return createtime - 评论日期
     */
    public Date getCreatetime() {
        return createtime;
    }

    /**
     * 设置评论日期
     *
     * @param createtime 评论日期
     */
    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    /**
     * 获取评论详情
     *
     * @return info - 评论详情
     */
    public String getInfo() {
        return info;
    }

    /**
     * 设置评论详情
     *
     * @param info 评论详情
     */
    public void setInfo(String info) {
        this.info = info;
    }
}