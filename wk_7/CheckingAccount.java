import java.util.*;

public class CheckingAccount extends Account {

    private double overDraftLimit;

    CheckingAccount() {
    }

    CheckingAccount(int newId, double newBalance, double newOverDraftLimit) {
        System.out.println("Checking Account");
        System.out.println("Overdraft Limit: " + newOverDraftLimit);
        System.out.println("Balance is: " + newBalance);
        id = newId;
        this.balance = newBalance;
        this.overDraftLimit = newOverDraftLimit;
        this.dateCreated = new Date();

    }

    public void withdraw(double amount) {
        System.out.println("Withdraw : " + amount);
        if (amount <= balance + overDraftLimit) {
            balance -= amount;

        } else {
            System.out.println("\"Error, you are withdrawing excessively.\"");

        }

    }

    public void setOverdraftLimit(double newOverdraftLimit) {
        overDraftLimit = newOverdraftLimit;

    }

    public double getOverdraftLimit() {
        return overDraftLimit;

    }

    public String toString() {
        return "Balance is " + balance +
                "\nThis account was created at" + dateCreated;
    }
}