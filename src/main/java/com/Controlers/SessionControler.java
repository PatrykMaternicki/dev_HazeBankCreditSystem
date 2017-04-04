/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Controlers;

import com.domain.AccessSystemApplication.Rules.AccessRules.AccessRulesAdministrator;
import com.domain.AccessSystemApplication.Rules.AccessRules.AccessRulesAnomyousUser;
import com.domain.AccessSystemApplication.Rules.AccessRules.AccessRulesNormalUser;
import com.domain.AccessSystemApplication.Rules.AccessRules.AccessRulesPremiumUser;
import com.domain.AccessSystemApplication.Rules.iAccessRules;
import com.domain.AccessSystemApplication.User.UnregisterUser;
import com.domain.AccessSystemApplication.User.iRegisterUser;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 *
 * @author User
 */
public class SessionControler {
    private iAccessRules rules;
    private iRegisterUser user;
    private HttpServletRequest request;
    
    
    public  void setKeyToSessionRegisterUser () {
        addRules(user);
       user.setAccessRules(rules);
       request.getSession().setAttribute("user", user);
    }
    public void setKeyToSessionUnregisterUser(){
        rules = new AccessRulesAnomyousUser();
        UnregisterUser user = new UnregisterUser();
        user.setRules(rules);
        request.getSession().setAttribute("user", user);
    }
   private void addRules(iRegisterUser user){
       if (isNormalUser(user)){
           rules = new AccessRulesNormalUser();
       }
       else if (isPremiumUser(user)){
           rules = new AccessRulesPremiumUser();
       }
        else if (isAdministratorUser(user)){
           rules = new AccessRulesAdministrator();
       }
       
   }
   private boolean isNormalUser(iRegisterUser user){
       return user.getTypeUser().equals("Normal");
   }

    private boolean isPremiumUser(iRegisterUser user) {
      return user.getTypeUser().equals("Premium");
    }

    private boolean isAdministratorUser(iRegisterUser user) {
      return user.getTypeUser().equals("Administrator");
    }

    public void setUser(iRegisterUser user) {
        user = user;
    }

    public void setRequest(HttpServletRequest httpRequest) {
        request = httpRequest;
    }

    public boolean isSessionKeyExist(String key) {
      if(request.getSession().getAttribute(key) == null)return false; return true;
    }
    
    
    
}
