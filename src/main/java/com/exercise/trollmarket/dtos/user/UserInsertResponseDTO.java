package com.exercise.trollmarket.dtos.user;

import com.exercise.trollmarket.models.User;
import lombok.Data;

@Data
public class UserInsertResponseDTO {

    private final String username;

    public static UserInsertResponseDTO set(User user){
        return new UserInsertResponseDTO(user.getUsername());
    }
}
