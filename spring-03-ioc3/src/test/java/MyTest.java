import com.pyh.pojo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        ApplicationContext application = new ClassPathXmlApplicationContext("beans.xml");
        User user = (User) application.getBean("user");
        System.out.println(user);
    }
}
