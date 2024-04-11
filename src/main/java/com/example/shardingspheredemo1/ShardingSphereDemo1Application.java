package com.example.shardingspheredemo1;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.shardingspheredemo1.mapper")
public class ShardingSphereDemo1Application {

    public static void main(String[] args) {
        SpringApplication.run(ShardingSphereDemo1Application.class, args);
    }

}
