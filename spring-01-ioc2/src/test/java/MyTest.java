import com.pyh.service.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        ApplicationContext applicationContext=  new ClassPathXmlApplicationContext("beans.xml");
        UserServiceImpl userService =(UserServiceImpl) applicationContext.getBean("UserServiceImpl");
        userService.getUser();

    }
}
