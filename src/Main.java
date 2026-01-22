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
                int numberOneAdd = Integer.parseInt(firstNumber);
                int numberTwoAdd = Integer.parseInt(secondNumber);
                int sum = numberOneAdd + numberTwoAdd;
                System.out.println("Yor result is: "+sum);
                break;
            case"Subtract":
                System.out.println("Enter first number: ");
                String subFirstNumber = scanner.nextLine();
                System.out.println("Enter second number: ");
                String subSecondNumber = scanner.nextLine();
                int numberOneSubtract = Integer.parseInt(subFirstNumber);
                int numberTwoSubtract = Integer.parseInt(subSecondNumber);
                int sub = numberOneSubtract - numberTwoSubtract;
                System.out.println("Yor result is: "+sub);
                break;
            case "Multiply":
                System.out.println("Enter first number: ");
                String multiFirstNumber = scanner.nextLine();
                System.out.println("Enter second number: ");
                String multiSecondNumber = scanner.nextLine();
                int numberOneMultiply = Integer.parseInt(multiFirstNumber);
                int numberTwoMultiply = Integer.parseInt(multiSecondNumber);
                int multi = numberOneMultiply * numberTwoMultiply;
                System.out.println("Yor result is: "+multi);
                break;
            case "Divide":
                System.out.println("Enter first number: ");
                String divideFirstNumber = scanner.nextLine();
                System.out.println("Enter second number: ");
                String divideSecondNumber = scanner.nextLine();
                float numberOneDevider = Float.parseFloat(divideFirstNumber);
                float numberTwoDevider = Float.parseFloat(divideSecondNumber);
                float result = numberOneDevider / numberTwoDevider;
                System.out.println("Yor result is: "+result);
                break;
        }
    }
}
