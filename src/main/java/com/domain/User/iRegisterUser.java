/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.domain.User;

/**
 *
 * @author User
 */
public interface iRegisterUser {
    void setUserName(String name);
    void setPassword(String password);
    void setEmail(String email);
    String getName();
    String getPassword();
    String getEmail();
}
