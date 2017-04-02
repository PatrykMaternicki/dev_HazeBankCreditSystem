
package com.domain.Rules;

public interface iAccessRules {
    boolean accessPremiumPage  = false;
    boolean accessSubPage = true;
    boolean accessLoginServlet = false;
    boolean accesssRegisterServlet = false; 
    boolean isAccessPremiumPage();
    boolean isAccessSubPage();
    boolean isAccessLoginPage();
    boolean isAccessRegisterPage();
    boolean isAccessChangePrivilegesPage();
}
