/**
 * - Check comments below on main()
 */

public class PoliceCar extends Car {  // Car extends Vehicle

    String honkSound = "PoliceCar honk";
    int wheels       = 4;

    public void setHonkSound (String honkSound) {
        this.honkSound = honkSound;
    }

    public void honk()	{
        System.out.println( honkSound );
    }

    public int getWheels ()    {
        return wheels;
    }

    public void onlyACarPoliceCanDoThis() {
        System.out.println( "onlyACarPoliceCanDoThis" );
    }

    public static void main( String[] args )	{

        // Here we create a single object and assign it to differently typed
        // variables, then call .method() from each of these variables.
        // - Is the honk sound the same? Why?
        PoliceCar aPoliceCar = new PoliceCar();
        Car aCar = aPoliceCar;
        Vehicle aVehicle = aCar;
        aVehicle.honk();
        aCar.honk();
        aPoliceCar.honk();

        // Now we do something similar, but instead of calling a method,
        // we access the field directly.
        // - What happens now? Why?
        System.out.println(aVehicle.honkSound);
        System.out.println(aCar.honkSound);
        System.out.println(aPoliceCar.honkSound);

        // Here we call a Car method from a PoliceCar and from a Car variable.
        // Then we try to call a Car (child) method on a Vehicle variable.
        // Will this compile?
        aPoliceCar.onlyACarPoliceCanDoThis();
        aCar.onlyACarCanDoThis();
//        aVehicle.onlyACarCanDoThis();
    }
}

