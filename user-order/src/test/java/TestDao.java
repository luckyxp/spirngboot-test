import com.xp.shop.ShopMain;
import com.xp.shop.dao.UserDao;
import com.xp.shop.pojo.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

/**
 * @author Climb.Xu
 * @date 2020/5/27 14:36
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = ShopMain.class)
public class TestDao {
    @Resource
    private UserDao userDao;

    @Test
    public void TestUser() {
        System.out.println(userDao.getByName("王"));
    }
}
