import com.pyh.ProxyInvocaionHandler;
import com.pyh.Service;
import com.pyh.ServiceImpl;

public class MyTest {
    public static void main(String[] args) {
        ServiceImpl service = new ServiceImpl();
        ProxyInvocaionHandler pih = new ProxyInvocaionHandler();
        pih.setTarget(service);
        Service proxy = (Service)pih.getTarget();
        proxy.add();
        proxy.save();

    }
}
