abstract public class AbstractToyotaCar extends AbstractCar {
    String maker = "Toyota";
    int warrantyInYears = 3;
    int wheels = 4;

    abstract boolean hasPendingRecalls();
}
