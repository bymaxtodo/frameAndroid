package com.arlen.frame.db.database;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT. Enable "keep" sections if you want to edit. 
/**
 * Entity mapped to table "ProductTable".
 */
public class ProductTable {

    private Long id;
    private String productName;
    private String updateTime;

    public ProductTable() {
    }

    public ProductTable(Long id) {
        this.id = id;
    }

    public ProductTable(Long id, String productName, String updateTime) {
        this.id = id;
        this.productName = productName;
        this.updateTime = updateTime;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

}
