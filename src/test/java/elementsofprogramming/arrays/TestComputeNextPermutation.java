package elementsofprogramming.arrays;

import exception.NullEmptyCollectionException;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * @author Tolga Duzenli on 07-Dec-2016.
 */
public class TestComputeNextPermutation {


    private static ComputeNextPermutation computeNextPermutation;

    @BeforeClass
    public static void setUp() {
        computeNextPermutation = new ComputeNextPermutation();
    }

    @Test(expected = NullEmptyCollectionException.class)
    public void testWithNullList() throws NullEmptyCollectionException {
        computeNextPermutation.nextPermutation(null);
    }

    @Test(expected = NullEmptyCollectionException.class)
    public void testWithEmptyList() throws NullEmptyCollectionException {
        computeNextPermutation.nextPermutation(Collections.emptyList());
    }

    @Test
    public void testWithSingleValue() throws NullEmptyCollectionException {
        List<Integer> perm = new ArrayList<>();
        perm.add(0);
        List<Integer> nextPermutation = computeNextPermutation.nextPermutation(perm);
        assertNotNull(nextPermutation);
        assertEquals(0, nextPermutation.size());
    }

    @Test
    public void testWithComplexValue() throws NullEmptyCollectionException {
        List<Integer> perm = new ArrayList<>();// given <1,0,3,2>,  expected <1,2,0,3>
        perm.add(1);
        perm.add(0);
        perm.add(3);
        perm.add(2);
        List<Integer> nextPermutation = computeNextPermutation.nextPermutation(perm);
        assertNotNull(nextPermutation);
        assertEquals(4, nextPermutation.size());
        assertEquals(new Integer(2), nextPermutation.get(1));
        assertEquals(new Integer(0), nextPermutation.get(2));
        assertEquals(new Integer(3), nextPermutation.get(3));
    }


    @Test
    public void testWithLastPermutation() throws NullEmptyCollectionException {
        List<Integer> perm = new ArrayList<>();// given <3,2,1,0>,  expected empty list because perm is last permutation
        perm.add(3);
        perm.add(2);
        perm.add(1);
        perm.add(0);
        List<Integer> nextPermutation = computeNextPermutation.nextPermutation(perm);
        assertNotNull(nextPermutation);
        assertEquals(0, nextPermutation.size());
    }


}
