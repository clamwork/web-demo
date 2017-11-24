import com.djcps.module.system.mapper.UserMapper;
import com.djcps.module.system.model.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * @author Chengw
 * @since 2017/11/24 13:41.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserMapperTest {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void list(){
        List<User> users = userMapper.list();
        System.out.print(users);
    }
}
