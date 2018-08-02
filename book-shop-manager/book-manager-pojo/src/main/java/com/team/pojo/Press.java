package com.team.pojo;

import javax.persistence.*;
import java.io.Serializable;

@Table(name = "t_press")
public class Press implements Serializable {
    /**
     * 主键
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 出版社名称
     */
    private String name;

    /**
     * 是否启用
     */
    private Integer flag;

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
     * 获取出版社名称
     *
     * @return name - 出版社名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置出版社名称
     *
     * @param name 出版社名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取是否启用
     *
     * @return flag - 是否启用
     */
    public Integer getFlag() {
        return flag;
    }

    /**
     * 设置是否启用
     *
     * @param flag 是否启用
     */
    public void setFlag(Integer flag) {
        this.flag = flag;
    }
}