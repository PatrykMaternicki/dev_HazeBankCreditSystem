
package com.domain.User;

import com.domain.Rules.iAccessRules;

public class RegisterUser extends User implements iRegisterUser {
    private String userName;
    private String password;
    private String email;


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
    public void setTypeUser(iAccessRules rules) {
        super.setRules(rules);
    }

    @Override
    public iAccessRules getTypeUser() {
       return super.getRules();
    }

   
    
    
}
