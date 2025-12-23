public class alphabetOrNot {
    public static void main(String[] args) {
        char ch = 'a'; // You can change this value to test different characters

        String result = ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) ? "Alphabet" : "Not an Alphabet";
        System.out.println(result);
    }
}
