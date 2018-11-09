package wzbsdb.thread.callable;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * ThreadPoolExecutor 测试类
 * @author Surging
 * @create 2018/10/29
 * @since 1.0.0
 */
public class ThreadPoolExecutorDemo {
    
    public static void main(String[] args) {
        //创建一个FixedThreadPool对象
        ExecutorService executor = Executors.newFixedThreadPool(5);
        for (int i = 0; i < 10; i++) {
            //创建WorkerThread对象（WorkerThread类实现了Runnable 接口）
            Runnable worker = new WorkerThread("" + i);
            executor.submit(worker);
        }
        //终止线程池
        executor.shutdown();
        while (!executor.isTerminated()) {

        }
        System.out.println("Finished all threads");
    }
}
