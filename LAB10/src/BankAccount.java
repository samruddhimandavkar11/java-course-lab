public class BankAccount {
    String accountHolderName;
    String bankName;
    double accountBalance;


    public BankAccount(String accountHolderName, String bankName, double accountBalance) {
        this.accountHolderName = accountHolderName;
        this.bankName = bankName;
        this.accountBalance = accountBalance;
    }


    public double getBalance() {
        return accountBalance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            accountBalance += amount;
            System.out.println(accountHolderName + " deposited ₹" + amount + " to " + bankName);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= accountBalance) {
            accountBalance -= amount;
            System.out.println(accountHolderName + " withdrew ₹" + amount + " from " + bankName);
        } else {
            System.out.println("Insufficient balance or invalid withdrawal amount.");
        }
    }

    public void printDetails() {
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Bank Name: " + bankName);
        System.out.println("Current Balance: ₹" + accountBalance);
    }
}
