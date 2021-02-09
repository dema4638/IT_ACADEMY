public class UserInput {
    private double number1;
    private double number2;
    private String operation;
    private boolean isThisAnExit;

    public UserInput(double number1, double number2, String operation) {
        this.number1 = number1;
        this.number2 = number2;
        this.operation = operation;
        this.isThisAnExit = false;
    }

    public UserInput(boolean isThisAnExit) {
        this.isThisAnExit = isThisAnExit;
    }

    public double getNumber1() {
        return number1;
    }

    public double getNumber2() {
        return number2;
    }

    public String getOperation() {
        return operation;
    }

    public boolean isThisAnExit() {
        return isThisAnExit;
    }
}
