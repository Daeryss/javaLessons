package functionalProgramming;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.stream.Stream;

public class f6_Parallel {
    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>(20000000);
        for(int i = 0; i < 10000000; i++) {
            integers.add(i);
            integers.add(10000000 - i);
        }
        long start = System.nanoTime();
        integers.stream().sorted().count();
        System.out.printf("start %d finish %d\n",
                TimeUnit.NANOSECONDS.toSeconds(start), TimeUnit.NANOSECONDS.toSeconds(System.nanoTime()));



    }
}
