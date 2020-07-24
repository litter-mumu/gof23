package src.main.java.pattern_structure.proxy_static.demo01;

public class Proxy implements Rent{
    private Host host;

    public Proxy() {
    }

    public Proxy(Host host) {
        this.host = host;
    }

    @Override
    public void rent() {
        host.rent();
    }

    public void seeHouse(){
        System.out.println("带看房");
    }
    public void heTong(){
        System.out.println("签合同");
    }
    public void fare(){
        System.out.println("收中介费");
    }
}
