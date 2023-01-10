package com.cg.tutor.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

 

import com.cg.tutor.dto.LoginResponse;
import com.cg.tutor.dto.UserDto1;
import com.cg.tutor.entity.LoginRequest;
import com.cg.tutor.entity.Parent;
import com.cg.tutor.entity.Tutor;
import com.cg.tutor.exception.ResourceNotFoundException;
import com.cg.tutor.exception.UserAlreadyExistsException;
import com.cg.tutor.repository.LoginRepository;

 


@Service
public class LoginServiceImpl implements LoginService{

 

    @Autowired
    private LoginRepository loginRepository; //Repository object Layer object Autowired  

 

    public Parent psignup(UserDto1 userDto1){

 

        Parent parent = loginRepository.findByEmail(userDto1.getEmail());

 

        if(parent!=null) throw new UserAlreadyExistsException("User already exists");

 

        else {
            Parent newparent= new Parent();
            Parent parent1 = loginRepository.findByUsername(userDto1.getUsername());

 

            if(parent1!=null) throw new UserAlreadyExistsException("Username already exists");

            else {
                newparent.setUsername(userDto1.getUsername());
                newparent.setUserPassword(userDto1.getPassword());
                loginRepository.save(userDto1);
                return newparent;
            }
        }


    }
    public Parent plogin(LoginResponse loginResponse) throws ResourceNotFoundException {

        Parent parent1= loginRepository.findByUsername(loginResponse.getUsername());

 

        if(parent1==null) throw new ResourceNotFoundException("User with given username does not exist");

        Parent parent=new Parent();
        String a=parent.getUserPassword();
        LoginRequest loginrequest=new LoginRequest();
        String b=loginrequest.getPassword();

        if(a.equals(b)) {
        return parent1;
        }

        else throw new ResourceNotFoundException("Invalid Id password");
    }

 

    public Parent pchangePassword(LoginResponse loginResponse) throws ResourceNotFoundException {

 

        Parent parent2 = loginRepository.findByUsername(loginResponse.getUsername());
        if(parent2 == null){
            throw new ResourceNotFoundException("No user found with given ");
        }
        parent2.setUserPassword(loginResponse.getPassword());
        return loginRepository.save(parent2);
    }

 


    public Tutor tlogin(LoginResponse loginResponse) throws ResourceNotFoundException {

        Tutor tutor1= loginRepository.findByusername(loginResponse.getUsername());

 

        if(tutor1==null) throw new ResourceNotFoundException("User with given username does not exist");

        else {
            Tutor tutor=new Tutor();
            String a=tutor.getUserPassword();
            LoginRequest loginrequest=new LoginRequest();
            String b=loginrequest.getPassword();
            if(a.equals(b))
                return tutor1;

            else throw new ResourceNotFoundException("Invalid Id password");
        }
    }

 

    public Tutor tchangePassword(LoginResponse loginResponse) throws ResourceNotFoundException {

 

        Tutor tutor2 = loginRepository.findByusername(loginResponse.getUsername());
        if(tutor2 == null){
            throw new ResourceNotFoundException("No user found with given ");
        }

        tutor2.setUserPassword(loginResponse.getPassword());
        return loginRepository.save(tutor2);
    }

 

}
