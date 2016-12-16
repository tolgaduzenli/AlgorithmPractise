package util;

import constants.EnumParameterErrorCodes;
import exception.NullOrEmptyParameterException;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Tolga Duzenli on 13-Dec-2016.
 *         StringUtils class provides string functions to check null, size, empty or not empty.
 *         its same as org.apache.commons.lang.
 */
public class StringUtils {

    private static final String CAPITAL_LETTERS_PATTERN = "^[A-Z]+$";
    private static final String LOWERCASE_LETTERS_PATTERN = "^[a-z]+$";
    private static final String DIGITS_PATTERN = "^[0-9]+$";

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


    public static void checkNullOrEmptyParameter(String parameter) throws NullOrEmptyParameterException {
        if (StringUtils.isBlank(parameter)) {
            throw new NullOrEmptyParameterException(EnumParameterErrorCodes.NULL_OR_EMPTY_STRING);
        }
    }

    public static void checkCapitalLetters(String parameter) {
        runPattern(parameter, Pattern.compile(CAPITAL_LETTERS_PATTERN));
    }

    private static void runPattern(String parameter, Pattern pattern) {
        Matcher matcher = pattern.matcher(parameter);
        if (!matcher.find()) {
            throw new NumberFormatException(EnumParameterErrorCodes.WRONG_PARAMETER.toString());
        }
    }

    public static void checkLowerCaseLetters(String parameter) {
        runPattern(parameter, Pattern.compile(LOWERCASE_LETTERS_PATTERN));
    }

    public static void checkDigits(String s) {
        runPattern(s, Pattern.compile(DIGITS_PATTERN));
    }
}
