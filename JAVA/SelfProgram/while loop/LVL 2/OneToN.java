public class OneToN {
    public static void main(String[] args) {
        int n=100;
        int i=1;
        int sum=0;
        while(i<=n)
        {
            sum += i;
            i++;
        }
        System.out.println("Sum of numbers from 1 to "+n+" is: "+sum);
    }
    
}
