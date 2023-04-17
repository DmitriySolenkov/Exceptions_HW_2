import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            while (true) {
                String input = inputString(scanner);
                try {
                    float floatInput = Float.parseFloat(input);
                    System.out.printf("Congratulations! Your float number is %f", floatInput);
                    scanner.close();
                    break;
                } catch (Exception e) {
                    System.out.println("Incorrect input! Try again!");
                }
            }
        } catch (EmptyInputException e) {
            System.out.println(e);
        }

    }

    public static String inputString(Scanner scanner) throws EmptyInputException {
        System.out.println("Enter your float number: ");
        String input = scanner.nextLine();
        // Разработайте программу, которая выбросит Exception, когда пользователь вводит
        // пустую строку.
        // Пользователю должно показаться сообщение, что пустые строки вводить нельзя.
        if (input == "") {
            throw new EmptyInputException("Empty input is forbidden!");
        } else {
            return input;
        }

    }

    static class EmptyInputException extends Exception {
        public EmptyInputException(String message) {
            super(message);
        }

    }
}
