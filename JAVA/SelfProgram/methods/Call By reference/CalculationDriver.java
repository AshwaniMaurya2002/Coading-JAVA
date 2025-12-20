public class CalculationDriver {
    public static void main(String[] args) {

        Calculation.setValue(12, 13);
        // this number 1 is local because we declared here and used it as a local
        // variable
        // declared by using int number1
        // we can directlty used static or we can say global variable by saying number1
        // it change the upper Number1
        int number1 = 32;
        // it change the number 2 in static not create the local variable
        Calculation.number2 = 43;
        System.out.println("The Local Variable Number1 Value is: " + number1);

        Calculation.printValue();

    }

}
