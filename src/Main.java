import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("String Calculator (type 'exit' to quit; use \\n for a newline)");
        var calculator = new StringCalculator();
        try (var scanner = new Scanner(System.in)) {
            while (true) {
                System.out.print("> ");
                if (!scanner.hasNextLine()) break;
                String input = scanner.nextLine();
                if (input.equalsIgnoreCase("exit")) break;
                try { System.out.println("Result: " + calculator.add(input.replace("\\n", "\n"))); }
                catch (IllegalArgumentException ex) { System.out.println("Error: " + ex.getMessage()); }
            }
        }
    }
}
