
package UserTypeTest;

import com.domain.Rules.AccessRules.AccessRulesAdministrator;
import com.domain.Rules.iAccessRules;
import com.domain.User.RegisterUser;
import com.domain.User.iUser;
import static junit.framework.Assert.assertEquals;

public class AdministratorRegisterUserTest implements iUserTest {
    private iUser user = new RegisterUser();
    private iAccessRules rules = new AccessRulesAdministrator();
    @Override
    public void User_Get_Access_LoginPage() {
        user.setTypeUser(rules);
        boolean result = user.getTypeUser().isAccessLoginPage();
        assertEquals(true, result);
    }

    @Override
    public void User_Get_Access_RegisterPage() {
        user.setTypeUser(rules);
        boolean result = user.getTypeUser().isAccessRegisterPage();
        assertEquals(true, result);
    }

    @Override
    public void User_Get_Access_SubPage() {
        user.setTypeUser(rules);
        boolean result = user.getTypeUser().isAccessSubPage();
        assertEquals(true, result);
    }

    @Override
    public void User_Get_Access_PremiumPage() {
        user.setTypeUser(rules);
        boolean result = user.getTypeUser().isAccessPremiumPage();
        assertEquals(true, result);
    }

    @Override
    public void User_Get_Access_ChangePrivileges() {
        user.setTypeUser(rules);
        boolean result = user.getTypeUser().isAccessChangePrivilegesPage();
        assertEquals(true, result);
    }
    
}
