public class Student {



    public static void main(String[] args) {
        

        try {

            int i=10/0;

            int arr[]={1,2,3};
            System.out.println(arr[5]);
            System.out.println(i);
            
        } catch (ArithmeticException e) {
            System.out.println("not divisible");

            
        }

        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("out of memorya");

        }


    }
    
}
