package com.example.shardingspheredemo1.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @author lzx
 * @date 2024/2/25 16:53:33
 * @Description
 */
@Data
@TableName("t_goods")
public class Goods {

    @TableId(type = IdType.UUID)
    private int goodsId;

    @TableField(value = "goods_name")
    private String goodsName;

    @TableField(value = "main_class")
    private int mainClass;

    @TableField(value = "sub_class")
    private int subClass;

}
