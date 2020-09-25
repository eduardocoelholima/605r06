public class Car extends Vehicle {

    String honkSound = "Car honk";
    int wheels       = 4;

    public void setSound (String honkSound)    {
        this.honkSound = honkSound;
    }

    public int getWheels ()    {
        return wheels;
    }

    public void honk()	{
        System.out.println(honkSound);
    }

    public void onlyACarCanDoThis()	{
	System.out.println("onlyACarCanDoThis");
  }

    public static void main(String[] args )	{
        new Vehicle().honk();
        new Car().honk();
    }

}
