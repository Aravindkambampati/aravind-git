import java.util.Scanner;
public class Insurance {
    public static void main(String args[]) {
        
    Scanner input1=new Scanner(System.in);
    System.out.print("Enter The Present Year:\n");
    int year1=input1.nextInt();
    
    Scanner input2=new Scanner(System.in);
    System.out.print("Enter The Year Of Birth Of An Employee:\n");
    int year2=input2.nextInt();
    premium_calculation(year1,year2);
      
    }
     public static void premium_calculation(int year1,int year2){
         int age=year1-year2;
         int decade=age/10;
          int premium=(decade+15)*20;
          System.out.print(" Returned Premimum Amount  For TheEmployee is\n:"+premium+"$\n");
         
         
     }
    
}