package com.example.t_transportation.service.Impl;

import com.example.t_transportation.entity.Admin;
import com.example.t_transportation.mapper.AdminMapper;
import com.example.t_transportation.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminServiceImpl implements AdminService {

    @Autowired
    private AdminMapper adminMapper;

    @Override
    public  void register(String zhanghao, String mima) {
        adminMapper.add(zhanghao,mima);

    }

    @Override
    public  Admin findAdmin(String zhanghao) {
         Admin u= adminMapper.findAdmin(zhanghao);
      return u;
    }
}
