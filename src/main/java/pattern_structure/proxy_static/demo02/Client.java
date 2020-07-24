package src.main.java.pattern_structure.proxy_static.demo02;

public class Client {
    public static void main(String[] args) {
        UserServiceImpl service = new UserServiceImpl();
        UserServiceProxy proxy = new UserServiceProxy();
        proxy.setService(service);
        proxy.add();
        proxy.delete();
    }
}
