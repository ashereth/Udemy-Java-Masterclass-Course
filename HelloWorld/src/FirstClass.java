package HelloWorld.src;

public class FirstClass {
    public static void main(String[] args) {
	    double number = 20.0;
        double number2 = 80.0;
        double result = (number + number2) * 100;
        double remainder = result % 40.0;
        if (remainder == 0) {
            System.out.println("The remainder is 0");
            System.out.println(remainder);
        } else {
            System.out.println("The remainder is not 0");
        }
    }
}
