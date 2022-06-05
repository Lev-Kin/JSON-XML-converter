import java.util.Optional;

class Main {
    public static void main(String[] args) {
        InputStringReader reader = new InputStringReader();
        Optional<String> value = reader.getValue();
        if (value.isPresent()) {
            System.out.println("Value is present: " + value.get());
        } else {
            System.out.println("Value is empty");
        }
    }
}

class InputStringReader {
    private Optional<String> inputOpt; // cache to provide reproducing method invocation

    public Optional<String> getValue() {

        if (inputOpt == null) {
            java.util.Scanner scanner = new java.util.Scanner(System.in);
            String input = scanner.next();
            inputOpt = "null".equals(input) || "empty".equals(input) ? Optional.empty() : Optional.of(input);
        }

        return inputOpt;
    }
}