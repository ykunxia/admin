package com.example.t_transportation.service;

import com.example.t_transportation.entity.CustomerInfo;
import com.example.t_transportation.util.PageBean;

import java.util.List;

public interface CustomerInfoService {
    //删除客户信息
    void delete(CustomerInfo customerInfo) ;

    //添加客户信息
    void add(CustomerInfo customerInfo);

    //更新客户信息
    void update(CustomerInfo customerInfo);

    //所有查询
    List<String> query(Integer id);



    //条件分页列表查询

   PageBean<CustomerInfo> list(Integer pageNum, Integer pageSize, Integer id, String customersName);

}
   
