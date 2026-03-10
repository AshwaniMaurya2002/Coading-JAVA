class LinearSearch{

    public  static int linearSearch(int[]a ,int target){
        for(int i=0;i<a.length;i++){
            if(a[i]==target)
                return  i;

        }
        return -1;

    }

    public static void main(String[] args) {
        
        int[] a={1,80,42,5,6,3,67,8,8,346,67,7,4,654,7,754,4,3646,634};

        System.out.println(linearSearch(a, 66  ));

    }

}