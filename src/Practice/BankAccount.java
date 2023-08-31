package Practice;
// BankAccount class represents a basic bank account with simple interest calculations.
public class BankAccount {
    private String accountNumber;
    private int balance;
    private double roi;

    public BankAccount(String accountNumber, int balance, double roi) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.roi = roi;
    }

    public double getSimpleInterest(int time) {
        double simpleInterest = (balance * roi * time) / 100;
        return simpleInterest;
    }

    public double getBalanceWithInterest(int time) {
        double simpleInterest = getSimpleInterest(time);
        double newBalance = balance + simpleInterest;
        return newBalance;
    }
}