package com.team.pojo;

import javax.persistence.*;
import java.io.Serializable;

@Table(name = "t_city")
public class City implements Serializable {
    /**
     * 城市表主键
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 城市名称
     */
    private String name;

    /**
     * 是否启用
     */
    private Integer flag;

    /**
     * 所属国家外键
     */
    private Integer countryid;

    private Integer type;

    /**
     * 获取城市表主键
     *
     * @return id - 城市表主键
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置城市表主键
     *
     * @param id 城市表主键
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取城市名称
     *
     * @return name - 城市名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置城市名称
     *
     * @param name 城市名称
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

    /**
     * 获取所属国家外键
     *
     * @return countryid - 所属国家外键
     */
    public Integer getCountryid() {
        return countryid;
    }

    /**
     * 设置所属国家外键
     *
     * @param countryid 所属国家外键
     */
    public void setCountryid(Integer countryid) {
        this.countryid = countryid;
    }

    /**
     * @return type
     */
    public Integer getType() {
        return type;
    }

    /**
     * @param type
     */
    public void setType(Integer type) {
        this.type = type;
    }
}