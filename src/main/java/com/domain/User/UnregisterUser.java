
package com.domain.User;

import com.domain.Rules.iAccessRules;

public class UnregisterUser extends User {

    @Override
    public void setTypeUser(iAccessRules rules) {
       super.setRules(rules);
    }

    @Override
    public iAccessRules getTypeUser() {
        return super.getRules();
    }

    
}
