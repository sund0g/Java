
public final class testStringFun {

    public static void main (String [] args) {

        // Test isUnique method
        try {

            StringFun string = new StringFun();

            boolean stringIsUnique = string.isUnique(args[0]);

            if (stringIsUnique) {
                System.out.println("\"" + args[0].toString() + "\"" + " has no repeating characters.");
            } else {
                System.out.println("\"" + args[0].toString() + "\"" + " has at least one repeating character.");
            }

        } catch (ArrayIndexOutOfBoundsException | StringIndexOutOfBoundsException exception) {
            System.err.println("\n\tOops! Please give me a string to work with.\n");
        }
    }
}