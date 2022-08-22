import java.util.*;

public class ATM {
    Scanner input = new Scanner(System.in);
    private int account;
    private int choice;
    private double amount;
    private double[] balance = new double[10];

    public ATM() {
        for (int i = 0; i < 10; i++) {
            balance[i] = 100;

        }
    }

    public void setAccount() {
        System.out.println();
        System.out.print("Enter an id: ");
        account = input.nextInt();
        if (account >= 10 || account < 0) {
            System.out.println("Invalid account : Account must be 0 - 9");
            setAccount();
        }
        mainMenuDisplay();
    }

    public void mainMenuDisplay() {
        System.out.println();
        System.out.println("Main menu");
        System.out.println("1: check balance");
        System.out.println("2: withdraw");
        System.out.println("3: deposit");
        System.out.println("4: exit");
        System.out.print("Enter a choice: ");
        choice = input.nextInt();
        accessing(choice);
    }

    public void accessing(int choice) {
        if (choice == 0) {
            setAccount();

        }

        else if (choice == 1) {
            System.out.println("The balance is " + balance[account]);
            mainMenuDisplay();
        }

        else if (choice == 2) {
            System.out.print("Enter an amount to withdraw: ");
            amount = input.nextDouble();
            if (amount > balance[account]) {
                System.out.println("\nTransaction denied : Not enough balance in this account.");

            } else {
                balance[account] -= amount;

            }
            mainMenuDisplay();
        }

        else if (choice == 3) {
            System.out.print("Enter an amount to deposit: ");
            amount = input.nextDouble();
            balance[account] += amount;
            mainMenuDisplay();

        }

        else if (choice == 4) {
            System.out.println();
            System.out.println("End of Program.");

        }

        else {
            System.out.println("Invalid choice : Choice must be 0-4");
        }
    }
}
