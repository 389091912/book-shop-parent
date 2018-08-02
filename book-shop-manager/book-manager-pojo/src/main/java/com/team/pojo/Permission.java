package com.team.pojo;

import javax.persistence.*;
import java.io.Serializable;

@Table(name = "t_permission")
public class Permission implements Serializable {
    /**
     * 主键
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 权限名称
     */
    private String name;

    /**
     * 父权限ID
     */
    private Integer parentid;

    /**
     * shiro所需的操作名称
     */
    private String sname;

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
     * 获取权限名称
     *
     * @return name - 权限名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置权限名称
     *
     * @param name 权限名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取父权限ID
     *
     * @return parentid - 父权限ID
     */
    public Integer getParentid() {
        return parentid;
    }

    /**
     * 设置父权限ID
     *
     * @param parentid 父权限ID
     */
    public void setParentid(Integer parentid) {
        this.parentid = parentid;
    }

    /**
     * 获取shiro所需的操作名称
     *
     * @return sname - shiro所需的操作名称
     */
    public String getSname() {
        return sname;
    }

    /**
     * 设置shiro所需的操作名称
     *
     * @param sname shiro所需的操作名称
     */
    public void setSname(String sname) {
        this.sname = sname;
    }
}