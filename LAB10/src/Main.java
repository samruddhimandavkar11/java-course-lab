public class Main {
    public static void main(String[] args) {

        BankAccount acc1 = new BankAccount("Sam", "ICICI", 10000);
        BankAccount acc2 = new BankAccount("Raj", "HDFC", 15000);
        BankAccount acc3 = new BankAccount("Nikki", "SBI", 12000);

        acc1.deposit(2000);
        acc1.withdraw(1500);
        acc2.deposit(3000);
        acc2.withdraw(500);
        acc3.deposit(1000);
        acc3.withdraw(2500);

        acc1.printDetails();
        acc2.printDetails();
        acc3.printDetails();
    }
}
