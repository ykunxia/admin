package com.example.t_transportation.service.Impl;

import com.example.t_transportation.entity.Admin;
import com.example.t_transportation.mapper.AdminMapper;
import com.example.t_transportation.service.AdminService;
import com.example.t_transportation.util.ThreadLocalUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Map;

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

    @Override
    public void updateAvatar(String avatarUrl) {
        Map<String,Object> map= ThreadLocalUtil.get();
        Integer id=(Integer) map.get("id");
        adminMapper.updateAvatar(avatarUrl,id);
    }

    @Override
    public void update(Admin admin) {
        admin.setAddTime(LocalDateTime.now());
        adminMapper.update(admin);
    }
}
