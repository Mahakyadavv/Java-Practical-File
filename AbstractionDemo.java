public class AbstractionDemo {
    static abstract class BankAccount {
        double balance;

        BankAccount(double balance) {
            this.balance = balance;
        }

        abstract void withdraw(double amount);

        void showBalance() {
            System.out.println("Balance: " + balance);
        }
    }

    static class SavingsAccount extends BankAccount {
        SavingsAccount(double balance) {
            super(balance);
        }

        @Override
        void withdraw(double amount) {
            if (amount <= balance) {
                balance -= amount;
                System.out.println("Withdrawal successful: " + amount);
            } else {
                System.out.println("Insufficient balance");
            }
        }
    }

    public static void main(String[] args) {
        BankAccount account = new SavingsAccount(5000);
        account.showBalance();
        account.withdraw(1200);
        account.showBalance();
    }
}
