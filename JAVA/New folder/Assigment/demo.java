public class demo {
    public static void main(String[] args) {

        int ans=fact(23);

        System.out.println(ans);

    }

    public static int fact(int number){
        if(number==0||number==1){
            return 1;

        }
        else return number*(fact(number-1));
    }
}
