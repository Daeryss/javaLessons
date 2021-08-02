package pattern.creational.Creat04_builder.Build01_moto;

public class Moto {

    private  int engineCapacity;
    private  int power;
    private  int maxSpeed;
    private  String modalName;

    public Moto(int engineCapacity, int power, int maxSpeed, String modalName) {
        this.engineCapacity = engineCapacity;
        this.power = power;
        this.maxSpeed = maxSpeed;
        this.modalName = modalName;
    }

    public int getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(int engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public String getModalName() {
        return modalName;
    }

    public void setModalName(String modalName) {
        this.modalName = modalName;
    }

    @Override
    public String toString() {
        return new StringBuilder().
                append("Moto{").
                append("engineCapacity=").append(engineCapacity).
                append(", power=").append(power).
                append(", maxSpeed=").append(maxSpeed).
                append(", modalName='").append(modalName).
                append('\'').append('}').
                toString();
    }
}
