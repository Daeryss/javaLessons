package multithreading;

/**
 * разница между .run() start() в том, что
 * .run() - выполняется в том же потоке (main()), что создал его, как метод,
 * а start() - запускает новый поток.
 */

public class mt01_Thread {
    public static void main(String[] args) {

        /**
         * расширяем класс Thread и запускаем поток через .start()
         */
        MyThread myThread = new MyThread();
        myThread.start();

        /**
         * реализуем интерфейс Runnable, метод run()
         * создаем новый экземпляр класса Thread и передаем ему в конструктор
         * реализованный интерфейс
         */
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("hello runnable");
            }
        };
        Thread t = new Thread(runnable);
        t.start();

        /**
         * объект текущего потока можно плучить из Thread.currentThread()
         * .getName(), setName() - олучение и изменение имени потока
         * стандартный формат для имени потока thread-N,
         * для пула потоков - pool-N-thread-M (N - num of pool, M- num of thread in pool)
         */
        System.out.println(Thread.currentThread().getName());
        Thread.currentThread().setName("main thread");
        System.out.println(Thread.currentThread().getName());

        /**
         * у потоков есть приоритет от 1 до 10. Приоритет main - 5.
         * приоритет порожденных потоков равен приоритету родительского.
         * изменить можно при помощи.setPriority(int).
         * Поток с большим приоритетом будет иметь больше процессорного времению
         * Если потоки имеют одинаковый приоритет, то решение будет принято при помощи
         * алгоритма-планировщика.
         * Thread.MIN_PRIORITY - 1
         * Thread.NORM_PRIORITY - 5
         * Thread.MAX_PRIORITY - 10
         */

        Thread.currentThread().setPriority(8);
        Thread thread1 = new Thread() {
            @Override
            public void run() {
                Thread.currentThread().setName("Inner thread");
                System.out.println(Thread.currentThread().getName());
                System.out.println(Thread.currentThread().getPriority());
            }
        };

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        thread1.start();

        /**
         * .join() - позволяет дождаться одному потоку выполнение второго
         * также можно вызвать .join(3333), где 3333 - время ожидания
         */

        /**
         * для прерывания работы потока используется метод .interrupt()
         * также есть boolean .isInterrupted() - возвращает значение флага и не изменяет его
         * .interrupted() - возвращает значение флага и устанавливает его значение в false.
         * Если флаг interrupted был true, то в первый раз вернет true, в последующие false
         *
         *
         * есть блокирующие sleep(), wait(), join() методы.
         * Если поток был прерван пока выполнял не блокирующие вычисления, они не будут
         * прерваны незамедлительно, однако поток уже отмечен, как прерванный, а любая слудующая блокировка
         * выкинет InterruptedException
         *
         * для этого следует обрабатывать в методе run()
         */

        Thread thread2 = new Thread() {
            @Override
            public void run() {
                while (Thread.currentThread().isInterrupted()) {
                    //doSomething;
                }
            }
        };

    }

    private static class MyThread extends Thread {
        public void run() {
            long sum = 0;
            for (int i = 0; i < 1000; ++i) {
                sum += i;
            }
            System.out.println(getName() + " " + sum);
        }
    }
}




