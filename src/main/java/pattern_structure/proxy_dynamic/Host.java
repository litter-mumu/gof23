package src.main.java.pattern_structure.proxy_dynamic;

public class Host implements Rent {
    @Override
    public void rent() {
        System.out.println("房东出租房子！");
    }
}
