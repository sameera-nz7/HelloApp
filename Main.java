// Main.java
public class Main {
    public static void main(String[] args) {
        String name;

        // Check if a command-line argument is provided
        if (args.length > 0) {
            name = args[0]; // First argument
        } else {
            name = "World"; // Default value
        }

        // Print personalized greeting
        System.out.println("Hello, " + name + "!");
    }
}
