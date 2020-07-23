package src.main.java.pattern_create.build.demo02;

public class Worker extends Builder{
    private Product product;

    public Worker() {
        product = new Product();
    }

    @Override
    Builder buildA(String msg) {
        product.setBuildA(msg);
        System.out.println(msg);
        return this;
    }

    @Override
    Builder buildB(String msg) {
        product.setBuildB(msg);
        System.out.println(msg);
        return this;
    }

    @Override
    Builder buildC(String msg) {
        product.setBuildC(msg);
        System.out.println(msg);
        return this;
    }

    @Override
    Builder buildD(String msg) {
        product.setBuildD(msg);
        System.out.println(msg);
        return this;
    }

    @Override
    Product getProduct() {
        return product;
    }
}
