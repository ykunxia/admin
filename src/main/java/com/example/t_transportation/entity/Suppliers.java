package com.example.t_transportation.entity;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

public class Suppliers {
    private Integer id;//主键
    private String suppliersName;//供应商
    private String materialsName;//提供的材料
    private BigDecimal materialsTotalPrice;//材料的总金额
    private String contact;//供应商联系方式
    private String email;//供应商的email

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSuppliersName() {
        return suppliersName;
    }

    public void setSuppliersName(String suppliersName) {
        this.suppliersName = suppliersName;
    }

    public String getMaterialsName() {
        return materialsName;
    }

    public void setMaterialsName(String materialsName) {
        this.materialsName = materialsName;
    }

    public BigDecimal getMaterialsTotalPrice() {
        return materialsTotalPrice;
    }

    public void setMaterialsTotalPrice(BigDecimal materialsTotalPrice) {
        this.materialsTotalPrice = materialsTotalPrice;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
