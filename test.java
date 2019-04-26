public class transform {

    public static void main(char[] str, int buf_len) {

        char[] newStr;
        int j = 0;

        while (str.charAt(c) != ‘\0’) {
            if ( str.charAt(c) != ‘a’ ) {
                newStr[c] = str[c];
                j++;
            }
            c++;
        }
        newStr[j+1] = ‘\0’;
    }
}

