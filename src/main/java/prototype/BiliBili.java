package src.main.java.prototype;

import java.util.Date;

public class BiliBili {
    public static void main(String[] args) throws CloneNotSupportedException {
        Date date = new Date();
        Video v1 = new Video("流川枫和苍井空", date);
        System.out.println("v1 => " + v1);
        System.out.println("v1 => hash " + v1.hashCode());

        Video v2 = (Video) v1.clone();
        System.out.println("v2 => " + v2);
        System.out.println("v2 => hash " + v2.hashCode());

        date.setTime(221092123);
        System.out.println("v1 => " + v1);
        System.out.println("v2 => " + v2);
    }
}
