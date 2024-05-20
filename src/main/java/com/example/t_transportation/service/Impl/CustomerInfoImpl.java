package com.example.t_transportation.service.Impl;

import com.example.t_transportation.entity.CustomerInfo;
import com.example.t_transportation.mapper.CustomersMapper;
import com.example.t_transportation.service.CustomerInfoService;
import com.example.t_transportation.util.PageBean;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Map;


@Service
public class CustomerInfoImpl implements CustomerInfoService {

    @Autowired
    private CustomersMapper customersMapper;


    @Override
    public void add(CustomerInfo customerInfo) {
        customersMapper.add(customerInfo);
    }

    @Override
    public void delete(CustomerInfo customerInfo) {
        customersMapper.delete(customerInfo);
    }

    @Override
    public void update(CustomerInfo customerInfo) {
        customersMapper.update(customerInfo);
    }

    @Override
    public PageBean<CustomerInfo> list(Integer pageNum, Integer pageSize, Integer id, String customersName) {
        //创建PageBean对象
        PageBean<CustomerInfo> pb = new PageBean<>();
        //分页查询，用PageHelper插件
        PageHelper.startPage(pageNum,pageSize);
        //不需要传入pageNum,pageSize参数，数据库查询时会自动调用做limit限制

        List<CustomerInfo> as = customersMapper.list(id, customersName);

        // 获取分页信息和数据
        PageInfo<CustomerInfo> pageInfo = new PageInfo<>(as);
        //把全部数据填充到PageBean中
                pb.setTotal(pageInfo.getTotal());
                pb.setItems(pageInfo.getList());
                return pb;

    }


    @Override
    public List<String> query(Integer id) {
       return customersMapper.query(id);
    }
}
