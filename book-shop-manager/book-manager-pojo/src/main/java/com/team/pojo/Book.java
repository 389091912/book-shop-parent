package com.team.pojo;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Table(name = "t_book")
public class Book implements Serializable {
    /**
     * 书籍主键
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 书籍名称
     */
    private String bookname;

    /**
     * 作者
     */
    private String author;

    /**
     * 出版日期
     */
    private Date publishdate;

    /**
     * 团购价
     */
    private Double groupprice;

    /**
     * 单价
     */
    private Double price;

    /**
     * 开本
     */
    private String format;

    /**
     * 页数
     */
    private String pagenumber;

    /**
     * ISBN
     */
    @Column(name = "ISBN")
    private String isbn;

    /**
     * 条形码
     */
    private String barcode;

    /**
     * 版次
     */
    private Integer layout;

    /**
     * 印刷次数
     */
    private Integer printingnumber;

    /**
     * 册数
     */
    private String register;

    /**
     * 重量
     */
    private String weight;

    /**
     * 书籍类型
     */
    private Integer typeid;

    /**
     * 入库时间
     */
    private Date createtime;

    /**
     * 出版社
     */
    private Integer pressid;

    /**
     * 库存数量
     */
    private Integer number;

    /**
     * 封面图片
     */
    private String imgurl;

    /**
     * 状态
     */
    private Integer flag;

    /**
     * 推荐类型
     */
    private Integer recommend;

    /**
     * 书籍简介
     */
    private String bookintroduce;

    /**
     * 书籍简介
     */
    private String authorintroduce;

    /**
     * 目录
     */
    private String catalog;

    /**
     * 获取书籍主键
     *
     * @return id - 书籍主键
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置书籍主键
     *
     * @param id 书籍主键
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取书籍名称
     *
     * @return bookname - 书籍名称
     */
    public String getBookname() {
        return bookname;
    }

    /**
     * 设置书籍名称
     *
     * @param bookname 书籍名称
     */
    public void setBookname(String bookname) {
        this.bookname = bookname;
    }

    /**
     * 获取作者
     *
     * @return author - 作者
     */
    public String getAuthor() {
        return author;
    }

    /**
     * 设置作者
     *
     * @param author 作者
     */
    public void setAuthor(String author) {
        this.author = author;
    }

    /**
     * 获取出版日期
     *
     * @return publishdate - 出版日期
     */
    public Date getPublishdate() {
        return publishdate;
    }

    /**
     * 设置出版日期
     *
     * @param publishdate 出版日期
     */
    public void setPublishdate(Date publishdate) {
        this.publishdate = publishdate;
    }

    /**
     * 获取团购价
     *
     * @return groupprice - 团购价
     */
    public Double getGroupprice() {
        return groupprice;
    }

    /**
     * 设置团购价
     *
     * @param groupprice 团购价
     */
    public void setGroupprice(Double groupprice) {
        this.groupprice = groupprice;
    }

    /**
     * 获取单价
     *
     * @return price - 单价
     */
    public Double getPrice() {
        return price;
    }

    /**
     * 设置单价
     *
     * @param price 单价
     */
    public void setPrice(Double price) {
        this.price = price;
    }

    /**
     * 获取开本
     *
     * @return format - 开本
     */
    public String getFormat() {
        return format;
    }

    /**
     * 设置开本
     *
     * @param format 开本
     */
    public void setFormat(String format) {
        this.format = format;
    }

    /**
     * 获取页数
     *
     * @return pagenumber - 页数
     */
    public String getPagenumber() {
        return pagenumber;
    }

    /**
     * 设置页数
     *
     * @param pagenumber 页数
     */
    public void setPagenumber(String pagenumber) {
        this.pagenumber = pagenumber;
    }

    /**
     * 获取ISBN
     *
     * @return ISBN - ISBN
     */
    public String getIsbn() {
        return isbn;
    }

    /**
     * 设置ISBN
     *
     * @param isbn ISBN
     */
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    /**
     * 获取条形码
     *
     * @return barcode - 条形码
     */
    public String getBarcode() {
        return barcode;
    }

    /**
     * 设置条形码
     *
     * @param barcode 条形码
     */
    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    /**
     * 获取版次
     *
     * @return layout - 版次
     */
    public Integer getLayout() {
        return layout;
    }

    /**
     * 设置版次
     *
     * @param layout 版次
     */
    public void setLayout(Integer layout) {
        this.layout = layout;
    }

    /**
     * 获取印刷次数
     *
     * @return printingnumber - 印刷次数
     */
    public Integer getPrintingnumber() {
        return printingnumber;
    }

    /**
     * 设置印刷次数
     *
     * @param printingnumber 印刷次数
     */
    public void setPrintingnumber(Integer printingnumber) {
        this.printingnumber = printingnumber;
    }

    /**
     * 获取册数
     *
     * @return register - 册数
     */
    public String getRegister() {
        return register;
    }

    /**
     * 设置册数
     *
     * @param register 册数
     */
    public void setRegister(String register) {
        this.register = register;
    }

    /**
     * 获取重量
     *
     * @return weight - 重量
     */
    public String getWeight() {
        return weight;
    }

    /**
     * 设置重量
     *
     * @param weight 重量
     */
    public void setWeight(String weight) {
        this.weight = weight;
    }

    /**
     * 获取书籍类型
     *
     * @return typeid - 书籍类型
     */
    public Integer getTypeid() {
        return typeid;
    }

    /**
     * 设置书籍类型
     *
     * @param typeid 书籍类型
     */
    public void setTypeid(Integer typeid) {
        this.typeid = typeid;
    }

    /**
     * 获取入库时间
     *
     * @return createtime - 入库时间
     */
    public Date getCreatetime() {
        return createtime;
    }

    /**
     * 设置入库时间
     *
     * @param createtime 入库时间
     */
    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    /**
     * 获取出版社
     *
     * @return pressid - 出版社
     */
    public Integer getPressid() {
        return pressid;
    }

    /**
     * 设置出版社
     *
     * @param pressid 出版社
     */
    public void setPressid(Integer pressid) {
        this.pressid = pressid;
    }

    /**
     * 获取库存数量
     *
     * @return number - 库存数量
     */
    public Integer getNumber() {
        return number;
    }

    /**
     * 设置库存数量
     *
     * @param number 库存数量
     */
    public void setNumber(Integer number) {
        this.number = number;
    }

    /**
     * 获取封面图片
     *
     * @return imgurl - 封面图片
     */
    public String getImgurl() {
        return imgurl;
    }

    /**
     * 设置封面图片
     *
     * @param imgurl 封面图片
     */
    public void setImgurl(String imgurl) {
        this.imgurl = imgurl;
    }

    /**
     * 获取状态
     *
     * @return flag - 状态
     */
    public Integer getFlag() {
        return flag;
    }

    /**
     * 设置状态
     *
     * @param flag 状态
     */
    public void setFlag(Integer flag) {
        this.flag = flag;
    }

    /**
     * 获取推荐类型
     *
     * @return recommend - 推荐类型
     */
    public Integer getRecommend() {
        return recommend;
    }

    /**
     * 设置推荐类型
     *
     * @param recommend 推荐类型
     */
    public void setRecommend(Integer recommend) {
        this.recommend = recommend;
    }

    /**
     * 获取书籍简介
     *
     * @return bookintroduce - 书籍简介
     */
    public String getBookintroduce() {
        return bookintroduce;
    }

    /**
     * 设置书籍简介
     *
     * @param bookintroduce 书籍简介
     */
    public void setBookintroduce(String bookintroduce) {
        this.bookintroduce = bookintroduce;
    }

    /**
     * 获取书籍简介
     *
     * @return authorintroduce - 书籍简介
     */
    public String getAuthorintroduce() {
        return authorintroduce;
    }

    /**
     * 设置书籍简介
     *
     * @param authorintroduce 书籍简介
     */
    public void setAuthorintroduce(String authorintroduce) {
        this.authorintroduce = authorintroduce;
    }

    /**
     * 获取目录
     *
     * @return catalog - 目录
     */
    public String getCatalog() {
        return catalog;
    }

    /**
     * 设置目录
     *
     * @param catalog 目录
     */
    public void setCatalog(String catalog) {
        this.catalog = catalog;
    }
}