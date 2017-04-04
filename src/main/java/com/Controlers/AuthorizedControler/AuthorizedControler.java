
package com.Controlers.AuthorizedControler;

import com.domain.AccessSystemApplication.User.iRegisterUser;
import com.domain.AuthorizeSystemApplication.FakeUserRepository;
import javax.servlet.ServletRequest;

public class AuthorizedControler {
 
   private FakeUserRepository userRepository = new FakeUserRepository();
private boolean iFoundUser = false;
private int indexUser;
private iRegisterUser user;
    public boolean check(ServletRequest request) {
       if (checkUserLogin(request)){
           if (checkPassword(request)){
           setUser();
           return true;
            }
       }
       return false;
    }

    private boolean checkUserLogin(ServletRequest request) {
      String postPassword = request.getParameter("login");
      userRepository.createUserList();
      for (iRegisterUser user : userRepository.getUserList()){
          if (user.getName().equals(postPassword)){
              indexUser = user.getId();
              return true;
          }
      }
      return false;
    }

    private boolean checkPassword(ServletRequest request) {
     String postPassword = request.getParameter("password");
     iRegisterUser user = userRepository.getRow(indexUser);
        if (user.getPassword().equals(postPassword)){
            return true;
        }
       return false;
    }

    private void setUser() {
        user = userRepository.getRow(indexUser);
    }

    public iRegisterUser getUser() {
        return user;
    }
    
 
}
