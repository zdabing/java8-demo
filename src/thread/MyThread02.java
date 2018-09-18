package thread;

public class MyThread02 implements Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "我实现了Runnable接口" + Thread.currentThread().getId());
    }
}
