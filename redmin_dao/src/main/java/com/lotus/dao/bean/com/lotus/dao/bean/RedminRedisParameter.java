package com.lotus.dao.bean;

import java.util.Date;

public class RedminRedisParameter {
    private Integer id;

    private String key;

    private String value;

    private Boolean type;

    private String desc;

    private String category;

    private Date createTime;

    private Date updayeTime;

    private Date expireTime;

    private Boolean status;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key == null ? null : key.trim();
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value == null ? null : value.trim();
    }

    public Boolean getType() {
        return type;
    }

    public void setType(Boolean type) {
        this.type = type;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc == null ? null : desc.trim();
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category == null ? null : category.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdayeTime() {
        return updayeTime;
    }

    public void setUpdayeTime(Date updayeTime) {
        this.updayeTime = updayeTime;
    }

    public Date getExpireTime() {
        return expireTime;
    }

    public void setExpireTime(Date expireTime) {
        this.expireTime = expireTime;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }
}