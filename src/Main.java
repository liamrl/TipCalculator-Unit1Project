import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // asking user to input variables necessary for calculations
        System.out.println("What is the bill without the tip?");
        double originalBill = scan.nextDouble();


        System.out.println("What would you like to tip (as a whole number without a percent sign)?");
        int tipPercentage = scan.nextInt();


        System.out.println("How many people are splitting the bill?");
        int numofPeople = scan.nextInt();


        // calculations for variables that will be outputted


        double tip = originalBill * (tipPercentage / 100.00);
        tip = (double) Math.round(tip * 100) / 100.00;


        double tipPerPerson = tip / numofPeople;
        tipPerPerson = (double) Math.round(tipPerPerson * 100.00) / 100.00;




        double tipPlusBill = originalBill + tip;
        tipPlusBill = (double) Math.round(tipPlusBill * 100.00) / 100.00;




        double tipBillPerPerson = tipPlusBill / numofPeople;
        tipBillPerPerson = (double) Math.round(tipBillPerPerson * 100.00) / 100.00;


        // outputting data
        System.out.println("The total tip amount is $" + tip);
        System.out.println("The tip per person amount is $" + tipPerPerson);
        System.out.println("The total bill including tip is $" + tipPlusBill);
        System.out.println("The total bill per person is $" + tipBillPerPerson);




    }
}
