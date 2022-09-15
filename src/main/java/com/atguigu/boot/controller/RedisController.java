package com.atguigu.boot.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Random;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : 老贼
 * @version : 1.0
 * @Project : jucjvm
 * @Package : com.atguigu.boot.controller
 * @ClassName : RedisController.java
 * @createTime : 2022/9/14 19:58
 * @Email :851185679@qq.com
 * @Description :
 */
@RestController
@Slf4j
public class RedisController {
    @Resource
    private RedisTemplate redisTemplate;

    @RequestMapping(value = "/redis/add", method = RequestMethod.POST)
    public void add()
    {
        redisTemplate.opsForValue().set("k1","redis测试"+new Random().nextInt(100)+1);
    }

    @RequestMapping(value = "/redis/{key}", method = RequestMethod.GET)
    public String getById(@PathVariable String key) {
        return (String) redisTemplate.opsForValue().get(key);
    }
}
