public class Camry ...

    static public void main(String[] args){
        Camry myCar=new Camry();
        myCar.honk();
        myCar.setWheels(3);
        System.out.printf("myCar has %d wheels %n",myCar.getWheels());
        System.out.printf("myCar has %d years of warranty %n",
        myCar.warrantyInYears);
    }
}
