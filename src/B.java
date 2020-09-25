/**
 * - Check the main() output, explain what is happening
 *
 * - Can I call a B-specific method on obj? Why?
 * - What does (B) represent in B obj2 = (B)obj?
 * - What is a method override?
 * - What is a field hiding?
 */

public class B extends A
{
    protected int value = 2;

    public B() { System.out.print("*"); }

    public void bMethod () {
        System.out.println("\nb exclusive");
    }

    public void methodOne() {
        System.out.print("B");
    }

    public static void main ( String [] args ) {
        A obj = new B();

//        //downcasting
//        B obj2 = (B) obj;
//        obj2.bMethod();

//        //field hiding
//        System.out.println(obj.value);
//        System.out.println(obj2.value);

    }
}
