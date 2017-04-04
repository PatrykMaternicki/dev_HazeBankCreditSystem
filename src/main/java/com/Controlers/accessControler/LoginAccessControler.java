
package com.Controlers.accessControler;

import javax.servlet.http.HttpSession;

public class LoginAccessControler {
    private HttpSession Session; 

    public HttpSession getSession() {
        return Session;
    }

    public void setSession(HttpSession Session) {
        this.Session = Session;
    }
    
}
