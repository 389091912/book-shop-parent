package com.team.pojo;

import javax.persistence.*;
import java.io.Serializable;

@Table(name = "t_book_type")
public class BookType implements Serializable {
    /**
     * 类型主键
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 类型名称
     */
    private String typetext;

    /**
     * 父类型ID
     */
    private Integer pid;

    /**
     * 获取类型主键
     *
     * @return id - 类型主键
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置类型主键
     *
     * @param id 类型主键
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取类型名称
     *
     * @return typetext - 类型名称
     */
    public String getTypetext() {
        return typetext;
    }

    /**
     * 设置类型名称
     *
     * @param typetext 类型名称
     */
    public void setTypetext(String typetext) {
        this.typetext = typetext;
    }

    /**
     * 获取父类型ID
     *
     * @return pid - 父类型ID
     */
    public Integer getPid() {
        return pid;
    }

    /**
     * 设置父类型ID
     *
     * @param pid 父类型ID
     */
    public void setPid(Integer pid) {
        this.pid = pid;
    }
}