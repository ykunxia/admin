package com.example.t_transportation.util;

import java.util.List;

public class PageBean <T>{
    private Long total;//总条数
    private List<T> items;//当前页数据集合

    public PageBean() {

    }

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public List<T> getItems() {
        return items;
    }

    public void setItems(List<T> items) {
        this.items = items;
    }

    //带参构造
     public  PageBean(Long total,List<T> items) {
         this.items = items;
         this.total = total;
     }
}
