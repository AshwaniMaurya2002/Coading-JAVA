public class ArrayFreq {

    public static  void frequency(int[] a){
        int max=a[0];
        int min=a[0];

        for (int i : a) {
            if(i>max)
                max=i;
            else if(i<min)
                min=i;
        }

        int[] freq=new int[max-min+1];

        for (int i = 0; i <a.length; i++) {
            
        }

    }


    public static void main(String[] args) {
        


    }
}
