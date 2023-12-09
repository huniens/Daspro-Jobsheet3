/**
 * ExampleOperatorID12t2
 */
public class ExampleOperatorID12t2 {

    public static void main(String[] args) {
        int x = 10;
        System.out.println("Initial value of x = " + x);
        System.out.println("x++ = " + x++);
        System.out.println("After evaluation, x = " + x);
        x = 10;
        System.out.println("Initial value of x = " + x);
        System.out.println("++x= " + ++x);
        System.out.println("After evaluation, x = " + x);
        int y = 12;
        System.out.println(x > y || y == x && y <= x);
        int z = x ^ y;
        System.out.println("The result of x ^ y is" + z);
        z %= 2;
        System.out.println("Thec final result is " +x);
    }
    
}