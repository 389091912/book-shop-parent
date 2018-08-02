package com.team.pojo;

import javax.persistence.*;
import java.io.Serializable;

@Table(name = "t_province")
public class Province implements Serializable {
    /**
     * 国家表主键
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 国家名称
     */
    private String name;

    /**
     * 是否启用
     */
    private Integer flag;

    private Integer type;

    /**
     * 获取国家表主键
     *
     * @return id - 国家表主键
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置国家表主键
     *
     * @param id 国家表主键
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取国家名称
     *
     * @return name - 国家名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置国家名称
     *
     * @param name 国家名称
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