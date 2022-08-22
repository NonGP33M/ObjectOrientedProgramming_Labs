public class Pro2_64010683 {
    public static void main(String[] args) {
        NewAccount account = new NewAccount("George", 1122, 1000);
        account.deposit(30);
        account.deposit(40);
        account.deposit(50);
        account.withdraw(5);
        account.withdraw(4);
        account.withdraw(2);
        account.showPersonal();
        account.showAllAction();
    }
}
