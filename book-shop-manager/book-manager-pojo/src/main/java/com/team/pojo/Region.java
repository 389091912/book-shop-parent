package com.team.pojo;

import javax.persistence.*;
import java.io.Serializable;

@Table(name = "t_region")
public class Region implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 县区名称
     */
    private String name;

    private Integer flag;

    /**
     * 首字母分类
     */
    private Integer type;

    /**
     * 城市外键
     */
    private Integer cityid;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取县区名称
     *
     * @return name - 县区名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置县区名称
     *
     * @param name 县区名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return flag
     */
    public Integer getFlag() {
        return flag;
    }

    /**
     * @param flag
     */
    public void setFlag(Integer flag) {
        this.flag = flag;
    }

    /**
     * 获取首字母分类
     *
     * @return type - 首字母分类
     */
    public Integer getType() {
        return type;
    }

    /**
     * 设置首字母分类
     *
     * @param type 首字母分类
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * 获取城市外键
     *
     * @return cityid - 城市外键
     */
    public Integer getCityid() {
        return cityid;
    }

    /**
     * 设置城市外键
     *
     * @param cityid 城市外键
     */
    public void setCityid(Integer cityid) {
        this.cityid = cityid;
    }
}