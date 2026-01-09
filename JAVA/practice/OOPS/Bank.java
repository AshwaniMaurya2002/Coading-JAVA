
public class Bank {
    private int balance;
    private int accNumber;
    private String name;

    public void setDetails(String name, int balance, int accNumber) {
        this.name = name;
        this.balance = balance;
        this.accNumber = accNumber;
    }

    public int getBalance() {
        return balance;
    }

    public int getAccNumber() {
        return accNumber;
    }

    public String getName() {
        return name;
    }

    public void deposite(int amount) {
        if (amount > 0) {
            balance += amount;
        } else {
            System.out.println("positive amount required");
        }
    }

    public void withdraw(int withdrawMoney) {
        if (withdrawMoney > 0 && withdrawMoney <= balance) {
            balance -= withdrawMoney;
        } else {
            System.out.println("Insufficent balance");

        }
    }

}
