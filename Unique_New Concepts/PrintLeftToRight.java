class PrintLeftToRight {
    public static void main(String[] args) {
        int n=56789;
        int digit=(n+"").length();

        while(n>0){
            int rem=n/(int )(Math.pow(10, digit-1))%10;
            System.out.println(rem);
            digit--;
        }



        
    }
}
