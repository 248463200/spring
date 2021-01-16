import com.pyh.pojo.Company;
import com.pyh.pojo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        ApplicationContext application = new ClassPathXmlApplicationContext("applicationContext.xml");
        Company company = (Company) application.getBean("company");
        User user = (User) application.getBean("user");
        System.out.println(company);
        System.out.println(user);
    }
}
