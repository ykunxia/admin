package com.example.t_transportation.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
@Getter
@Setter
public class Admin {
    private Integer id;//主键id
    private LocalDateTime addTime;//创建时间
    private String zhanghao;//账号（名字）
    @JsonIgnore
    private String mima;//密码
    private String userPic;//图像



}
