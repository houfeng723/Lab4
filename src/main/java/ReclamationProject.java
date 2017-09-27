/*
 * The following code needs a lot of TLC. So give it some!
 *
 * 1. Fix all checkstyle errors
 * 2. Determine what it does (it's going to be tough before you finish #1)
 * 3. Improve the name of the methods and variables
 * 4. Add comments and Javadoc comments where needed
 * 5. Remove unnecessary comments as appropriate
 */
/**
 * this class contains a function that print the LCS of two strings.
 */
public class ReclamationProject {

    /**
     * this function is to print the LCS of two strings.
     * @param a the first input string
     * @param b the second input string
     * @return LCS
     */
    static String doit(final String a, final String b) {
        String str1 = a;
        String str2 = b;

        if (str1.length() > str2.length()) {
            String temp = str1;
            str1 = str2;
            str2 = temp;
        }
        String r =  "";

        for (int i = 0; i < str1.length(); i++) {
            for (int j = str1.length() - i; j > 0; j--) {
                for (int k = 0; k < str2.length() - j; k++) {
                    if (str1.regionMatches(i, str2, k, j) && j > r.length()) {
                        r = str1.substring(i, i + j);
                    }
                }
            }
        } return r;
    }
}
