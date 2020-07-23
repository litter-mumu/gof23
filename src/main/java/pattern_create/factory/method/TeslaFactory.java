package src.main.java.pattern_create.factory.method;

public class TeslaFactory implements CarFactory {
    @Override
    public Car getCar() {
        return new Tesla();
    }
}
