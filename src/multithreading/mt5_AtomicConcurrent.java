package multithreading;

import java.util.*;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

public class mt5_AtomicConcurrent {
    /**
     * С выходом Java 1.5 появились классы атомарных переменных:
     * AtomicInteger AtomicLong, AtomicBoolean, AtomicReference.
     * Они находятся в пакете java.util.concurrent.atomic.
     * Алгоритм compare and swap (CAS) работает следующим образом:
     * есть ячейка памяти, текущее значение в ней и то значение,
     * которое хотим записать в эту ячейку.
     * CAS также содержит счетчик изменений, так, если значения равны, а счетчик нет,
     * то операция не будет выполнена.
     */

    public void atomicVariables(){
        AtomicInteger aInt = new AtomicInteger(1);
        AtomicLong aLong = new AtomicLong(2);
        AtomicBoolean aBoolean = new AtomicBoolean(true);
    }

    /**
     * C выходом Java 1.2 появился утилитный класс Collections, который предоставляет
     * статические методы для оборачивания стандартных коллекций в их синхронизированные
     * представления. Это сделано для совместимости с Java версией 1.
     */

    public void concurrentCollections() throws InterruptedException {
        /**
         * CopyOnWriteArrayList используется, когда есть много потоков, которые читают элементы
         * из коллекции, и несколько потоков, которые редко записывают данные в коллекцию.
         * Copy on write структура создает новую копию данных при записи в эту структуру.
         * Это позволяет нескольким потокам одновременно читать данные, и одному потоку записывать
         * элементы в коллекцию в каждый конкретный момент времени.
         */
        CopyOnWriteArrayList <Object> copyOnWriteArrayList = new CopyOnWriteArrayList<Object>(); // копирование при записи
        CopyOnWriteArraySet <Object> copyOnWriteArraySet = new CopyOnWriteArraySet<>(); // копирование при записи
        ConcurrentSkipListSet <Object> concurrentSkipListSet = new ConcurrentSkipListSet<>(); //skip list
        ConcurrentHashMap <Object, Object> concurrentHashMap = new ConcurrentHashMap<>();
        ConcurrentSkipListMap <Object, Object> concurrentSkipListMap = new ConcurrentSkipListMap<>();
        ConcurrentLinkedQueue <Object> concurrentLinkedQueue = new ConcurrentLinkedQueue<>();
        ConcurrentLinkedDeque <Object> concurrentLinkedDeque = new ConcurrentLinkedDeque<>();
        ArrayBlockingQueue <Object> arrayBlockingQueue = new ArrayBlockingQueue<Object>(12);
        // DelayQueue <E extends Delayed>
        LinkedBlockingQueue <Object> linkedBlockingQueue = new LinkedBlockingQueue<>();
        PriorityBlockingQueue <Object> priorityBlockingQueue = new PriorityBlockingQueue<>();
        SynchronousQueue <Object> synchronousQueue = new SynchronousQueue<>();
        LinkedBlockingDeque <Object> linkedBlockingDeque = new LinkedBlockingDeque<>();
        LinkedTransferQueue <Object> linkedTransferQueue = new LinkedTransferQueue<>();

        /**
         * Применяют декоратор к обычной коллекции, который оборачивает каждый метод в synchronized-блок,
         * в результате чего при каждом чтении или изменении обернутой коллекции происходит блокировка всех
         * остальных операций. Т. к. перечисленные методы были добавлены для обратной совместимости, в новых
         * многопоточных программах лучше использовать многопоточные коллекции, которые мы рассмотрим далее.
         */
        List<Integer> syncList = Collections.synchronizedList(new ArrayList<>());
        Map<Object, Object> syncMap = Collections.synchronizedMap(new HashMap<>());
        Set<Object> syncSet = Collections.synchronizedSet(new TreeSet<>());

        /**
         * Каждый элемент skip list структуры, кроме значения, содержит ссылку на соседние элементы.
         * Также есть ссылки высших порядков, которые указывают на элементы, находящиеся впереди текущего,
         * на произвольное число в определенном диапазоне, заданном для этого уровня ссылок. Для следующего
         * уровня ссылок это число больше, чем для предыдущего.
         */

        /**
         * BlockingQueue — FIFO интерфейс потокобезопасных очередей, в которую несколько потоков могут записывать
         * данные и читать их оттуда. Это достигается за счет способности очереди блокировать поток, который
         * добавляет или читает элементы из очереди. Например, когда поток пытается получить элемент из очереди,
         * но очередь пустая — поток блокируется. Или когда поток пытается положить объект в очередь, которая уже
         * заполнена, поток тоже блокируется.
         * BlockingQueue: ArrayBlockingQueue, DelayQueue, LinkedBlockingQueue, PriopityBlockingQueue, SynchronousQueue.
         */

        LinkedBlockingQueue <Integer> lbq = new LinkedBlockingQueue<>();
        //lbq.add(null); //NullPointerException
        /**Если немедленное выполнение операции невозможно, генерируется исключение.*/
        lbq.add(21);
        lbq.add(23);
        lbq.remove(21);

        /** Если немедленное выполнение операции невозможно, возвращается значение — в основном true или false.*/
        lbq.offer(10);
        lbq.peek();
        lbq.poll();

        /** Если немедленное выполнение операции невозможно, то поток, выполняющий эту операцию блокируется.*/
        lbq.put(20);
        lbq.take();
        System.out.println(lbq.toString());

        /**
         * Есть три реализации интерфейса Map для работы в многопоточных коллекциях:
         *      HashTable - устарел. Все методы synchronized, работает медленно, тк нет возможности читать и писать
         * одновременно.
         *      ConcurrentHashMap - Если происходит чтение, сегмент не блокируется, и несколько потоков могут читать данные
         * одновременно. Операции изменения карты могут происходить одновременно в том случае, когда потоки обращаются к
         * разным сегментам. Рехеширование в ConcurrentHashMap происходит по отдельности в каждом сегменте, поэтому оно
         * может выполняться одновременно с записью в другой сегмент
         *      ConcurrentSkipListMap - Этот класс использует принцип skipList, который рассмотрен ранее.
         * ConcurrentSkipListMap сортирует ключи в соответствии с natural sortлиng или с логикой компаратора, который
         * передается конструктору. Класс реализует интерфейсы SortedMap, NavigableMap, ConcurrentMap, ConcurrentNavigableMap.
         * ConcurrentSkipListMap гарантирует выполнение всех основных операций за O(log(n)).
         */

    }


}
