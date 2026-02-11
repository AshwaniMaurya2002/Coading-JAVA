class Q3{

    public static int getEvenIndex(int[] a){
        int count=0;
        for (int i = 0; i < a.length; i++) {
           if(a[i]%2==0){
             count++;
           }
           
        }
         return count;
    }

    public static void main(String[] args) {
        
        int[] a={10,20,30,40,50};

        System.out.println(getEvenIndex(a));


    }

}