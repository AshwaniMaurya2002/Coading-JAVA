public class name  extends  Thread {
long sum=0;
long nums=0;
    public name(long nums) {
        this.nums=nums;
    }


    public void  multithreading(){
       
        for(long i=0;i<nums;i++){
            sum+=i;
        }

        System.out.println(sum);
    }




    @Override
    public void run(){
        multithreading();
    }
    
    
}
