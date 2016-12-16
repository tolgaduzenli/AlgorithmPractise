package util;

/**
 * @author Tolga Duzenli on 13-Dec-2016.
 *         StringUtils class provides string functions to check null, size, empty or not empty.
 *         its same as org.apache.commons.lang.
 */
public class StringUtils {

    public static boolean isBlank(String str) {
        int strLen;
        if (str == null || (strLen = str.length()) == 0) {
            return true;
        }
        for (int i = 0; i < strLen; i++) {
            if ((Character.isWhitespace(str.charAt(i)) == false)) {
                return false;
            }
        }
        return true;
    }

    public static boolean isNotBlank(String str) {
        return !isBlank(str);
    }

    public static boolean isContainsOnlyNumber(String s){
        return s.matches("[0-9]+");
    }
}
