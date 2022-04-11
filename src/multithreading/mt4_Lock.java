package multithreading;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * В пакете locks находятся высокоуровневые блокировки, использование
 * которых более удобно по сравнению с ключевым словом synchronized.
 * Базовый интерфейс блокировок — java.util.concurrent.locks.Lock.
 * Методы этого интерфейса:
 *
 * void lock() — захватывает блокировку, если она доступна. Если блокировка
 * занята другим потоком, текущий поток, который выполняет этот код,
 * переходит в статус BLOCKED;
 * void lockInterruptibly() — делает то же, что и метод lock(), но позволяет
 * прервать блокированный поток и восстановить выполнение через InterruptedException;
 * boolean tryLock() — неблокирующий вариант метода lock(). Если удалось
 * получить блокировку, то метод возвращает true;
 * boolean tryLock(long timeout, TimeUnit timeUnit) — то же, что tryLock(),
 * за исключением того, что метод ждет определенное время, перед тем остановить
 * попытку получения блокировки;
 * void unlock() — отпускает блокировку.
 */

public class mt4_Lock {

    public static void main(String[] args) {
        //rentalLockMethod();
        reentrantReadWriteLockMethod();

    }

    private void firstMethod() {
        Object synchronizedObj = new Object();

        synchronized(synchronizedObj) {
            //some code that should be synchronized
        }
    }

    /**
     * Блокировка c не знает, что была захвачена блокировка b, соответственно, блокировка
     * b не знает, что была захвачена блокировка a. Отпустить блокировку a внутри блока
     * синхронизации блокировки b или с не представляется возможным. Блокировна, основанная
     * на ReentrantLock, такую возможность предоставляет, потому что методы захвата и
     * освобождения блокировки это отдельные методы. Класс ReentrantLock возлагает на
     * программиста корректность захвата и отпускания блокировки.  Записать это можно, например так:
     */
    private void secondMethod() {
        Object a = new Object();
        Object b = new Object();
        Object c = new Object();
        synchronized(a) {
            synchronized(b) {
                synchronized(c) {
                }
            }
        }
    }


    /**
     *          ====Lock====
     * Такие возможности Lock могут пригодиться, когда производится работа, например, с древовидной
     * структурой данных из нескольких потоков. Если будет производится блокировка корневого узла,
     * при этом будут изменяться какие-то дочерние узлы, производительность всей системы будет низкой,
     * потому что в каждый конкретный момент времени с деревом будет работать только один поток. Однако
     * каждый узел дерева можно сопоставить с отдельной блокировкой и использовать ту, поддерево которой
     * подлежит изменению. Остальные блокировки, расположенные выше по дереву, можно отпустить, чтобы
     * другие потоки могли их захватить, и изменять другую часть дерева.
     */
    private void thirdMethod(){
        Thread r = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("hi");
            }
        });

        Thread t = new Thread(r);

        Lock reentrantLock = new ReentrantLock();
        reentrantLock.lock();
        try {
            //this code will be executed in synchronization section
        } finally {
            reentrantLock.unlock();
            //reentrantLock.unlock(); - получим IllegalMonitorStateException
        }
    }


    /**
     *  У класса ReentrantLock, кроме методов интерфейса Lock, есть фабричный метод
     *  newCondition(). Этот метод возвращает объект Condition, который позволяет
     *  добавить текущий поток в wait set данного объекта Condition. Это дает возможность
     *  организовывать разные условия ожидания по одной и той же блокировке, чего не
     *  позволяют ключевое слово synchronized и связки методов wait()/notify(). Для того
     *  чтоб объект попал в wait set для данного Condition объекта, нужно вызвать метод
     *  await(). Чтобы разбудить поток или потоки, которые есть в wait set, необходимо
     *  вызвать методы signal() или signalAll(). Эти методы аналогичны методам wait(),
     *  notify() и notifyAll() у объекта Object.
     */
    public static void rentalLockMethod() {
        /** беспорядочный вывод и борьба за монитор **/

        /*
        final Object ref = new Object(); // беспорядочный вывод и борьба за монитор
        new Thread(new Runnable() {
            @Override
            public void run() {
                while(true) {
                    synchronized(ref) {
                        System.out.println("A");
                        try {
                            Thread.sleep(500);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                while(true) {
                    synchronized(ref) {
                        System.out.println("B");
                        try {
                            Thread.sleep(500);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                while(true) {
                    synchronized(ref) {
                        System.out.println("C");
                        try {
                            Thread.sleep(500);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }).start();
         */

        /**Если в конструктор ReentrantLock передать параметр true, получается честная
        *  блокировка. Она превращает blocked set в упорядоченную очередь. **/

        final Lock ref = new ReentrantLock(true);
        new Thread(new Runnable() {
            @Override
            public void run() {
                while(true) {
                    ref.lock();
                    System.out.println("A");
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    ref.unlock();
                }
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                while(true) {
                    ref.lock();
                    System.out.println("B");
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    ref.unlock();
                }
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                while(true) {
                    ref.lock();
                    System.out.println("C");
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    ref.unlock();
                }
            }
        }).start();
    }

    public static void reentrantReadWriteLockMethod(){
        ReadWriteLock lock = new ReentrantReadWriteLock();
        Lock rLock1 = lock.readLock();
        Lock rLock2 = lock.readLock();
        Lock wLock1 = lock.writeLock();
        Lock wLock2 = lock.writeLock();
        System.out.println(rLock1 == rLock2);
        System.out.println(wLock1 == wLock2);
    }

    /**
     * CowntDownLatch — защелка с обратным отсчетом. Позволяет задать значение счетчика,
     * а когда его значение будет равно нулю, заблокированные потоки на этой блокировке
     * будут одновременно запущены. В конструктор CountDownLatch передаётся число. Поток,
     * который использует CountDownLatch, может уменьшить это число и заблокироваться.
     * Для уменьшения числа в счетчике вызывается метод countDown(). После вызова этого
     * метода поток продолжает свое выполнение. Для того чтоб заблокировать поток, необходимо
     * вызвать метод await().
     */
}
