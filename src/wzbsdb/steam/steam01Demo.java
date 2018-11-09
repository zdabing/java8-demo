package wzbsdb.steam;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.IntStream;

public class steam01Demo {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(10);

        for(int i = 0; i < 5; i++) {
            int temp = i;
            executorService.submit(new Runnable() {
                public void run() {
                    System.out.println("Running task " + temp);
                }
            });
        }
        IntStream.range(0,5).forEach(System.out::println);
        executorService.shutdown();
    }
}
