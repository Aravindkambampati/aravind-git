
package metricconversion;
import java.util.Scanner;
public class MetricConversion 
{

    public static void main(String[] args) 
    {
        // decalre a int variable to accept val from user and convert inches to cent. gallons to liters
        int aValue;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer >> ");
        aValue = input.nextInt();
        convertToCentimeters(aValue);
        convertToLiters(aValue);
    }
    public static void convertToCentimeters(int inches)
    {
        double centimeters;
        final double CENT_FACTOR = 2.54;
        centimeters = inches * CENT_FACTOR;
        System.out.println(inches + " inches is " + centimeters + " centimeters");
    }
    public static void convertToLiters(int gallons)
    {
        double liters;
        final double LITER_FACTOR = 3.78;
        liters = gallons * LITER_FACTOR;
        System.out.println(gallons + " gallons is " + liters + " liters");
    }
    
}
