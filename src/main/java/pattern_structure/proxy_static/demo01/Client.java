package src.main.java.pattern_structure.proxy_static.demo01;

public class Client {

    public static void main(String[] args) {
        //房东要租房子
        Host host = new Host();
        //代理， 中介帮房东租房，但是会有一些附属操作
        Proxy proxy = new Proxy(host);
        //你不用面对房东
        proxy.rent();
    }

}
