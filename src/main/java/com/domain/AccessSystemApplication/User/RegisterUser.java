
package com.domain.AccessSystemApplication.User;

import com.domain.AccessSystemApplication.Rules.iAccessRules;

public class RegisterUser extends User implements iRegisterUser {
    private String typeUser;
    private String userName;
    private String password;
    private String email;
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    @Override
    public void setUserName(String name) {
        userName = name;
    }

    @Override
    public void setPassword(String password) {
        password = password;
    }

    @Override
    public void setEmail(String email) {
        email = email;
    }

    @Override
    public String getName() {
        return userName;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public String getEmail() {
        return email;
    }


    @Override
    public void setAccessRules(iAccessRules rules) {
        super.setRules(rules);
    }

    @Override
    public iAccessRules getAccessRules() {
        return super.getRules();
    }

    @Override
    public String getTypeUser() {
        return typeUser;
    }

    @Override
    public void setTypeUser(String typeUser) {
        typeUser = typeUser;
    }

    @Override
    public void setIsLogged(boolean isLogged) {
        super.setIsLogged(isLogged); 
    }

    @Override
    public boolean isIsLogged() {
        return super.isIsLogged(); 
    }
    



  
  
    
}
