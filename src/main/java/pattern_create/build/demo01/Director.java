package src.main.java.pattern_create.build.demo01;

//指挥：核心。负责指挥构建一个工程
public class Director {
    public Product build(Builder build) {
        build.buildA();
        build.buildB();
        build.buildC();
        build.buildD();
        return build.getProduct();
    }
}
