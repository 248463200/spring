import com.pyh.dao.UserDao;
import com.pyh.pojo.Config;
import com.pyh.pojo.User;
import com.pyh.service.UserService;
import com.pyh.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Config.class);
        User user =(User) applicationContext.getBean("user");
        System.out.println(user);
    }
}
