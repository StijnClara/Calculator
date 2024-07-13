import java.util.Scanner;

public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    while (true) {
        //Display menu
        System.out.println("Select an operation:");
        System.out.println("1: Addition");
        System.out.println("2: Subtraction");
        System.out.println("3: Multiplication");
        System.out.println("4: Division");
        System.out.println("5: Exit");
        int choice = scanner.nextInt();

        if (choice == 5) {
            System.out.println("Exiting the calculator. Goodbye!");
            break;
        }

        //Get user input for numbers
        System.out.println("Enter the first number:");
        double num1 = scanner.nextDouble();
        System.out.println("Enter the second number:");
        double num2 = scanner.nextDouble();

        double result = 0;
        boolean validChoice = true;

        switch (choice) {
            case 1:
                result = Calculator.add(num1, num2);
                break;
            case 2:
                result = Calculator.subtract(num1, num2);
                break;
            case 3:
                result = Calculator.multiply(num1, num2);
                break;
            case 4:
                result = Calculator.divide(num1, num2);
                break;
            default:
                validChoice = false;
                System.out.println("Invalid choice! Please select a valid operation.");
        }

        //Display the result
        if (validChoice) {
            System.out.println("The result is: " + result);
        }
    }
    scanner.close();
}