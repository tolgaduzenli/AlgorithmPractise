package careerup;

import constants.EnumParameterErrorCodes;
import exception.NullOrEmptyParameterException;
import util.StringUtils;

/**
 * @author Tolga Duzenli on 1/4/17.
 * This class provides first non-repeated character in the given string. it runs O(n) times and only use additional
 * integer array to find distinct characters.
 * Algorithm is not case sensitive now, you should bear in mind this one.
 */
public class FindFirstNonRepeatedChar {

    public static char firstNonRepeatingCharWithRegex(String word) throws NullOrEmptyParameterException {
        if (StringUtils.isBlank(word)) {
            throw new NullOrEmptyParameterException(EnumParameterErrorCodes.NULL_OR_EMPTY_STRING);
        }
        Integer[] count = new Integer[256];
        char firstNonRepeated = 0;

        for (int i = 0; i < word.length(); i++) {
            int digit = word.charAt(i) - '0';//get int value from character
            if (count[digit] == null) {
                count[digit] = i; // keep the order of char
            } else {
                count[digit] = -1; //set -1 for repeated values
            }
        }

        int firstIndex = Integer.MAX_VALUE;
        for (int i = 0; i < count.length; i++) {
            if (count[i] != null && count[i] != -1 && count[i] < firstIndex) {
                firstNonRepeated = (char) (i + '0');
                firstIndex = count[i];
            }
        }
        return firstNonRepeated;
    }
}
