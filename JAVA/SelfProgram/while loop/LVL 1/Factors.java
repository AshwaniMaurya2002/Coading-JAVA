class Factors{
    public static void main(String[] args) {
        int n=28;
        int i=1;
        int count=0;
        while(i<=n){
            if(n%i==0){
                System.out.println(i);
                count++;
            }
            i++;
            

        }
        System.out.println("Total factors are: "+count);
    }
}