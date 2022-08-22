import java.util.*;

public class SavingsAccount extends Account {

    SavingsAccount() {
    }

    SavingsAccount(int newId, double newBalance) {
        System.out.println("Saving Account");
        System.out.println("Balance is: " + newBalance);
        id = newId;
        this.balance = newBalance;
        this.dateCreated = new Date();

    }

    public void withdraw(double amount) {
        System.out.println("Withdraw : " + amount);
        if (amount <= balance) {
            balance -= amount;

        } else {
            System.out.println("\"Error, you can't be overdrawn.\"");

        }
    }

    public String toString() {
        return "Balance is " + balance +
                "\nThis account was created at" + dateCreated;

    }
}