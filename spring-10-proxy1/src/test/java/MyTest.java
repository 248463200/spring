import com.pyh.Company;
import com.pyh.Customer;

public class MyTest {
    public static void main(String[] args) {
        Customer customer = new Customer();
        Company company =  new Company(customer);
        company.DevelopmentSoftware();
    }
}
