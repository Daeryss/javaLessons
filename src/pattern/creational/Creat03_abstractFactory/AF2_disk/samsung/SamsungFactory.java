package pattern.creational.Creat03_abstractFactory.AF2_disk.samsung;

import pattern.creational.Creat03_abstractFactory.AF2_disk.DiskFactory;
import pattern.creational.Creat03_abstractFactory.AF2_disk.Hard;
import pattern.creational.Creat03_abstractFactory.AF2_disk.M2;
import pattern.creational.Creat03_abstractFactory.AF2_disk.SSD;

public class SamsungFactory implements DiskFactory {
    @Override
    public Hard createHard() {
        return new SamsungHard();
    }

    @Override
    public SSD createSsd() {
        return new SamsungSSD();
    }

    @Override
    public M2 createM2() {
        return new SamsungM2();
    }
}
