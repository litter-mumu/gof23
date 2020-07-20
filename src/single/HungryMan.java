package gof23.single;

//饿汉式单例
public class HungryMan {

    //会浪费空间
    private byte[] data1 = new byte[1024*1024];
    private byte[] data2 = new byte[1024*1024];
    private byte[] data3 = new byte[1024*1024];
    private byte[] data4 = new byte[1024*1024];

    public HungryMan() {
    }

    private final static HungryMan HUNGRY_MAN = new HungryMan();

    public static HungryMan getInstance(){
        return HUNGRY_MAN;
    }
}
