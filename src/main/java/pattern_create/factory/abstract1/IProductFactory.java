package src.main.java.pattern_create.factory.abstract1;

//抽象产品工厂
public interface IProductFactory {
    IPhoneProduct getPhoneProduct();
    IRouterProduct getRouterProduct();

    //不可以增加产品，加上的话需在每个子类都要实现，因为不符合开闭原则
    //但是可以增加产品族，比如魅族，oppo等等
    IComputerProduct getComputerProduct();
}
