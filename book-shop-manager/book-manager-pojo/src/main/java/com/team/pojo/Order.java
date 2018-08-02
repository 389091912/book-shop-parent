package com.team.pojo;

import javax.persistence.*;
import java.io.Serializable;

@Table(name = "t_order")
public class Order implements Serializable {
    /**
     * 订单表主键
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 订单号码
     */
    private String no;

    /**
     * 支付宝单号
     */
    private String alipayno;

    /**
     * 用户ID
     */
    private Integer userid;

    /**
     * 地址ID
     */
    private Integer addressid;

    /**
     * 订单备注
     */
    private String info;

    /**
     * 结算价
     */
    private Float price;

    /**
     * 是否支付
     */
    private Integer flag;

    /**
     * 获取订单表主键
     *
     * @return id - 订单表主键
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置订单表主键
     *
     * @param id 订单表主键
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取订单号码
     *
     * @return no - 订单号码
     */
    public String getNo() {
        return no;
    }

    /**
     * 设置订单号码
     *
     * @param no 订单号码
     */
    public void setNo(String no) {
        this.no = no;
    }

    /**
     * 获取支付宝单号
     *
     * @return alipayno - 支付宝单号
     */
    public String getAlipayno() {
        return alipayno;
    }

    /**
     * 设置支付宝单号
     *
     * @param alipayno 支付宝单号
     */
    public void setAlipayno(String alipayno) {
        this.alipayno = alipayno;
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
     * 获取地址ID
     *
     * @return addressid - 地址ID
     */
    public Integer getAddressid() {
        return addressid;
    }

    /**
     * 设置地址ID
     *
     * @param addressid 地址ID
     */
    public void setAddressid(Integer addressid) {
        this.addressid = addressid;
    }

    /**
     * 获取订单备注
     *
     * @return info - 订单备注
     */
    public String getInfo() {
        return info;
    }

    /**
     * 设置订单备注
     *
     * @param info 订单备注
     */
    public void setInfo(String info) {
        this.info = info;
    }

    /**
     * 获取结算价
     *
     * @return price - 结算价
     */
    public Float getPrice() {
        return price;
    }

    /**
     * 设置结算价
     *
     * @param price 结算价
     */
    public void setPrice(Float price) {
        this.price = price;
    }

    /**
     * 获取是否支付
     *
     * @return flag - 是否支付
     */
    public Integer getFlag() {
        return flag;
    }

    /**
     * 设置是否支付
     *
     * @param flag 是否支付
     */
    public void setFlag(Integer flag) {
        this.flag = flag;
    }
}