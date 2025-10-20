import java.util.Scanner;

public class TaxTime {

    private static final Scanner keyboard = new Scanner(System.in);
    private static final int STINKING_RICH = 500000;
    private static final int QUITE_RICH = 200000;
    private static final int MIAMI_POOR = 100000;
    private static final int AVERAGE = 50000;
    private static final int REALISTIC = 20000;
    private static final double RICH_TAX = 0.25;
    private static final double MIAMI_TAX = 0.1;
    private static final double AVERAGE_TAX = 0.03;

    public static void main(String[] args) {
        System.out.println("Week 6 - LAb4 TAX TIME");

        double income = 0;
        double deductions = 0;
        char group;
        int input = 1;
        double taxable = 0;
        double tax = 0;

        while(input != 0){
            System.out.println("Enter next amount : ");
             input = keyboard.nextInt();
            if(input > 0){
                income += input;
            }
            else {
                deductions += Math.abs(input);
            }
        }
        taxable = computeTaxableIncome(income, deductions);
        group = chooseTaxGroup(taxable);
        tax = computeTax(taxable, group);
        displayTaxInformation(income, deductions, taxable, group, tax);


    } // end of the main method
    private static double computeTaxableIncome(double income, double deductions){
        if(income >= deductions){
            double taxable = income - deductions;
            return taxable;
        }
        else{
            double taxable = 0.0;
            return taxable;
        }

    } // end of computeTaxableIncome method

    private static char chooseTaxGroup(double taxable){
        if(taxable >= STINKING_RICH){
            return 'S';
        }
        else if (taxable >= QUITE_RICH) {
            return 'Q';
        }
        else if (taxable >= MIAMI_POOR) {
            return 'M';
        }
        else if (taxable >= AVERAGE) {
            return 'A';
        }
        else if (taxable >= REALISTIC) {
            return 'R';
        }
        else {
            return 'P';
        }
    } // end of chooseTaxGroup method
    private static double computeTax(double taxable, char group){
        if( group == 'S' || group == 'Q'){
            double tax = taxable * RICH_TAX;
            return tax;
        }
        else if (group == 'M') {
            double tax = taxable * MIAMI_TAX;
            return tax;
        }
        else if (group == 'A' || group == 'R') {
            double tax = taxable * AVERAGE_TAX;
            return tax;
        }
        else if (group == 'P') {
            double tax = taxable * 0.0;
            return tax;
        } else {
            System.out.println("Error!");
            double tax = taxable * 0.0;
            return tax;
        }

    }// end of computeTax method
    private static void displayTaxInformation(double income, double deductions, double taxable, char group, double tax){
        System.out.println("Income = $" + income);
        System.out.println("Deductions = $" + deductions);
        System.out.println("Taxable income = $" + taxable);
        System.out.println("Tax group : " + group);
        System.out.println("Tax owed = $" + tax);
    }// end of displayTaxInformation method



}// end of TaxTime class
