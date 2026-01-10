public class BankDriver {
    public static void main(String[] args) {
        Bank myBankAccount = new Bank("123456789", 1000.0);

        System.out.println("Account Number: " + myBankAccount.getAccountNumber());
        System.out.println("Initial Balance: ₹" + myBankAccount.getBalance());

        myBankAccount.deposit(500.0);
        System.out.println("Balance after deposit: ₹" + myBankAccount.getBalance());

        myBankAccount.withdraw(200.0);
        System.out.println("Balance after withdrawal: ₹" + myBankAccount.getBalance());

        myBankAccount.withdraw(2000.0); 
    }
    
}
