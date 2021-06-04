package unit_1;

public class Budget {
    public static void main(String[] args) {
        //income section
        double hourlyRate = 16.55;
        int hoursWorked = 160; //per month
        double monthlyIncome = hourlyRate * hoursWorked ;

        //expenses section
        int monthlyRent = 800; //new bedford 2266 acushnet ave
        int carPayment = 300;
        int gymMembership = 20;
        int utilities  = 90;
        int monthlyExpenses = monthlyRent + carPayment + gymMembership + utilities;

        //savings calculations
        double savings  = monthlyIncome - monthlyExpenses;

        //printing out the final results
        System.out.print("With a monthly income of $" + monthlyIncome + " and monthly expenses of $" + monthlyExpenses);
        System.out.println(" you should save about $" + savings + " per month");

    }
}
