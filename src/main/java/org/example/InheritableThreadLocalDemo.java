package org.example;

public class InheritableThreadLocalDemo {

    private static final InheritableThreadLocal<Integer> flagInheritableThreadLocal = new InheritableThreadLocal<>();
    public static void main(String[] args) {
        InheritableThreadLocalDemo inheritableThreadLocalDemo = new InheritableThreadLocalDemo();
        inheritableThreadLocalDemo.inheritableThreadLocalDemo();



    }

    public void inheritableThreadLocalDemo(){
        flagInheritableThreadLocal.set(1);
        doRun();
    }


    public void doRun(){
        System.out.println("父线程："+flagInheritableThreadLocal.get());

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("子线程启动");
                System.out.println("子线程flagId："+flagInheritableThreadLocal.get());
            }
        }).start();


    }
}
