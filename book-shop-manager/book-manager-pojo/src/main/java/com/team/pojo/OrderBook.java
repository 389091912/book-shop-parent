package com.team.pojo;

import javax.persistence.*;
import java.io.Serializable;

@Table(name = "t_order_book")
public class OrderBook implements Serializable {
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
     * 订单ID
     */
    private Integer orderid;

    /**
     * 购买数量
     */
    private Integer num;

    /**
     * 价格
     */
    private Float price;

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
     * 获取订单ID
     *
     * @return orderid - 订单ID
     */
    public Integer getOrderid() {
        return orderid;
    }

    /**
     * 设置订单ID
     *
     * @param orderid 订单ID
     */
    public void setOrderid(Integer orderid) {
        this.orderid = orderid;
    }

    /**
     * 获取购买数量
     *
     * @return num - 购买数量
     */
    public Integer getNum() {
        return num;
    }

    /**
     * 设置购买数量
     *
     * @param num 购买数量
     */
    public void setNum(Integer num) {
        this.num = num;
    }

    /**
     * 获取价格
     *
     * @return price - 价格
     */
    public Float getPrice() {
        return price;
    }

    /**
     * 设置价格
     *
     * @param price 价格
     */
    public void setPrice(Float price) {
        this.price = price;
    }
}