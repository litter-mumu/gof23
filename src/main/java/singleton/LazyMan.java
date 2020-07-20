//懒汉式单例
public class LazyMan {
    private LazyMan() {
        System.out.println(Thread.currentThread().getName() + "ok");
    }

    private volatile static LazyMan lazyMan;

    //这种方式在单线程下没问题，但是在多线程并发下就有问题
//    public static LazyMan getInstance() {
//        if (lazyMan == null) {
//            lazyMan = new LazyMan();
//        }
//        return lazyMan;
//    }

    // 双重检测锁模式的 懒汉式单例 DCL懒汉式
    public static LazyMan getInstance() {
        if (lazyMan == null) {
            synchronized (LazyMan.class) {
                if (lazyMan == null) {
                    lazyMan = new LazyMan();// 但是这种方法不安全，不是一个原子性操作
                    /**
                     * 1.分配内存空间
                     * 2.执行构造方法，初始化对象
                     * 3.把这个对象指向这个空间
                     *
                     * 123 正常情况下
                     * 极端条件下
                     * 132 A 线程没问题
                     *     B 此时lazyMan还没有完成构造
                     *     因此需要加volatile
                     */
                }
            }
        }
        return lazyMan;
    }

    //多线程并发
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            new Thread(() -> {
                LazyMan.getInstance();
            }).start();
        }
    }

}
