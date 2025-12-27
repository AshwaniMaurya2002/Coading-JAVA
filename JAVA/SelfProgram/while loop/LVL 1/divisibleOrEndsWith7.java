public class divisibleOrEndsWith7 {
    public static void main(String[] args) {
        int i=1;
        int count=0;
        while (i<=100) { 
            if(i%7==0 || i%10==7){
                System.out.println(i);
                count++;
            }
            i++;
        }
        System.out.println("Total numbers divisible by 7 or ending with 7: " + count);   
    }
}
