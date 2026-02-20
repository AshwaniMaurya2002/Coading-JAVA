class Q2{

    public static void getEvenIndex(int[] a){
        for (int i = 0; i < a.length; i++) {
            if(a[i]%2==0){
                System.out.println(a[i]);
            }
        }
    }

    public static void main(String[] args) {
        
        int[] a={10,20,30,40,50};

        getEvenIndex(a);


    }

}