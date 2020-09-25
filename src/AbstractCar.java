abstract public class AbstractCar {
    int wheels;
    String honkSound;

    abstract public void setHonkSound(String sound);
    abstract public void honk();

    abstract public int getWheels();
    abstract public void setWheels(int wheels);
}
