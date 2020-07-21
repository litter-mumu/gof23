package src.main.java.factory.abstract1;

public class HuaWeiFactory implements IProductFactory{
    @Override
    public IPhoneProduct getPhoneProduct() {
        return new HuaWeiPhone();
    }

    @Override
    public IRouterProduct getRouterProduct() {
        return new HuaWeiRouter();
    }

    @Override
    public IComputerProduct getComputerProduct() {
        return null;
    }
}
