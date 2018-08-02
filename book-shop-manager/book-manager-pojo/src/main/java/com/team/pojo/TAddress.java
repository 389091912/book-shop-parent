package com.team.pojo;

import javax.persistence.*;
import java.io.Serializable;

@Table(name = "t_address")
public class TAddress implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 省份名称
     */
    private String provincetext;

    /**
     * 城市名称
     */
    private String citytext;

    /**
     * 县区名称
     */
    private String regiontext;

    /**
     * 具体地址
     */
    private String address;

    /**
     * 用户ID
     */
    private Integer userid;

    /**
     * 联系电话
     */
    private String phone;

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
     * 获取省份名称
     *
     * @return provincetext - 省份名称
     */
    public String getProvincetext() {
        return provincetext;
    }

    /**
     * 设置省份名称
     *
     * @param provincetext 省份名称
     */
    public void setProvincetext(String provincetext) {
        this.provincetext = provincetext;
    }

    /**
     * 获取城市名称
     *
     * @return citytext - 城市名称
     */
    public String getCitytext() {
        return citytext;
    }

    /**
     * 设置城市名称
     *
     * @param citytext 城市名称
     */
    public void setCitytext(String citytext) {
        this.citytext = citytext;
    }

    /**
     * 获取县区名称
     *
     * @return regiontext - 县区名称
     */
    public String getRegiontext() {
        return regiontext;
    }

    /**
     * 设置县区名称
     *
     * @param regiontext 县区名称
     */
    public void setRegiontext(String regiontext) {
        this.regiontext = regiontext;
    }

    /**
     * 获取具体地址
     *
     * @return address - 具体地址
     */
    public String getAddress() {
        return address;
    }

    /**
     * 设置具体地址
     *
     * @param address 具体地址
     */
    public void setAddress(String address) {
        this.address = address;
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
}