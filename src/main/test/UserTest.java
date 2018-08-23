import com.copartner.mapper.IUserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:conf/applicationContext.xml"})
public class UserTest {
    @Autowired
    private IUserMapper iUserMapper;

    @Test
    public void test() {
        List list = iUserMapper.selectAll();
        System.out.println(list);
    }
<<<<<<< HEAD
    222
=======
    111
>>>>>>> 1e7cc4777577f8f9c12d4e39b9b9f12ca569c564
}
