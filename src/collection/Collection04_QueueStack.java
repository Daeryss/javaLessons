package collection;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Collection04_QueueStack {
    public static void main(String[] args) {
        Queue<String> queue1 = new LinkedList<>();
        Queue <String> queue2 = new PriorityQueue<>();
        addToQueue(queue1);
        System.out.println(queue1.stream().findFirst()); // lnk to first
        System.out.println("linked list queue (without compare)");
        while (queue1.size() > 0) {
            System.out.println(queue1.poll()); // удаляет элементы
        }
        addToQueue(queue2);
        System.out.println("priority queue with compare");
        while (queue2.size() > 0) {
            System.out.println(queue2.poll()); // удаляет элементы
        }
        addToQueue(queue1);
        System.out.println(queue1.element()); // head
        System.out.println(queue1.peek()); // retrieves without remove head element
        System.out.println(queue1.poll()); // retrieves and remove head element
        System.out.println(queue1.remove()); // remove head element
        System.out.println(queue1.contains("Tokyo"));// true
        queue1.clear(); // remove all
        queue1.isEmpty();
        addToQueue(queue1);
        queue2.offer("Paris");
        queue2:queue1.offer("Tokyo");

        System.out.println(queue1.containsAll(queue2)); //true
        System.out.println(queue1.equals(queue2)); // false

    }

    static void addToQueue(Queue<String> queue){
        queue.offer("Moscow");
        queue.add("Berlin");

        Queue<String> queue1 = new LinkedList<>();
        queue1.offer("London");
        queue1.offer("Paris");
        queue1.offer("Tokyo");

        queue.addAll(queue1); // add queue
    }
}
