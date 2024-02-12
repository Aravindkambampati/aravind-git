// Numbers Demo2
package numbersdemo;
import java.util.Scanner;
public class NumbersDemo 
{

    public static void main(String[] args) 
    {
        // Declare Variables for user input then use three method calls to show various display implementations
        int num1, num2;
        Scanner kb = new Scanner(System.in);
        System.out.println("Please enter an integer for this program to use >> ");
        num1 = kb.nextInt();
        System.out.println("Please enter another integer for this program to use >> ");
        num2 = kb.nextInt();
        displayTwiceTheNumber(num1);
        displayNumberPlusFive(num1);
        displayNumberSquared(num1);
        displayTwiceTheNumber(num2);
        displayNumberPlusFive(num2);
        displayNumberSquared(num2);
    }
    public static void displayTwiceTheNumber(int n)
    {
        final int FACTOR = 2;
        System.out.println(n + " times " + FACTOR + " is " + (n * FACTOR));
    }
    public static void displayNumberPlusFive(int n)
    {
        final int FACTOR = 5;
        System.out.println(n + " plus " + FACTOR + " is " + (n + FACTOR));
    }
    public static void displayNumberSquared(int n)
    {
        System.out.println(n + " squared is " + (n * n));
    }
}
