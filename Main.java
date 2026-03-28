public class Main {
    public static void main(String[] args) {
        String greetingNames;

        if (args.length == 0) {
            greetingNames = "World";
        } else {
            StringBuilder sb = new StringBuilder();
            boolean first = true;

            // Enhanced for loop to iterate over all command-line arguments
            for (String name : args) {
                if (!first) {
                    sb.append(", "); // add comma separator for subsequent names
                }
                sb.append(name);
                first = false;
            }

            greetingNames = sb.toString();
        }

        System.out.println("Hello, " + greetingNames + "!");
    }
}
