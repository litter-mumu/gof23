package src.main.java.build.demo01;

//具体的建造者：工人
public class Worker extends Builder{
    private Product product;

    public Worker() {
        product = new Product();
    }

    @Override
    void buildA() {
        product.setBuildA("地基");
        System.out.println("地基");
    }

    @Override
    void buildB() {
        product.setBuildB("钢筋水泥");
        System.out.println("钢筋水泥");
    }

    @Override
    void buildC() {
        product.setBuildC("铺电线");
        System.out.println("铺电线");
    }

    @Override
    void buildD() {
        product.setBuildD("装修");
        System.out.println("装修");
    }

    @Override
    Product getProduct() {
        return product;
    }
}
