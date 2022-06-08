package com.exercise.trollmarket.controllerREST;

import com.exercise.trollmarket.dtos.RestResponse;
import com.exercise.trollmarket.dtos.user.UserHeaderDTO;
import com.exercise.trollmarket.dtos.user.UserInsertDTO;
import com.exercise.trollmarket.dtos.user.UserInsertResponseDTO;
import com.exercise.trollmarket.servicesREST.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("user")
public class UserController {

    private UserService service;

    @Autowired
    public UserController(UserService service) {
        this.service = service;
    }

    @GetMapping()
    public ResponseEntity<RestResponse<List<UserHeaderDTO>>> findAllUser(){
        return new ResponseEntity<>(
                new RestResponse<>(service.findAllUser(),
                        "Berhasil ditemukan",
                        "200"),
                HttpStatus.OK);
    }

    @PostMapping()
    public ResponseEntity<RestResponse<UserInsertResponseDTO>> insertNewUser(
            @RequestBody UserInsertDTO userDTO){
        return new ResponseEntity<>(
                new RestResponse<>(service.insertNewUser(userDTO),
                        "User berhasil ditambahkan",
                        "201"),
                HttpStatus.CREATED);
    }
}
