public class SumOfSqrtEven {
    public static void main(String[] args) {
        int n=100;
        int i=1;
        double sum=0;
        while(i<=n)
        {
           if(i%2==0)
           {
             sum+=i*i;
           }
           i++;
        }

        System.out.println("Sum of Square Roots of Even Numbers is : ="+sum);
    }
}
