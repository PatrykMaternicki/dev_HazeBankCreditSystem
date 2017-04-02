/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.domain.Rules.AccessRules;

import com.domain.Rules.iAccessRules;

/**
 *
 * @author User
 */
public class AccessRulesNormalUser implements iAccessRules  {

    @Override
    public boolean isAccessPremiumPage() {
        return false;
    }

    @Override
    public boolean isAccessSubPage() {
        return true;
    }

    @Override
    public boolean isAccessLoginPage() {
        return true;
    }

    @Override
    public boolean isAccessRegisterPage() {
        return true;
    }

    @Override
    public boolean isAccessChangePrivilegesPage() {
       return false;
    }
    
}
