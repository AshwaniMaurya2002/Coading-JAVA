class Solution {
    public static  int trailingZeroes(int n) {
        int i=1;
        int zero=0;
        int count=n/(int)Math.pow(5,i);
        while(count>0){
            zero+=count;
            i++;    
        }

        return zero;
    }

    public static void main(String[] args) {
        int ans=trailingZeroes(5);
        System.out.println(ans);
    }
}