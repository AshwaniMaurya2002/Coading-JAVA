public class Q19 {



    public static boolean  checkPalindrome(int[] a,int[] b){

        int indx1=0;
        int indx2=b.length-1;
        if(a.length!=b.length)
            return false;

        while(indx1<a.length){
            if(a[indx1++]!=b[indx2--])
                return false;
        }  

        return  true;
    }
    

    public static void main(String[] args) {

        int[] a={10 ,20 ,30, 40, 80, 70 ,25};
        int[] b={25, 70, 80, 40 ,30 ,20 ,10};

        boolean ans=checkPalindrome(a, b);
        System.out.println(ans);
        
    }
}
