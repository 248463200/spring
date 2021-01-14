
import com.pyh.dao.UserDaoImpl;
import com.pyh.dao.UserDaoMysqlImpl;
import com.pyh.service.UserService;
import com.pyh.service.UserServiceImpl;

public class MyTest {
    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();
        ((UserServiceImpl) userService).setUserdao(new UserDaoMysqlImpl());
        userService.getUser();
    }
}
