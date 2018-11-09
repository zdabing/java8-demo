package wzbsdb.thread.callable;

import java.time.LocalTime;

/**
 * 这是一个简单的Runnable类，需要大约5秒钟来执行其任务。
 * @author Surging
 * @create 2018/10/29
 * @since 1.0.0
 */
public class WorkerThread implements Runnable{

    private String command;

    public WorkerThread(String s) {
        this.command = s;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " Start. Time = " + LocalTime.now());
        processCommand();
        System.out.println(Thread.currentThread().getName() + " End. Time = " + LocalTime.now());
    }

    private void processCommand() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String toString() {
        return this.command;
    }
}
