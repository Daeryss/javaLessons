package multithreading;

import java.util.ArrayList;


/**
 * в данном примере wait находится в цикле, как только задач нет, то ресурсы перестают потребляться на используемый поток,
 * но если есть задачи, то notify разбудит тред и начинает выполнять код
 */
public class mt3_WaitNotify {
    public static void main(String[] args) {
        BlockingQueue queue = new BlockingQueue();

        Thread worker = new Thread(new Runnable() {
            @Override
            public void run(){
                while (true){
                    Runnable task = queue.get();
                    task.run();
                }
            }
        });
        worker.start();
        for(int i = 0; i< 10; i++) {
            queue.put(getTask());
        }
    }

    public static Runnable getTask() {
        return new Runnable() {
            @Override
            public void run() {
                System.out.println("Task started: " + this);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Task finished: " + this);
            }
        };
    }

    static class BlockingQueue {
        ArrayList<Runnable> tasks = new ArrayList<>();

        public synchronized Runnable get() {
            while (tasks.isEmpty()){
                try {
                    System.out.println(Thread.currentThread().getName() + "i'll go wait");
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            Runnable task = tasks.get(0);
            tasks.remove(task);
            return task;
        }

        public synchronized void put(Runnable task) {
            tasks.add(task);
            System.out.println(Thread.currentThread().getName() + "i'll go work");
            notify();
        }
    }
}
