
package com.Filters;



import com.Controlers.AuthorizedControler.AuthorizedControler;
import com.Controlers.SessionControler;
import com.Controlers.accessControler.LoginAccessControler;
import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;import javax.servlet.Filter;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
@WebFilter ("/login")
public class LoginAccessFilter implements Filter {
private LoginAccessControler controler = new LoginAccessControler();
private AuthorizedControler authorizedControler = new AuthorizedControler();
private SessionControler sessionControler = new SessionControler();
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest httpRequest = (HttpServletRequest) request;
        if (isAuthorize(httpRequest)){
            sessionControler.setUser(authorizedControler.getUser());
            sessionControler.setRequest(httpRequest);
        }
        
    }

    @Override
    public void destroy() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private boolean isAuthorize(HttpServletRequest httpRequest) {
       return authorizedControler.check(httpRequest);
    }
    
}
