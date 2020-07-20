package src.main.java.factory.simple;

//简单工厂模式（静态工厂）
//增加一个新的产品，如果不修改代码，做不到

//不符合开闭原则
public class CarFactory {

    //方法一
    public static Car getCar(String car){
        switch (car) {
            case "五菱宏光":
                return new WuLing();
            case "特斯拉":
                return new Tesla();
        }
        return null;
    }

    //方法二
    public static Car getWuLing(){
        return new WuLing();
    }
}
