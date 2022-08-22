import java.util.*;

public class Account {
    protected int id = 0;
    protected double balance = 0;
    protected double annualInterestRate = 0;
    protected Date dateCreated = new Date();

    public Account() {
    }

    public Account(int id, double balance) {
        System.out.println("Account");
        System.out.println("Balance is: " + balance);
        this.id = id;
        this.balance = balance;

    }

    public int getID() {
        return id;

    }

    public double getBalance() {
        return balance;

    }

    public double getAnnualInterestRate() {
        return annualInterestRate;

    }

    public void setID(int newId) {
        id = newId;

    }

    public void setBalance(double newBalance) {
        balance = newBalance;

    }

    public void setAnnualInterestRate(double newAnnualInterestRate) {
        annualInterestRate = newAnnualInterestRate / 100.0;

    }

    public void withDraw(int amount) {
        balance -= amount;
        System.out.println("Withdraw : " + amount);

    }

    public void deposit(int amount) {
        balance += amount;

    }

    public double getMonthlyInterestRate() {
        return annualInterestRate / 12.0;

    }

    public double getMonthlyInterest() {
        return balance * getMonthlyInterestRate();

    }

    public Date getDateCreated() {
        return dateCreated;

    }

    public String toString() {
        return "Balance is " + balance +
                "\nThis account was created at" + dateCreated;

    }
}