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
public class TestComputeSpiralOrder {

    private static ComputeSpiralOrder computeSpiralOrder;

    @BeforeClass
    public static void setUp() {
        computeSpiralOrder = new ComputeSpiralOrder();
    }

    @Test(expected = NullEmptyCollectionException.class)
    public void testWithNullList() throws NullEmptyCollectionException {
        computeSpiralOrder.matrixFromTopLeftCornerToClockwise(null);
    }

    @Test(expected = NullEmptyCollectionException.class)
    public void testWithEmptyList() throws NullEmptyCollectionException {
        computeSpiralOrder.matrixFromTopLeftCornerToClockwise(Collections.emptyList());
    }

    @Test
    public void testWith2x2Array() throws NullEmptyCollectionException {
        List<Integer> spiralOrder = computeSpiralOrder.matrixFromTopLeftCornerToClockwise(create2x2Array());
        assertNotNull(spiralOrder);
        assertEquals(4, spiralOrder.size());
        assertEquals(new Integer(1), spiralOrder.get(0));
        assertEquals(new Integer(2), spiralOrder.get(1));
        assertEquals(new Integer(4), spiralOrder.get(2));
        assertEquals(new Integer(3), spiralOrder.get(3));
        System.out.println();
        spiralOrder.forEach(System.out::print);
    }

    @Test
    public void testWith3x3Array() throws NullEmptyCollectionException {
        //1,2,3,6,9,8,7,4,5
        List<Integer> spiralOrder = computeSpiralOrder.matrixFromTopLeftCornerToClockwise(create3x3Array());
        assertNotNull(spiralOrder);
        assertEquals(9, spiralOrder.size());
        assertEquals(new Integer(1), spiralOrder.get(0));
        assertEquals(new Integer(2), spiralOrder.get(1));
        assertEquals(new Integer(3), spiralOrder.get(2));
        assertEquals(new Integer(6), spiralOrder.get(3));
        assertEquals(new Integer(9), spiralOrder.get(4));
        assertEquals(new Integer(8), spiralOrder.get(5));
        assertEquals(new Integer(7), spiralOrder.get(6));
        assertEquals(new Integer(4), spiralOrder.get(7));
        assertEquals(new Integer(5), spiralOrder.get(8));
        System.out.println();
        spiralOrder.forEach(System.out::print);
    }

    @Test
    public void testFromTopRightCornerToOppositeClockwise() throws NullEmptyCollectionException {
        List<Integer> spiralOrder = computeSpiralOrder.matrixFromTopRightCornerToOppositeClockwise(create2x2Array());
        assertNotNull(spiralOrder);
        assertEquals(4, spiralOrder.size());
        assertEquals(new Integer(2), spiralOrder.get(0));
        assertEquals(new Integer(1), spiralOrder.get(1));
        assertEquals(new Integer(3), spiralOrder.get(2));
        assertEquals(new Integer(4), spiralOrder.get(3));
        System.out.println();
        spiralOrder.forEach(System.out::print);
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
