import java.util.HashMap;

public class OperationFactory {

    private HashMap<String, Operation> operations = new HashMap<>();

    public OperationFactory() {
        operations.put("+", new Addition());
        operations.put("-", new Subtraction());
        operations.put("*", new Multiplication());
        operations.put("/", new Division());
    }

    public Operation getOperation(String operator) {
        return operations.get(operator);
    }
}

