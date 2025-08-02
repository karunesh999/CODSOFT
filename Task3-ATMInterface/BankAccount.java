public class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(" Deposited: ₹" + amount);
        } else {
            System.out.println(" Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println(" Insufficient balance.");
        } else if (amount <= 0) {
            System.out.println(" Invalid withdrawal amount.");
        } else {
            balance -= amount;
            System.out.println(" Withdrawn: ₹" + amount);
        }
    }

    public void checkBalance() {
        System.out.println("💰 Current Balance: ₹" + balance);
    }
}
