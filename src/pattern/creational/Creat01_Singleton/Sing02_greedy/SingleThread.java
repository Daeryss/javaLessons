package pattern.creational.Creat01_Singleton.Sing02_greedy;

import java.util.concurrent.locks.LockSupport;

public class SingleThread extends Thread{

    @Override
    public void run(){
        LockSupport.parkNanos(2000*100000000);
        System.out.println(Single.getInstance());
    }
}
