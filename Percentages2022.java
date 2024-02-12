
package percentages2022;
import java.util.Scanner;
public class Percentages2022 
{
    public static void computePercent(double x, double y)
    {
        System.out.println(x + " is " + ((x/y) * 100) + " percent of " + y);
    }
    public static void main(String[] args) 
    {
        // take in two doubles from user to use as functions of %
        double num1, num2;
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter a double >> ");
        num1 = kb.nextDouble();
        System.out.println("Enter another double >> ");
        num2 = kb.nextDouble();
        computePercent(num1, num2);
        computePercent(num2, num1);
    }
    
}
