package multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 *      ThreadPoolExecutor — пул потоков, который содержит фиксированное количество потоков.
 * Также этот пул можно создать с использованием конструктора через ключевое слово new.
 *      Executors.newCachedThreadPool() возвращает пул потоков, если в пуле не хватает потоков,
 * в нем будет создан новый поток.
 *      Executors.newSingleThreadExecutor() — пул потоков, в котором есть только один поток.
 *      ScheduledThreadPoolExecutor — этот пул потоков позволяет запускать задания с определенной
 * периодичностью или один раз по истечении промежутка времени.
 */

public class mt6_ThreadPool {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(5);

        for(int i = 0; i < 5; i++){
            executorService.submit(new Work(i));
        }
        /** отправить на выполнение */
        executorService.shutdown();
        System.out.println("All tasks submitted");

        /** что-то вроде join(), те поток main заснет и будет ждать, пока выполнитьсяб либо стартанет по истечению таймаута */
        executorService.awaitTermination(1, TimeUnit.DAYS);

        System.out.println("main thread complete work");
    }
}

class Work implements Runnable {

    int id;

    public Work(int id) {
        this.id = id;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Work " + id + "was completed " + Thread.currentThread().getName());
    }
}
