class Q248{

    public static void printPattern(int n){


        int patternWidth=1;

        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=patternWidth; j++) {

               if(j%2==1){
                 System.out.print((n-j+1)+(n-i+1)+" ");

               }
               else{

                  System.out.print((n-j+1)+(i-j)+" ");


               }
                
            }

            patternWidth++;
            System.out.println();
            
        }

    }


    public static void main(String[] args) {

        printPattern(7);
        
    }
}