package elementsofprogramming.arrays;

import constants.EnumCollectionError;
import exception.NullEmptyCollectionException;
import util.CollectionUtils;

import java.util.Collections;
import java.util.List;

/**
 * @author Tolga Duzenli on 07-Dec-2016.
 *         <p/>
 *         This class computes the next permutation of given integer array according to dictionary order.
 *         For example we have <1,0,3,2>, next array of given array under dictionary prdering: <1,2,0,3>
 *         The general algorithm;
 *         1. Find k such that p[k] < p[k+1] and entries after index k appear in decreasing order.
 *         2. Find the smallest p[l] such that p[l] > p[k], (such an l must exist since p[k] < p[k+1] )
 *         3. Swap p[l] and p[k] (note that the sequence after position k remains in decresing order)
 *         4. Reverse the sequence after position k.
 *         <p/>
 *         Time complexity is O(n) and space complexity is O(1).
 *
 *         Note: if you want to find nth next permutation, just call nextPermutation() method nth time.
 *         Each time send result permutation array to the next call as a parameter.
 */
public class ComputeNextPermutation {

    public List<Integer> nextPermutation(List<Integer> perm) throws NullEmptyCollectionException {
        if (CollectionUtils.isEmpty(perm)) {
            throw new NullEmptyCollectionException(EnumCollectionError.NULL_OR_EMPTY_COLLECTION);
        }
        int k = perm.size() - 2;
        while (k >= 0 && perm.get(k) >= perm.get(k + 1)) {
            k--;
        }
        if (k == -1) {
            return Collections.emptyList(); //perm is the last permutation
        }
        for (int i = perm.size() - 1; i > k; i--) {
            if (perm.get(i) > perm.get(k)) {
                Collections.swap(perm, k, i);
                break;
            }
        }
        Collections.reverse(perm.subList(k + 1, perm.size()));
        return perm;
    }
}
