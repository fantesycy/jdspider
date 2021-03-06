package com.fantesycy.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by chen.yi on 2017/7/18 0018.
 */
@Entity
public class GoodsInfo {

    @Id
    @GeneratedValue
    private Integer id;

    private String goodsId;

    private String goodsName;

    private String imgUrl;

    private String goodsPrice;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(String goodsId) {
        this.goodsId = goodsId;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getGoodsPrice() {
        return goodsPrice;
    }

    public void setGoodsPrice(String goodsPrice) {
        this.goodsPrice = goodsPrice;
    }

    public GoodsInfo(Integer id,String goodsId, String goodsName, String imgUrl, String goodsPrice) {
        super();
        this.id = id;
        this.goodsId = goodsId;
        this.goodsName = goodsName;
        this.imgUrl = imgUrl;
        this.goodsPrice = goodsPrice;
    }

}
