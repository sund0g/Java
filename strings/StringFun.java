
public class StringFun {

    private static final int CHAR_SET_LENGTH = 128;

    public StringFun () {
        // empty constructor
    }

    public boolean isUnique(String str) throws ArrayIndexOutOfBoundsException {

        boolean isUnique = true; // Assuming string is unique. Trust but verify.

        if (str.length() > CHAR_SET_LENGTH) {
            // Any string larger than the char set must have at least one repeating char.
            System.out.println("String is longer than " + CHAR_SET_LENGTH);
            isUnique = false;
        } else {

            int i = 0;
            boolean[] checkedValues = new boolean[CHAR_SET_LENGTH];

            try {
                // Using do-while here because we will iterate at least once.
                do {
                    int value = str.charAt(i);
                
                    // Check if value of str.charAt[i] has been seen previously.
                    if (checkedValues[value]) {
                        // If it has, we know the string has repeating chars.
                        isUnique = false;
                    }

                    // Mark the value as "seen".
                    checkedValues[value] = true;
                    
                    i++;

                } while (i < str.length() && isUnique);

            } catch (ArrayIndexOutOfBoundsException exception) {
                throw exception;
            }
        }
    return isUnique;
    }
} // end isUnique.