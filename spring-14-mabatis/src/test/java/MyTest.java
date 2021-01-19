import com.pyh.dao.Query;
import com.pyh.entity.UserEntity;
import com.pyh.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;


@RunWith(SpringJUnit4ClassRunner.class)// SpringJUnit支持，由此引入Spring-Test框架支持！
@ContextConfiguration({"classpath:applicationContext.xml","classpath:mybatis-config.xml"})//用于加载bean
public class MyTest {

    @Autowired
    private UserService userService;
    @Test
    public void Test(){
        Query query = new Query();
        query.put("id",1);
        List<UserEntity> u1 =  userService.list(query);
        System.out.println(u1);
    }
}
