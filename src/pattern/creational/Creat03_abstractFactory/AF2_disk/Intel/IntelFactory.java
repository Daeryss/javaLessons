package pattern.creational.Creat03_abstractFactory.AF2_disk.Intel;

import pattern.creational.Creat03_abstractFactory.AF2_disk.DiskFactory;
import pattern.creational.Creat03_abstractFactory.AF2_disk.Hard;
import pattern.creational.Creat03_abstractFactory.AF2_disk.M2;
import pattern.creational.Creat03_abstractFactory.AF2_disk.SSD;

public class IntelFactory implements DiskFactory {
    @Override
    public Hard createHard() {
        return new IntelHard();
    }

    @Override
    public SSD createSsd() {
        return new IntelSSD();
    }

    @Override
    public M2 createM2() {
        return new IntelM2();
    }
}
