package com.example.T_transportation;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;

import javax.annotation.Resource;

@SpringBootTest//单元测试方法执行之前，会先初始化Spring容器，可以通过依赖注入的方式获取容器中的对象
public class RedisTest {

    @Resource
    private StringRedisTemplate stringRedisTemplate;

    @Test
    public void testSet(){
     ValueOperations<String,String> operations=stringRedisTemplate.opsForValue();
     operations.set("username","zhangsan");

    }

    @Test
    public void testGet(){
         ValueOperations<String,String> operations=stringRedisTemplate.opsForValue();
        System.out.println(operations.get("username"));
    }
}
