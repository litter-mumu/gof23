package src.main.java.pattern_create.factory.simple;

public class Consumer {
    public static void main(String[] args) {
        Car car = new WuLing();
        Car car2 = new Tesla();

        car.name();
        car2.name();
    }
}
