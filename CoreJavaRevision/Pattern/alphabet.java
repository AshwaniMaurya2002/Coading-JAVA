
public class alphabet {

    public static void main(String[] args) {

        char s = 'A';
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {

                System.out.print(s + " ");
                s++;
            }
            System.out.println();
        }
    }

}
