import com.pyh.module.user.controller.UserController;
import com.pyh.module.user.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)// SpringJUnit支持，由此引入Spring-Test框架支持！
@ContextConfiguration({"classpath:applicationContext.xml","classpath:mybatis-config.xml"})//用于加载bean
public class MyTest {

    @Autowired
    private UserService userService;


   /* @Test
    public void Test(){
        Map<String,Object> condition = new HashMap<String, Object>();
        condition.put("id",1);
        List<UserEntity> u1 =  userService.list(condition);
        ResultBean bean = new ResultBean<List<UserEntity>>(u1);
        System.out.println(bean);
    }*/


    @Autowired
    private UserController userController;
    @Test
    public void Test2(){
        userController.getUserList();
    }

}
