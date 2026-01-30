public class Q270 {


    public static  void printPattern(int n){

        int mid=n/2+1;
        int space=n-1;
        int patterWidth=1;

        int endstar=3*n+1;

        for (int i = 1; i <=n; i++) {

            //section 1
                for (int k = 1; k <=space; k++) {
                    System.out.print("  ");
                    
                }
                for (int k = 1; k <=patterWidth; k++) {
                    System.out.print("* ");
                }

                for (int j = mid+1; j <=n+1; j++) {
                    if(i==1||j==n+1&&i<=mid){
                        System.out.print("@ ");

                    }
                    else{
                        System.out.print("  ");
                    }
                    
                }
                //section3

                for (int j = n+2; j <=2*n; j++){
                    if(i>mid){
                    System.out.print("* ");

                    }  
                    else{
                        System.out.print("  ");
                    }                  
                }


                //section4
                for(int j=2*n+1;j<=2*n+mid;j++){
                    if(i==1|| j==2*n+1&&(i<=mid)){
                        System.out.print("@ ");
                    }
                    else{
                        System.out.print("  ");
                    }
                }

                //section 5

                for(int j=2*n+mid+1;j<=endstar;j++){
                    System.out.print("* ");
                        if(j<mid){
                            endstar++;
                        }
                        else{
                            endstar--;
                        }
                }
                
            
            if(i<mid){
                
                space--;
                patterWidth++;

            }
            else{
                space++;
                patterWidth--;
            }
            System.out.println();
            
        }




    }


    public static void main(String[] args) {
        printPattern(7);
    }


    
}
