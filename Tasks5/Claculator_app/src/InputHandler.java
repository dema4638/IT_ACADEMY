import javax.jws.soap.SOAPBinding;
import java.util.Scanner;

public class InputHandler {


    public UserInput readInput() {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter expression:");
        String input = myObj.nextLine();
        input = input.trim();
        return parseInput(input);
    }

    public UserInput parseInput(String input) throws NumberFormatException {
        double number1;
        double number2;
        String operation;
        String[] expression = input.split(" ");
        if (input.equalsIgnoreCase("exit")) {
            return new UserInput(true);
        }
        try {
            if (expression.length != 3) {
                System.out.println("The input is not valid.");
                return null;
            }
            number1 = Double.parseDouble(expression[0]);
            number2 = Double.parseDouble(expression[2]);
            operation = expression[1];


        } catch (NumberFormatException e) {
            throw new NumberFormatException();
        }
        return new UserInput(number1, number2, operation);
    }
}
