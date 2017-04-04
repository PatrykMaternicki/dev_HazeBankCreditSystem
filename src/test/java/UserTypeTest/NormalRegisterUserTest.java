
package UserTypeTest;

import com.domain.AccessSystemApplication.Rules.AccessRules.AccessRulesNormalUser;
import com.domain.AccessSystemApplication.Rules.iAccessRules;
import com.domain.AccessSystemApplication.User.RegisterUser;
import com.domain.AccessSystemApplication.User.iUser;
import static junit.framework.Assert.assertEquals;
import org.junit.Test;

public class NormalRegisterUserTest implements iUserTest {
    private iUser user = new RegisterUser();
    private iAccessRules rules = new AccessRulesNormalUser();
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
        assertEquals(true, result);
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
