package com.pyh.module.user.entity;

import lombok.Data;

import java.io.Serializable;
@Data
public class UserEntity  implements Serializable {

        private static final long serialVersionUID = 1L;

        private Integer id;
        private String name;


}
