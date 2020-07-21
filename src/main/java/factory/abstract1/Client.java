package src.main.java.factory.abstract1;

public class Client {
    public static void main(String[] args) {
        System.out.println("============小米系列产品=============");
        XiaoMiFactory xiaoMiFactory = new XiaoMiFactory();
        IPhoneProduct xiaomi = xiaoMiFactory.getPhoneProduct();
        xiaomi.startPhone();
        xiaomi.call();
        xiaomi.sendMsg();
        xiaomi.shutdownPhone();

        IRouterProduct xiaoMiRouter = xiaoMiFactory.getRouterProduct();
        xiaoMiRouter.openWifi();
        xiaoMiRouter.shutDown();

        System.out.println("============华为系列产品=============");
        HuaWeiFactory huaWeiFactory = new HuaWeiFactory();
        IPhoneProduct huaweiPhone = huaWeiFactory.getPhoneProduct();
        huaweiPhone.startPhone();
        huaweiPhone.call();
        huaweiPhone.sendMsg();
        huaweiPhone.shutdownPhone();

        IRouterProduct huaweiRouter = huaWeiFactory.getRouterProduct();
        huaweiRouter.openWifi();
        huaweiRouter.shutDown();

    }
}
