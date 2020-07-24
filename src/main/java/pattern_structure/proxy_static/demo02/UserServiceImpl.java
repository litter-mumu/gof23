package src.main.java.pattern_structure.proxy_static.demo02;

public class UserServiceImpl implements UserService {
    @Override
    public void add() {
        System.out.println("增加");
    }

    @Override
    public void delete() {
        System.out.println("删");
    }

    @Override
    public void update() {
        System.out.println("改");
    }

    @Override
    public void query() {
        System.out.println("查");
    }
}
