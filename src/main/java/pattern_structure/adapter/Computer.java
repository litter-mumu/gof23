package src.main.java.pattern_structure.adapter;

//客户端类：想上网，插不上网线~
public class Computer {
    public void net(NetToUsb adapter){
        //上网的实现，转接头
        adapter.handleRequest();
    }

    public static void main(String[] args) {
        Computer computer = new Computer();
        Adaptee adaptee = new Adaptee();
//        Adapter adapter = new Adapter();
        Adapter2 adapter = new Adapter2(adaptee);
        computer.net(adapter);
    }
}
