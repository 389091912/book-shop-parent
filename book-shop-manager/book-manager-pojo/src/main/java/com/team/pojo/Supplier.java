package com.team.pojo;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Table(name = "t_supplier")
public class Supplier implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 供货商名称
     */
    private String name;

    /**
     * 是否启用
     */
    private Integer flag;

    /**
     * 联系人
     */
    private String linkman;

    /**
     * 联系电话
     */
    private String phone;

    /**
     * 入驻日期
     */
    private Date createtime;

    /**
     * 简介
     */
    private String info;

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
     * 获取供货商名称
     *
     * @return name - 供货商名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置供货商名称
     *
     * @param name 供货商名称
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
     * 获取联系人
     *
     * @return linkman - 联系人
     */
    public String getLinkman() {
        return linkman;
    }

    /**
     * 设置联系人
     *
     * @param linkman 联系人
     */
    public void setLinkman(String linkman) {
        this.linkman = linkman;
    }

    /**
     * 获取联系电话
     *
     * @return phone - 联系电话
     */
    public String getPhone() {
        return phone;
    }

    /**
     * 设置联系电话
     *
     * @param phone 联系电话
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * 获取入驻日期
     *
     * @return createtime - 入驻日期
     */
    public Date getCreatetime() {
        return createtime;
    }

    /**
     * 设置入驻日期
     *
     * @param createtime 入驻日期
     */
    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    /**
     * 获取简介
     *
     * @return info - 简介
     */
    public String getInfo() {
        return info;
    }

    /**
     * 设置简介
     *
     * @param info 简介
     */
    public void setInfo(String info) {
        this.info = info;
    }
}