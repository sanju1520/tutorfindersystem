package com.cg.tutor.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

 

import com.cg.tutor.dto.LoginResponse;
import com.cg.tutor.dto.UserDto1;
import com.cg.tutor.service.LoginService;

 

@RestController
public class LoginController {
    @Autowired
    private LoginService userService;

    @GetMapping("/psignup")
    public String psignup(UserDto1 userDto) {
        userService.psignup(new UserDto1());
        return "signup";
        }

    @PostMapping("/plogin")
    public String plogin(LoginResponse loginResponse) {
        return "login";
    }

    @PostMapping("/pchangePassword")
    public String pchangePassword(LoginResponse loginResponse) {
        return "Password changed";
    }

    @PostMapping("/tlogin")
    public String tlogin(LoginResponse loginResponse) {
        return "login";
    }
    @PostMapping("/tchangePassword")
    public String tchangePassword(LoginResponse loginResponse) {
        return "password changed";
    }

}