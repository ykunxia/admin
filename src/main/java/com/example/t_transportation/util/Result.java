package com.example.t_transportation.util;


public class Result<T> {
    private Integer code;
    private String message;
    private T data;


    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    //带参构造
    public  Result(int code,String message,T data){
        this.code=code;
        this.message=message;
        this.data=data;
    }

    //操作成功响应结果，返回<E>泛型结果
    public static <E> Result<E> success(E data){
        return new Result<>(0,"操作成功",data);
    }

    //操作成功响应结果，不带数据
    public static Result success(){
        return new Result(0,"操作成功",null);
    }

    //操作失败
     public static Result error(String message){
        return new Result(1,message,null);
    }



}
