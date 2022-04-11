package multithreading;

public class mt02_Synchronized {

    private final Object PRIVATE_LOCK_OBJECT = new Object();

    private final Object LOCK_A = new Object();
    private final Object LOCK_B = new Object();
    private final Object LOCK_C = new Object();

    private static final Object LOCK = new Object();

    public synchronized void firstMethod() {
        //some code
    }

    public void secondMethod() {
        synchronized (this) {
            //some code
        }
    }

    public void thirdMethod() {
        synchronized (PRIVATE_LOCK_OBJECT) {
            //some code
        }
    }

    public static void foursMethod() {
        synchronized (mt02_Synchronized.class) {
            //some code
        }
    }

    public static synchronized void fivesMethod() {
        //do some code
    }


    /**
     * сначала захватывается LOCK_A, затем LOCK_В и LOCK_С,
     * а освобождаются в обратном порядке
     */
    public void sixsMethod (){
        synchronized (LOCK_A){
            synchronized (LOCK_B) {
                synchronized (LOCK_C) {
                    //do something
                }
            }

        }
    }

    public static void exceptionHanding() throws InterruptedException{
        final Object lock_for_exc = new Object();
        try {
            lock_for_exc.wait(); // будет выброшен IllegalMonitorStateException
        } catch (IllegalMonitorStateException | InterruptedException e) {
            e.printStackTrace();
        }
        /**
         * надо:
         */
        synchronized (LOCK) {
            LOCK.wait(1010);
        }
    }

    /**
     * из wait() можно выйти несколькими способами:
     * .notify() .notifyAll()
     * .interrupt() - InterruptedException
     * по истечении таймаута
     * spurious wakeup - поток случайно проснулся, чтобы этого избежать,
     * надо держать wait() в цикле while:
     */

    public static void sevensMethod() throws InterruptedException{
        synchronized (LOCK) {
            while (true){
                LOCK.wait();
            }
        }
    }

    /**
     * существует несколько состояний потока:
     * NEW - объект потока был создан, но не запущен;
     * RUNNABLE - поток запущен и выполняет код;
     * WAITING - поток не выполняет код и находится в wait set монитора;
     * BLOCKED - поток не выполняет код и находится в blocked set монитора;
     * TERMINATED - поток завершил свое выыполнение;
     */

    /**
     * ключевое слово volatile указывает, что взаимодействие с переменной
     * в памяти должно происходить минуя кэши процессора (processor cash memory)
     */
}
