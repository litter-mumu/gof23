package src.main.java.pattern_structure.proxy_static.demo02;

public class UserServiceProxy implements UserService {

    private UserServiceImpl service;

    public void setService(UserServiceImpl service) {
        this.service = service;
    }

    @Override
    public void add() {
        addLog("调用了add方法");
        service.add();
    }

    @Override
    public void delete() {
        addLog("调用了delete方法");
        service.delete();
    }

    @Override
    public void update() {
        addLog("调用了update方法");
        service.update();
    }

    @Override
    public void query() {
        addLog("调用了query方法");
        service.query();
    }

    private void addLog(String msg){
        System.out.println(msg);
    }
}
