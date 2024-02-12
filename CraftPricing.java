
package craftpricing;
import java.util.Scanner;
public class CraftPricing 
{
    public static void main(String[] args) 
    {
        // create variables and take in values for name, hours and material cost
        String product;
        double materials;
        double hours;
        double price;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter product description >> ");
        product = input.nextLine();
        System.out.println("Enter cost of materials >> ");
        materials = input.nextDouble();
        System.out.println("Enter hours of work >> ");
        hours = input.nextDouble();
        price = computePrice(materials, hours);
        System.out.println("The price for the product " + product + " is $" + price);
    }
    public static double computePrice(double materials, double hours)
    {
        double price;
        final double RATE = 12.00;
        final double S_AND_H = 7.00;
        price = materials + (hours * RATE) + S_AND_H;
        return price;
    }
}
