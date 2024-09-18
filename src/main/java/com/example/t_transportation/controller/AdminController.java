package com.example.t_transportation.controller;

import com.example.t_transportation.entity.Admin;
import com.example.t_transportation.service.AdminService;
import com.example.t_transportation.util.JwtUtil;
import com.example.t_transportation.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.validation.constraints.Pattern;
import java.util.HashMap;
import java.util.Map;


@RestController
@RequestMapping( "/admin")
@Validated
public class AdminController{

    @Autowired
    private AdminService adminService;
     @Resource
    private StringRedisTemplate stringRedisTemplate;

    @GetMapping("get")
    public Result<String> adminInfo(@RequestHeader(name = "Authorization") String token) {
        return Result.success("HelloWorld");
    }


    @PostMapping(value = "/register")
    public Result register(@Pattern(regexp = "^\\S{2,5}$") String username,@Pattern(regexp = "^\\S{4,16}$") String password){
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
     public Result<String> login(@Pattern(regexp = "^\\S{2,5}$") String username,@Pattern(regexp = "^\\S{4,16}$") String password){
        Admin loginu= adminService.findAdmin(username);
        if(loginu==null){
            //账号不存在

            return Result.error("账号错误");
        }
        String get=loginu.getMima();
        if(!password.equals(get)){
            //等于表示密码正确，登录成功

            Map<String,Object> claims=new HashMap<>();
            claims.put("id",loginu.getId());
            claims.put("username",loginu.getZhanghao());
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