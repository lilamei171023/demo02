// Copyright (C) 2019 Meituan
// All rights reserved
package com.xust.demo.entity;

import lombok.Data;

/**
 * @author rowena
 * @version 1.0
 * @created 2019-03-04 15:43
 **/
@Data
public class dev1 {

    private int id;

    private String name;

    @Override
    public String toString() {
        return "dev1{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
