
package AuthorizeSystemTest.fakeUserRepositoryTest;

import com.domain.AccessSystemApplication.User.RegisterUser;
import com.domain.AccessSystemApplication.User.iRegisterUser;
import com.domain.AuthorizeSystemApplication.FakeUserRepository;
import static org.hamcrest.CoreMatchers.instanceOf;
import static org.junit.Assert.assertThat;
import org.junit.Test;

public class fakeUserRepositoryTest {
   private FakeUserRepository giveRepository = new FakeUserRepository();
  
   
   @Test
   public void Repository_should_return_object_user(){
       giveRepository.createUserList();
       iRegisterUser user = giveRepository.getRow(1);
       assertThat(user, instanceOf(RegisterUser.class));
   }
   
}
