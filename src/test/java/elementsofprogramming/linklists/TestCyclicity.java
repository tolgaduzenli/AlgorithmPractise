package elementsofprogramming.linklists;

import elementsofprogramming.linkedlists.Cyclicity;
import elementsofprogramming.linkedlists.ListNode;
import org.junit.BeforeClass;
import org.junit.Test;
import util.LinkedListUtil;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

/**
 * @author Tolga Duzenli on 12/25/16.
 */
public class TestCyclicity {

    private static Cyclicity cyclicity;

    @BeforeClass
    public static void setUp() {
        cyclicity = new Cyclicity();
    }

    @Test
    public void testNullList() {
        ListNode<Integer> list = cyclicity.hasCycle(null);
        assertNull(list);
    }

    @Test
    public void testEmptyList() {
        ListNode<Integer> list = cyclicity.hasCycle(new ListNode<Integer>());
        assertNull(list);
    }

    @Test
    public void testCycleList() {
        ListNode<Integer> list = cyclicity.hasCycle(LinkedListUtil.createCycleList());
        assertNotNull(list);
    }

    @Test
    public void showStartPointOfCycle() {
        ListNode<Integer> list = cyclicity.hasCycle(LinkedListUtil.createCycleList());
        assertNotNull(list);
        assertEquals(list.data, new Integer(11));
        System.out.println(list.data);
    }

}
