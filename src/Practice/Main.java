package Practice;

import java.lang.*;
public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("123456789", 10000, 5.0);
        int years = 2;

        double simpleInterest = account.getSimpleInterest(years);
        System.out.println("Simple Interest after " + years + " years: " + simpleInterest);

        double newBalance = account.getBalanceWithInterest(years);
        System.out.println("Balance after " + years + " years with interest: " + newBalance);
    }
}