public class Calculator {
    public static double add(double num1, double num2){
        return num1 + num2;
    }
    public static double subtract(double num1, double num2) {
        return num1 - num2;
    }
    public static double multiply(double num1, double num2) {
        return num1 * num2;
    }
    public static double divide(double num1, double num2) {
        if (num2 == 0) {
            System.out.println("Error! Division by zero is not allowed.");
            return Double.NaN;
        }
        return num1 / num2;
    }
}