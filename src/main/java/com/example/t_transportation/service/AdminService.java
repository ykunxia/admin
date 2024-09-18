package com.example.t_transportation.service;

import com.example.t_transportation.entity.Admin;

public interface AdminService {
     void register(String zhanghao,String mima);
     Admin findAdmin(String zhanghao);

    void updateAvatar(String avatarUrl);

    void update(Admin admin);
}
