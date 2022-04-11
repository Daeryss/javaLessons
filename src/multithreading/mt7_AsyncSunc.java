package multithreading;

import java.awt.*;
import java.util.concurrent.*;

public class mt7_AsyncSunc {
    private int result;

    //java 1
    public void testFutureOldStyle() throws InterruptedException {
        Thread t = new Thread() {
            public void run() {
                result = slowInt(); //тк void run() мы можем получить результат только через общие переменные класса
            };
        };
        t.start();
        t.join();
        System.out.println("testFutureOldStyle() is finished " + result);
    }

    //java 5-7
    public void futureTest() throws ExecutionException, InterruptedException {
        Callable<Integer> r = this::slowInt;
        ExecutorService es = Executors.newFixedThreadPool(10);
        Future<Integer> future = es.submit(r);
        Integer res = future.get();
        System.out.println("futureTest() is finished " + res);
    }

    //java 8
    public void promiseTest() throws ExecutionException, InterruptedException {
        CompletableFuture<Integer> future = CompletableFuture.supplyAsync(this::slowInt);
        Integer res = future.get();
        System.out.println("promiseTest() is finished " + res);

    }

    //using CompletableFuture to execute several tasks
    public void promiseTestNext() throws ExecutionException, InterruptedException {

        //поток запустился, поставил задачи в CompletableFuture и пошел дальше, пример Async
        CompletableFuture<Void> future =
                CompletableFuture
                        .supplyAsync(this::slowInt)
                        .thenAccept(
                                (res) -> { System.out.println("finished " + res);}
                        )
                        .thenRun(
                                () -> {System.out.println("look at results");}
                        );
        future.get(); // данная операция нужна, если мы хотим дождаться результатов из future
        System.out.println("promiseTestNext() is finished");
    }

    public void promiseTestInc() throws ExecutionException, InterruptedException {
        long start = System.nanoTime();

        CompletableFuture<?> future =
                CompletableFuture.supplyAsync(this::slowInt) //1
                        .thenApply(this::slowIncrement) //2
                        .thenApply(this::slowIncrement) //3
                        .thenAccept(res -> System.out.println("async result: " + res));
        future.get();
        long elapsedTime = System.nanoTime() - start;
        System.out.printf("%d sec passed\n",
                TimeUnit.NANOSECONDS.toSeconds(elapsedTime));
    }

    public void promiseTestInc2() throws ExecutionException, InterruptedException {
        CompletableFuture<Integer> future1 =
                CompletableFuture.supplyAsync(this::slowInt) //1
                        .thenApply(this::slowIncrement); //2
        CompletableFuture<Integer> future2 =
                CompletableFuture.supplyAsync(this::slowInt);
        Integer res0 = slowInt();
        Integer res1 = future1.get();
        Integer res2 = future2.get();
        System.out.printf("tasks are finished with results " + res0 + ", "+ res1 + ", and " + res2);
    }

    public Integer slowInt(){
        System.out.println("started task slowInt()");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return 1;
    }

    public Integer slowIncrement(Integer i) {
        System.out.println("started task slowIncrement()");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("finished increment with result " + (i+ 1));
        return (i+1);

    }
}
