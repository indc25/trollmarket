package com.exercise.trollmarket.servicesREST;

import com.exercise.trollmarket.dtos.user.UserHeaderDTO;
import com.exercise.trollmarket.dtos.user.UserInsertDTO;
import com.exercise.trollmarket.dtos.user.UserInsertResponseDTO;
import com.exercise.trollmarket.models.Role;
import com.exercise.trollmarket.models.User;
import com.exercise.trollmarket.repositories.RoleRepository;
import com.exercise.trollmarket.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private UserRepository userRepository;
    private RoleRepository roleRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    public UserService(UserRepository userRepository, RoleRepository roleRepository) {
        this.userRepository = userRepository;
        this.roleRepository = roleRepository;
    }

    public List<UserHeaderDTO> findAllUser(){
        return UserHeaderDTO.toList(userRepository.findAll());
    }

    public UserInsertResponseDTO insertNewUser(UserInsertDTO userDTO){
        Role role = roleRepository.findById(userDTO.getRoleID())
                .orElseThrow(() -> new IllegalArgumentException("Role tidak ditemukan"));

        User user = new User(role, userDTO.getUsername(), userDTO.getPassword());
        user.setPassword(passwordEncoder.encode(userDTO.getPassword()));

        userRepository.save(user);

        return UserInsertResponseDTO.set(user);
    }
}
