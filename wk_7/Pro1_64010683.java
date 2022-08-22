public class Pro1_64010683 {
    public static void main(String[] args) {
        Account account1 = new Account(1, 1000);
        account1.withDraw(100);
        System.out.println(account1 + "\n");

        CheckingAccount account2 = new CheckingAccount(2, 5000, 5000);
        account2.withdraw(20000);
        System.out.println(account2 + "\n");

        SavingsAccount account3 = new SavingsAccount(3, 2000);
        account3.withdraw(3000);
        System.out.println(account3);
    }
}
