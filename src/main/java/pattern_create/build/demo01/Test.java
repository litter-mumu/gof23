package src.main.java.pattern_create.build.demo01;

public class Test {
    public static void main(String[] args) {
        //指挥
        Director director = new Director();
        //指挥 具体的工人完成 产品
        Product product = director.build(new Worker());
        System.out.println(product.toString());
    }
}
