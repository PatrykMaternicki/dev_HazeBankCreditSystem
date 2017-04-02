
package com.domain.User;

import com.domain.Rules.iAccessRules;

public interface iUser {
   public void setTypeUser(iAccessRules rules);
   public iAccessRules getTypeUser ();
}
