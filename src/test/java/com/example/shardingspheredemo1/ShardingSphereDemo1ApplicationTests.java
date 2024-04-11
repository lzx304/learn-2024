package com.example.shardingspheredemo1;

import com.example.shardingspheredemo1.entity.Goods;
import com.example.shardingspheredemo1.mapper.GoodsMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ShardingSphereDemo1ApplicationTests {

    @Test
    void contextLoads() {
    }

    @Autowired
    private GoodsMapper goodsMapper;

    @Test
    public void test(){

        Goods goods = new Goods();
        for (int i=0; i< 10; i++){
            goods.setGoodsName("电脑"+i);
            goods.setMainClass(i);
            goods.setSubClass(i+100);
            goodsMapper.insert(goods);
        }
    }

}
