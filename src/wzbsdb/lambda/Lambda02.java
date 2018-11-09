package wzbsdb.lambda;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

public class Lambda02 {
    public static void main(String[] args) throws Exception{
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("start new Thread");
            }
        }).start();
        Callable<String> c1 = new Callable<String>() {
            @Override
            public String call() throws Exception {
                return "c1 start";
            }
        };
        FutureTask<String> future = new FutureTask<>(c1);
        new Thread(future).start();
        String result = future.get();
        System.out.println(result);
    }
}
