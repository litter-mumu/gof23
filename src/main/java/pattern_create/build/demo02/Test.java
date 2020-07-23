package src.main.java.pattern_create.build.demo02;

public class Test {
    public static void main(String[] args) {
        Product product = new Worker()
                .buildA("雪碧")
                .buildB("牛肉汉堡")
                .getProduct();
        System.out.println(product.toString());
    }
}
