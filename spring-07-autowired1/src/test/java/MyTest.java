import com.pyh.pojo.Company;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        ApplicationContext application = new ClassPathXmlApplicationContext("applicationContext.xml");
        Company company = (Company)application.getBean("company");
        company.getUsers().show();
        company.getFacilities().show();
    }
}
