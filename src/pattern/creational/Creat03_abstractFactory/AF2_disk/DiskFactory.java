package pattern.creational.Creat03_abstractFactory.AF2_disk;

public interface DiskFactory {
    Hard createHard();

    SSD createSsd();

    M2 createM2();
}
