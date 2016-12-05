package elementsofprogramming.arrays;

import constants.EnumCollectionError;
import elementsofprogramming.arrays.DeleteDuplicates;
import exception.NullEmptyCollectionException;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * @author Tolga Duzenli on 05-Dec-2016.
 */
public class TestDeleteDuplicates {

    private static DeleteDuplicates deleteDuplicates;

    @BeforeClass
    public static void setUp() {
        deleteDuplicates = new DeleteDuplicates();
    }

    @Test(expected = NullEmptyCollectionException.class)
    public void testNullList() throws NullEmptyCollectionException {
        List<Integer> values = null;
        try {
            deleteDuplicates.deleteDuplicates(values);
        } catch (NullEmptyCollectionException nce) {
            assertEquals(EnumCollectionError.NULL_OR_EMPTY_COLLECTION.toString(), nce.getMessage());
            throw nce;
        }
    }

    @Test(expected = NullEmptyCollectionException.class)
    public void testEmptyList() throws NullEmptyCollectionException {
        List<Integer> values = Collections.EMPTY_LIST;
        try {
            deleteDuplicates.deleteDuplicates(values);
        } catch (NullEmptyCollectionException nce) {
            assertEquals(EnumCollectionError.NULL_OR_EMPTY_COLLECTION.toString(), nce.getMessage());
            throw nce;
        }
    }

    @Test
    public void testNotDuplicatedList() throws NullEmptyCollectionException {
        List<Integer> uniqueValueList = createUniqueValueList();
        List<Integer> values = deleteDuplicates.deleteDuplicates(uniqueValueList);
        assertNotNull(values);
        assertEquals(uniqueValueList.size(), values.size());
    }

    @Test
    public void testDuplicatedList() throws NullEmptyCollectionException {
        List<Integer> duplicatedValueList = createDuplicatedValueList();
        List<Integer> values = deleteDuplicates.deleteDuplicates(duplicatedValueList);
        assertNotNull(values);
        assertEquals(6, values.size());
    }

    private List<Integer> createUniqueValueList() {
        List<Integer> values = new ArrayList<Integer>();
        values.add(2);
        values.add(3);
        values.add(4);
        values.add(5);
        values.add(6);
        return values;
    }

    private List<Integer> createDuplicatedValueList() {
        List<Integer> values = new ArrayList<Integer>();
        values.add(2);
        values.add(3);
        values.add(3);
        values.add(5);
        values.add(6);
        values.add(9);
        values.add(9);
        values.add(10);
        return values;
    }


}
