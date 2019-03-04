package com.xust.demo.entity;

import lombok.Data;

/**
 * Create by Rowena on 2018/7/26
 */

public class Studnet {

      private Integer id;
      private String name;
      private String sex;
      private Long phone;

    public Studnet(Integer id, String name, String sex, Long phone) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.phone = phone;
    }

    public Studnet() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Long getPhone() {
        return phone;
    }

    public void setPhone(Long phone) {
        this.phone = phone;
    }

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
