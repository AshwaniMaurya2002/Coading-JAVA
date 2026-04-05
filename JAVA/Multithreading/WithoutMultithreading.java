public class WithoutMultithreading {
    

long sum=0;
    public void  multithreading(long nums){
        for(long i=0;i<nums;i++){
            sum+=i;
        }

        System.out.println(sum);
    }
}
