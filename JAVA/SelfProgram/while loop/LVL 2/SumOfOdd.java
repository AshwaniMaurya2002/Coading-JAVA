public class SumOfOdd {
    public static void main(String[] args) {
        int n=100;
        int i=1;
        int sum=0;
        while(i<=n)
        {
           if(i%2!=0)
           {
             sum+=i;
           }
           i++;
        }

        System.out.println("Sum is : ="+sum);

    }
}
