package elementsofprogramming.strings;

import constants.EnumParameterErrorCodes;
import exception.NullOrEmptyParameterException;
import util.StringUtils;

/**
 * @author Tolga Duzenli on 13-Dec-2016.
 *         This class provides converter from string to int and int to string.
 *         stringToInt method should handle integer range and numeric characters for parameter.
 */
public class InterConverter {

    public String intToString(int x) {
        boolean isNegative = x < 0;
        StringBuilder sb = new StringBuilder();
        do {
            sb.append((char) ('0' + Math.abs(x % 10)));
            x /= 10;
        } while (x != 0);
        if (isNegative) {
            sb.append('-');
        }
        return sb.reverse().toString();
    }

    public int stringToInt(String s) throws NullOrEmptyParameterException {
        StringUtils.checkNullOrEmptyParameter(s);
        int i = s.charAt(0) == '-' ? 1 : 0;
        StringUtils.checkDigits(s.substring(i, s.length()));
        int result = 0;
        for (; i < s.length(); i++) {
            int digit = s.charAt(i) - '0';
            result = result * 10 + digit;
        }
        if (result < 0) {
            throw new NumberFormatException(EnumParameterErrorCodes.WRONG_PARAMETER.toString());
        }
        return s.charAt(0) == '-' ? -result : result;
    }


}
