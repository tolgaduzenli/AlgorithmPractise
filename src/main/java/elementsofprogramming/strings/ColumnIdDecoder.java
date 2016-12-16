package elementsofprogramming.strings;

import constants.EnumParameterErrorCodes;
import exception.NullOrEmptyParameterException;
import util.StringUtils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Tolga Duzenli on 16-Dec-2016.
 *         This class provides aplhabetic decoding. It accepts 'A' = 1, 'Z' = 26 and 'ZZ' = 702
 */
public class ColumnIdDecoder {

    public int decodeColId(String col) throws NullOrEmptyParameterException {
        checkParameter(col);
        int result = 0;
        for (int i = 0; i < col.length(); i++) {
            char c = col.charAt(i);
            result = result * 26 + c - 'A' + 1;
        }
        return result;
    }

    private void checkParameter(String col) throws NullOrEmptyParameterException {
        if (StringUtils.isBlank(col)) {
            throw new NullOrEmptyParameterException(EnumParameterErrorCodes.NULL_OR_EMPTY_STRING);
        }
        Pattern pattern = Pattern.compile("^[A-Z]+$");
        Matcher matcher = pattern.matcher(col);
        if (!matcher.find()) {
            throw new NumberFormatException(EnumParameterErrorCodes.WRONG_PARAMETER.toString());
        }
    }
}
