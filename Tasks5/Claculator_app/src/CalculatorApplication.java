public class CalculatorApplication {

    public static void main(String[] args) {
        UserInput userInput;
        OperationFactory operationFactory = new OperationFactory();

        while (true) {
            try {
                userInput = new InputHandler().readInput();
                if (userInput != null) {
                    if (userInput.isThisAnExit()) {
                        break;
                    }
                    Operation operation = operationFactory.getOperation(userInput.getOperation());
                    System.out.println(operation.calculate(userInput.getNumber1(), userInput.getNumber2()));
                }
            } catch (NumberFormatException e) {
                System.out.println("The input is not valid: " + e);
            }
        }
    }
}
