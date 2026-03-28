// Main.java
public class Main {
    public static void main(String[] args) {
        // Using ternary operator to assign name
        String name = (args.length > 0) ? args[0] : "World";

        // Print the greeting
        System.out.println("Hello, " + name + "!");
    }

}

