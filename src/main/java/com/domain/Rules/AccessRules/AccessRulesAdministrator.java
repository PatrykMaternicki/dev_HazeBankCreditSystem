
package com.domain.Rules.AccessRules;

import com.domain.Rules.iAccessRules;

public class AccessRulesAdministrator implements  iAccessRules {

    @Override
    public boolean isAccessPremiumPage() {
       return true;
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
       return false;
    }

    @Override
    public boolean isAccessChangePrivilegesPage() {
        return true;
    }
    
}
