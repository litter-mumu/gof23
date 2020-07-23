package src.main.java.pattern_create.factory.abstract1;

public class HuaWeiPhone implements IPhoneProduct {
    @Override
    public void startPhone() {
        System.out.println("开启华为手机");
    }

    @Override
    public void shutdownPhone() {
        System.out.println("华为手机关机");
    }

    @Override
    public void call() {
        System.out.println("华为打电话");
    }

    @Override
    public void sendMsg() {
        System.out.println("华为发短信");
    }
}
