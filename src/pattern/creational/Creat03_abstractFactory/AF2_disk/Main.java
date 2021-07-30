package pattern.creational.Creat03_abstractFactory.AF2_disk;

import pattern.creational.Creat03_abstractFactory.AF2_disk.Intel.IntelFactory;

public class Main {
    public static void main(String[] args) {
        DiskFactory diskFactory = new IntelFactory();

        M2 m2 = diskFactory.createM2();
        SSD ssd = diskFactory.createSsd();
        Hard hard = diskFactory.createHard();
    }
}
