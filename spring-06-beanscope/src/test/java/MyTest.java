import com.pyh.pojo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        ApplicationContext application = new ClassPathXmlApplicationContext("applicationContext.xml");
        User user = (User)application.getBean("user");
        /*单例*/
        User user2 = (User)application.getBean("user");
        System.out.println(user.hashCode() +"="+user2.hashCode());

        /*多例*/
        User userpro = (User)application.getBean("user2");
        User userpro2 = (User)application.getBean("user2");
        System.out.println(userpro.hashCode() +"!=" + userpro2.hashCode());

    }
}
