import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose your operation: Add, Subtract, Multiply, Divide");
        String operation = scanner.nextLine();

        switch (operation) {
            case "Add":
                System.out.println("Enter first number: ");
                String firstNumber = scanner.nextLine();
                System.out.println("Enter second number: ");
                String secondNumber = scanner.nextLine();
            case"Subtract":
                System.out.println("Enter first number: ");
                String subFirstNumber = scanner.nextLine();
                System.out.println("Enter second number: ");
                String subSecondNumber = scanner.nextLine();
            case "Multiply":
                System.out.println("Enter first number: ");
                String multiFirstNumber = scanner.nextLine();
                System.out.println("Enter second number: ");
                String multiSecondNumber = scanner.nextLine();
            case "Divide":
                System.out.println("Enter first number: ");
                String divideFirstNumber = scanner.nextLine();
                System.out.println("Enter second number: ");
                String divideSecondNumber = scanner.nextLine();
        }
    }
}
