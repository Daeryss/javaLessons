package pattern.creational.Creat03_abstractFactory.AF2_disk.WD;

import pattern.creational.Creat03_abstractFactory.AF2_disk.DiskFactory;
import pattern.creational.Creat03_abstractFactory.AF2_disk.Hard;
import pattern.creational.Creat03_abstractFactory.AF2_disk.M2;
import pattern.creational.Creat03_abstractFactory.AF2_disk.SSD;

public class WDFactory implements DiskFactory {
    @Override
    public Hard createHard() {
        return new WDHard();
    }

    @Override
    public SSD createSsd() {
        return new WDSSD();
    }

    @Override
    public M2 createM2() {
        return new WDM2();
    }
}
