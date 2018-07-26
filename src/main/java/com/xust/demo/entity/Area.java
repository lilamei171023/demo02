package com.xust.demo.entity;

import lombok.Data;

import java.util.Date;

/**
 * Create by Rowena on 2018/7/26
 */
@Data
public class Area {
    private Integer id;
    private String name;
    private Integer priority;
    private Date creatTime;


    @Override
    public String toString() {
        return "Area{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", priority=" + priority +
                ", creatTime=" + creatTime +
                '}';
    }

}
