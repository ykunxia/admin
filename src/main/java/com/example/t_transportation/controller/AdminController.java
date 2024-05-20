package com.example.t_transportation.controller;

import com.example.t_transportation.entity.Admin;
import com.example.t_transportation.service.AdminService;
import com.example.t_transportation.util.JwtUtil;
import com.example.t_transportation.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;


@RestController
@RequestMapping( "/admin")
public class AdminController{

    @Autowired
    private AdminService adminService;

    @PostMapping(value = "/register")
    public Result register(String username, String password){
        //查询用户
        Admin u= adminService.findAdmin(username);
        if(u==null){
             //注册
            adminService.register(username,password);
            return Result.success();
        }
        return Result.error("账号已被占用");

    }

     @PostMapping(value = "/login")
     public Result<String> login(String username, String password){
        Admin loginu= adminService.findAdmin(username);
        if(loginu==null){
            //账号不存在
            return Result.error("账号错误");
        }
         System.out.println(username);
        String get=loginu.getMima();
        if(!password.equals(get)){
            //等于表示密码正确，登录成功

            Map<String,Object> claims=new HashMap<>();
            claims.put("id",loginu.getId());
            claims.put("zhanghao",loginu.getZhanghao());
            String token= JwtUtil.genToken(claims);


            return Result.success(token);


        }
        else {
            System.out.println(password);
            System.out.println(loginu.getMima());
            return Result.error("密码错误");
        }


     }



}