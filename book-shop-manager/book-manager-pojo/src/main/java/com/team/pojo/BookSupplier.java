package com.team.pojo;

import javax.persistence.*;
import java.io.Serializable;

@Table(name = "t_book_supplier")
public class BookSupplier implements Serializable {
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
     * 供货商ID
     */
    private Integer supplierid;

    /**
     * 销售数量
     */
    private Integer sellnum;

    /**
     * 数量
     */
    private Integer number;

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
     * 获取供货商ID
     *
     * @return supplierid - 供货商ID
     */
    public Integer getSupplierid() {
        return supplierid;
    }

    /**
     * 设置供货商ID
     *
     * @param supplierid 供货商ID
     */
    public void setSupplierid(Integer supplierid) {
        this.supplierid = supplierid;
    }

    /**
     * 获取销售数量
     *
     * @return sellnum - 销售数量
     */
    public Integer getSellnum() {
        return sellnum;
    }

    /**
     * 设置销售数量
     *
     * @param sellnum 销售数量
     */
    public void setSellnum(Integer sellnum) {
        this.sellnum = sellnum;
    }

    /**
     * 获取数量
     *
     * @return number - 数量
     */
    public Integer getNumber() {
        return number;
    }

    /**
     * 设置数量
     *
     * @param number 数量
     */
    public void setNumber(Integer number) {
        this.number = number;
    }
}