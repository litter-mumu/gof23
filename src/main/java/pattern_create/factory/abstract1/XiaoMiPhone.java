package src.main.java.pattern_create.factory.abstract1;

public class XiaoMiPhone implements IPhoneProduct {
    @Override
    public void startPhone() {
        System.out.println("开启小米手机");
    }

    @Override
    public void shutdownPhone() {
        System.out.println("小米手机关机");
    }

    @Override
    public void call() {
        System.out.println("小米打电话");
    }

    @Override
    public void sendMsg() {
        System.out.println("小米发短信");
    }
}
