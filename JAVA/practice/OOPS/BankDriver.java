
public class BankDriver {
    public static void main(String[] args) {

        Bank b = new Bank();
        b.setDetails("Mohit", 20000, 123456789);
        System.out.println(b.getBalance());
        System.out.println(b.getAccNumber());
        b.deposite(2421);
        System.out.println(b.getName());
        System.out.println(b.getBalance());
        b.withdraw(18000);
        System.out.println(b.getBalance());
        b.withdraw(5000);
    }

}
