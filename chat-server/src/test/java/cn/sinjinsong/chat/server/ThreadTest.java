package cn.sinjinsong.chat.server;

public class ThreadTest {
    public static void main(String[] args) {
        Thread t1=new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("run1");
            }
        });
        Thread t2=new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("run2");
            }
        });
        t2.start();
        t1.start();

    }
}
