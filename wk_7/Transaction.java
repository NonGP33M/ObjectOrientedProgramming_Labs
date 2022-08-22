import java.util.*;

public class Transaction {
    private char type;
    private double amount;
    private double balance;
    private String description;
    private Date dateCreated;

    Transaction(char newType, double newAmount, double newBalance, String newDescription) {
        dateCreated = new Date();
        type = newType;
        amount = newAmount;
        balance = newBalance;
        description = newDescription;

        if (type == 'W')
            withdraw(amount);

        if (type == 'D')
            deposit(amount);

    }

    private void withdraw(double amount) {
        balance -= amount;

    }

    private void deposit(double amount) {
        balance += amount;

    }

    public char getType() {
        return type;

    }

    public double getAmount() {
        return amount;

    }

    public double getBalance() {
        return balance;

    }

    public String getDescription() {
        return description;

    }

    public Date getDateCreated() {
        return dateCreated;

    }
}