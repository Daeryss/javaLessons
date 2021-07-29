package pattern.creational.Creat01_Singleton.Sing02_greedy;

import java.util.ArrayList;
import java.util.List;
/*
не потокобезопасный вариант, можно выловить две разные сущности,
если синглтон не final
 */
public class Main {
    public static void main(String[] args) {
        List<Thread> threads = new ArrayList<>();
        for(int i = 0; i < 20; i++){
            var thread = new SingleThread();
            threads.add(thread);
        }

        threads.parallelStream().forEach(thread -> thread.start());
    }
}
