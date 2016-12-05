package util;

import java.util.Collection;

/**
 * @author Tolga Duzenli on 05-Dec-2016.
 *         CollectionUtils class provide null and size check for collections.
 *         It is same like org.apache.commons.collections4.CollectionUtils class.
 */
public class CollectionUtils {

    public static boolean isEmpty(final Collection<?> coll) {
        return coll == null || coll.isEmpty();
    }

    public static boolean isNotEmpty(final Collection<?> coll) {
        return !isEmpty(coll);
    }


}
