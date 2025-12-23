class sortUsingTernary {
    public static void main(String[] args) {
        int a = 30;
        int b = 10;
        int c = 20;

        int first = (a < b) ? ((a < c) ? a : c) : ((b < c) ? b : c);
        int third = (a > b) ? ((a > c) ? a : c) : ((b > c) ? b : c);
        int second = (a + b + c) - (first + third);

        System.out.println("Sorted order: " + first + " " + second + " " + third);
    }
}