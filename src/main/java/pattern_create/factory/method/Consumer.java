package src.main.java.pattern_create.factory.method;

public class Consumer {
    public static void main(String[] args) {
        Car car = new WuLingFactory().getCar();
        Car car2 = new TeslaFactory().getCar();
        Car car3 = new MobaiFactory().getCar();

        car.name();
        car2.name();
        car3.name();
    }
}
