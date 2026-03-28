public class Main {
    public static void main(String[] args) {
        // Use "World" if no arguments provided
        String greetingNames;

        if (args.length > 0) {
            // Join all names with comma and space
            greetingNames = String.join(", ", args);
        } else {
            greetingNames = "World";
        }

        // Display the greeting
        System.out.println("Hello, " + greetingNames + "!");
    }
}
