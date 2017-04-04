
package com.domain.AccessSystemApplication.Rules.AccessRules;

import com.domain.AccessSystemApplication.Rules.iAccessRules;

public class AccessRulesPremiumUser implements  iAccessRules {

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
        return true;
    }

    @Override
    public boolean isAccessChangePrivilegesPage() {
        return false;
    }

   
}
