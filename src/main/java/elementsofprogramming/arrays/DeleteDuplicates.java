package elementsofprogramming.arrays;

import constants.EnumCollectionError;
import exception.NullEmptyCollectionException;
import util.CollectionUtils;

import java.util.List;

/**
 * @author Tolga Duzenli on 05-Dec-2016.
 *         This class deletes duplicate values from sorted array. Time complexity is O(n) and space complexity is O(1).
 *         if the array is not sorted, time complexity can be O(nlong) or O(n^2) or O(n).
 *         It depends different parameters;
 *         - what kind of array you have, is it nearly sorted or has random numbers ?
 *         - Which kind of sort method you want to use ? Collections.sort() or others ?
 *         - What is your java version ?
 */
public class DeleteDuplicates {

    public List<Integer> deleteDuplicates(List<Integer> values) throws NullEmptyCollectionException {
        if (CollectionUtils.isEmpty(values)) {
            throw new NullEmptyCollectionException(EnumCollectionError.NULL_OR_EMPTY_COLLECTION);
        }
        int writeIndex = 1;
        for (int i = 1; i < values.size(); i++) {
            if (!values.get(writeIndex - 1).equals(values.get(i))) {
                values.set(writeIndex++, values.get(i));
            }
        }
        return values.subList(0, writeIndex);
    }
}
