
package UserTypeTest;

import com.domain.AccessSystemApplication.Rules.AccessRules.AccessRulesAnomyousUser;
import com.domain.AccessSystemApplication.Rules.iAccessRules;
import com.domain.AccessSystemApplication.User.UnregisterUser;
import com.domain.AccessSystemApplication.User.iUser;
import static junit.framework.Assert.assertEquals;
import org.junit.Test;

public class UnregiterUserTest implements iUserTest {
private iUser user = new UnregisterUser();
private iAccessRules rules = new  AccessRulesAnomyousUser();

    @Test
    public void User_Get_Access_LoginPage() {
        user.setTypeUser(rules);
        boolean result = user.getTypeUser().isAccessLoginPage();
        assertEquals(true, result);
    }

    @Test
    public void User_Get_Access_RegisterPage() {
        user.setTypeUser(rules);
        boolean result = user.getTypeUser().isAccessRegisterPage();
        assertEquals(true, result);
    }

    @Test
    public void User_Get_Access_SubPage() {
        user.setTypeUser(rules);
        boolean result = user.getTypeUser().isAccessSubPage();
        assertEquals(false, result);
    }

    @Test
    public void User_Get_Access_PremiumPage() {
        user.setTypeUser(rules);
        boolean result = user.getTypeUser().isAccessPremiumPage();
        assertEquals(false, result);
    }

    @Test
    public void User_Get_Access_ChangePrivileges() {
       user.setTypeUser(rules);
       boolean result = user.getTypeUser().isAccessChangePrivilegesPage();
       assertEquals(false, result);
    }
    

 
    
}
