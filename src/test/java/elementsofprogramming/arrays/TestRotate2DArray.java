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
public class TestRotate2DArray {

    private static Rotate2DArray rotate2DArray;

    @BeforeClass
    public static void setUp() {
        rotate2DArray = new Rotate2DArray();
    }

    @Test(expected = NullEmptyCollectionException.class)
    public void testWithNullList() throws NullEmptyCollectionException {
        rotate2DArray.rotateMatrix(null);
    }

    @Test(expected = NullEmptyCollectionException.class)
    public void testWithEmptyList() throws NullEmptyCollectionException {
        rotate2DArray.rotateMatrix(Collections.emptyList());
    }

    @Test
    public void testWith2x2Array() throws NullEmptyCollectionException {
        List<List<Integer>> rotatedMatrix = rotate2DArray.rotateMatrix(create2x2Array());
        assertNotNull(rotatedMatrix);
        assertEquals(2, rotatedMatrix.size());
        assertEquals(new Integer(3), rotatedMatrix.get(0).get(0));
        assertEquals(new Integer(1), rotatedMatrix.get(0).get(1));
        assertEquals(new Integer(4), rotatedMatrix.get(1).get(0));
        assertEquals(new Integer(2), rotatedMatrix.get(1).get(1));
    }

    @Test
    public void testWith3x3Array() throws NullEmptyCollectionException {
        List<List<Integer>> rotatedMatrix = rotate2DArray.rotateMatrix(create3x3Array());
        assertNotNull(rotatedMatrix);
        assertEquals(3, rotatedMatrix.size());
        assertEquals(new Integer(7), rotatedMatrix.get(0).get(0));
        assertEquals(new Integer(4), rotatedMatrix.get(0).get(1));
        assertEquals(new Integer(1), rotatedMatrix.get(0).get(2));
        assertEquals(new Integer(8), rotatedMatrix.get(1).get(0));
        assertEquals(new Integer(5), rotatedMatrix.get(1).get(1));
        assertEquals(new Integer(2), rotatedMatrix.get(1).get(2));
        assertEquals(new Integer(9), rotatedMatrix.get(2).get(0));
        assertEquals(new Integer(6), rotatedMatrix.get(2).get(1));
        assertEquals(new Integer(3), rotatedMatrix.get(2).get(2));
    }

    private List<List<Integer>> create2x2Array() {
        List<List<Integer>> matrix = new ArrayList<>();
        List<Integer> firstRow = new ArrayList<>();
        List<Integer> secondRow = new ArrayList<>();

        firstRow.add(1);
        firstRow.add(2);
        secondRow.add(3);
        secondRow.add(4);
        matrix.add(firstRow);
        matrix.add(secondRow);
        return matrix;
    }

    private List<List<Integer>> create3x3Array() {
        List<List<Integer>> matrix = new ArrayList<>();
        List<Integer> firstRow = new ArrayList<>();
        List<Integer> secondRow = new ArrayList<>();
        List<Integer> thirdRow = new ArrayList<>();

        firstRow.add(1);
        firstRow.add(2);
        firstRow.add(3);
        secondRow.add(4);
        secondRow.add(5);
        secondRow.add(6);
        thirdRow.add(7);
        thirdRow.add(8);
        thirdRow.add(9);
        matrix.add(firstRow);
        matrix.add(secondRow);
        matrix.add(thirdRow);
        return matrix;
    }
}
