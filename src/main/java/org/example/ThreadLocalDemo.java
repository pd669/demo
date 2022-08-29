package org.example;

public class ThreadLocalDemo {

    private static final ThreadLocal<Integer> falgThreadLocal = new ThreadLocal<Integer>();

    public static void main(String[] args) {
        ThreadLocalDemo app = new ThreadLocalDemo();
        app.threadLocalDemo();
    }

    public void threadLocalDemo(){
        falgThreadLocal.set(1);
        doRun();
    }

    public void doRun(){
        System.out.println("首先打印 flag："+falgThreadLocal.get());


        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("子线程启动");
                falgThreadLocal.set(3);
                System.out.println("在子线程中访问 flagId："+falgThreadLocal.get());
            }
        }).start();

    }
}
