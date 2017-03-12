package hackerrank;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author Tolga Duzenli on 3/12/17.
 */
public class TestKnapSackProblem {

    private static KnapSackProblem knapSackProblem;

    @BeforeClass
    public static void setup() {
        knapSackProblem = new KnapSackProblem();
    }


    @Test
    public void findMaxValue() {
        int[] weight = new int[4];
        weight[0] = 1;
        weight[1] = 3;
        weight[2] = 4;
        weight[3] = 5;

        int[] value = new int[4];
        value[0] = 1;
        value[1] = 4;
        value[2] = 5;
        value[3] = 7;
        int maxValue = knapSackProblem.findMaxValue(weight, value, 7);
        System.out.println("Max Value : " + maxValue);
        assertEquals(9, maxValue);
    }
}
