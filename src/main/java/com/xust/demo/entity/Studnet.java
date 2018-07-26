package com.xust.demo.entity;

import lombok.Data;

/**
 * Create by Rowena on 2018/7/26
 */
@Data
public class Studnet {

      private Integer id;
      private String name;
      private String sex;
      private Long phone;

    @Override
    public String toString() {
        return "Studnet{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", phone=" + phone +
                '}';
    }
}
