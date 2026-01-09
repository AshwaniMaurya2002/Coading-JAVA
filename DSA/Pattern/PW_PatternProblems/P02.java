
class P02 {
    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < i; j++) {
                if (i % 2 == 0) {
                    System.out.print(j + " ");
                } else {
                    System.out.print((char) (64 + j) + " ");
                }
            }
            System.out.println();
        }
    }
}