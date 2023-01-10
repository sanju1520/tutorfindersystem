package com.cg.tutor.service;

import com.cg.tutor.dto.LoginResponse;
import com.cg.tutor.dto.UserDto1;
import com.cg.tutor.entity.Parent;
import com.cg.tutor.entity.Tutor;
import com.cg.tutor.exception.ResourceNotFoundException;

 


public interface LoginService {
    public Parent psignup(UserDto1 userDto);

    public Parent plogin(LoginResponse loginReponse) throws ResourceNotFoundException;
    public Parent pchangePassword(LoginResponse loginResponse)throws ResourceNotFoundException;

    public Tutor tlogin(LoginResponse loginResponse)throws ResourceNotFoundException;
    public Tutor tchangePassword(LoginResponse loginResponse)throws ResourceNotFoundException;

}
