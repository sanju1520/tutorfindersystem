package com.cg.tutor.dto;

public class UserDto1 {

	 

    private String username;

 

    private String email;

 

    private String password;

 

    public UserDto1() {
    }

 

    public UserDto1(String username, String password) {
        this.username = username;
        this.password = password;
    }

 

    public String getUsername() {
        return username;
    }

 

    public void setUsername(String username) {
        this.username = username;
    }

 

 

    public String getPassword() {
        return password;
    }

 

    public void setPassword(String password) {
        this.password = password;
    }
    public String getEmail() {
          return email;
      }

 


      public void setEmail(String email) {
          this.email = email;
      }
}
