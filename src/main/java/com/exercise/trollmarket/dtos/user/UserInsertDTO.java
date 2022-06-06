package com.exercise.trollmarket.dtos.user;

import lombok.Data;

@Data
public class UserInsertDTO {

    private final Integer roleID;
    private final String username;
    private final String password;

}
