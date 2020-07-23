package src.main.java.pattern_create.prototype;

import java.util.Date;

public class Video implements Cloneable {
    private String name;
    private Date date;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone(); // 这里只是浅拷贝
    }

//    @Override
//    protected Object clone() throws CloneNotSupportedException {
//        Date date = new Date();
//
//        Video v = (Video) super.clone();
//        v.date = (Date) this.date.clone();//将这个对象的属性也进行克隆~
//        return v; // 这个才是深拷贝
//    }

    public Video() {
    }

    public Video(String name, Date date) {
        this.name = name;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Video{" +
                "name='" + name + '\'' +
                ", date=" + date +
                '}';
    }
}
