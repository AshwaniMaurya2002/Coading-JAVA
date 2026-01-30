public class lastPattern {

    public static void printPatter(int n){
        int mid=n/2+1;
        int sStar=1;
        int eStar=n;

        for (int i = 1; i <=n; i++) {
        int num=mid;

            for (int j = 1; j <=n; j++) {
                if(j<sStar){
                    System.out.print(num-- +" ");
                }
                else if(j>=eStar){
                    System.out.print(num++ + " ");
                }
                else{
                    System.out.print(num+" ");
                }
            }
            if(i<mid){
                sStar++ ;
                 eStar--;
            }
            else{
                sStar--;
                eStar++;
            }
            System.out.println();

            
        }
    }


    public static void main(String[] args) {
        printPatter(7);
    }
    
}
