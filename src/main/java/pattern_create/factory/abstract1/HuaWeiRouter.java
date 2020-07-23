package src.main.java.pattern_create.factory.abstract1;

public class HuaWeiRouter implements IRouterProduct{
    @Override
    public void openWifi() {
        System.out.println("打开华为路由wifi");
    }

    @Override
    public void shutDown() {
        System.out.println("华为路由关闭");
    }
}
