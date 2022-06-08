package com.exercise.trollmarket.dtos.user;

import com.exercise.trollmarket.models.User;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class UserHeaderDTO {

    private final String username;
    private final String password;
    private final String role;

    public static UserHeaderDTO set(User user){
        return new UserHeaderDTO(user.getUsername(), user.getPassword(), user.getRoleID().getRoleName());
    }

    public static List<UserHeaderDTO> toList(List<User> users){
        List<UserHeaderDTO> result = new ArrayList<>();
        for (User user : users){
            result.add(set(user));
        }

        return result;
    }

}
