package src.main.java.factory.abstract1;

public class XiaoMiRouter implements IRouterProduct{
    @Override
    public void openWifi() {
        System.out.println("打开小米路由wifi");
    }

    @Override
    public void shutDown() {
        System.out.println("小米路由关闭");
    }
}
