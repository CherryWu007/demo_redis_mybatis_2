package com.atguigu.boot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author 85118
 * 在启动类上增加扫描路径
 */
@SpringBootApplication
@MapperScan("com.atguigu.boot.mapper")
public class DemoRedisMybatis2Application {

    public static void main(String[] args) {
        SpringApplication.run(DemoRedisMybatis2Application.class, args);
    }

}
