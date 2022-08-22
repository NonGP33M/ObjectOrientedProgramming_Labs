import java.util.ArrayList;

public class NewAccount {
    private int id;
    private String name;
    private double balance;
    private double annualInterestRate = 1.5;
    private ArrayList<Transaction> transactions = new ArrayList<Transaction>();

    NewAccount(String newName, int newId, double newBalance) {
        name = newName;
        id = newId;
        balance = newBalance;

    }

    public void withdraw(double amount) {
        transactions.add(new Transaction('W', amount, this.balance, ""));
        this.balance -= amount;

    }

    public void deposit(double amount) {
        transactions.add(new Transaction('D', amount, this.balance, ""));
        this.balance += amount;

    }

    public void showPersonal() {
        System.out.println("Name: " + name);
        System.out.println("Account ID: " + id);
        System.out.println("Annual interest rate: " + annualInterestRate);
        System.out.println("Balance: " + transactions.get(transactions.size() - 1).getBalance());

    }

    public void showAllAction() {
        System.out.println("Date\t\t\t\t\tType\t\tAmount\t\tBalance");

        for (int i = 0; i < transactions.size(); i++) {
            Transaction temp = transactions.get(i);
            System.out.println(temp.getDateCreated() + "\t\t" + temp.getType() + "\t\t" + temp.getAmount() + "\t\t"
                    + temp.getBalance());

        }
    }
}