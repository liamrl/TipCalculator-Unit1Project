import java.util.Scanner;
import java.text.DecimalFormat;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DecimalFormat form = new DecimalFormat("#.00");
      
        // asking user to input variables necessary for calculations
        System.out.println("What is the bill without the tip?");
        double originalBill = scan.nextDouble();

        System.out.println("What would you like to tip (as a whole number without a percent sign)?");
        
        int tipPercentage = scan.nextInt();

        System.out.println("How many people are splitting the bill?");
        int numofPeople = scan.nextInt();

        // calculations for variables that will be outputted

        double tip = originalBill * (tipPercentage / 100.0) ; 
      
        double tipPerPerson = tip / numofPeople;

        // rounding 
        double tippp = Math.round(tipPerPerson * 100.0);
        tippp /= 100.0;

        if ((tipPerPerson - tippp) < .005){
          tipPerPerson += .005;
        }
      
        double tipPlusBill = originalBill + tip;

        double tipBillPerPerson = tipPlusBill / numofPeople;

        // rounding
        double tipbpp = Math.round(tipBillPerPerson * 100.0);
        tipbpp /= 100.0;

        if ((tipBillPerPerson - tipbpp) < .005){
          tipBillPerPerson += .005;
        }


        // outputting data
        System.out.println("The total tip amount is $" + form.format(tip));
        System.out.println("The tip per person amount is $" + form.format(tipPerPerson));
        System.out.println("The total bill including tip is $" + form.format(tipPlusBill));
        System.out.println("The total bill per person is $" + form.format(tipBillPerPerson));
  }
}
