package elementsofprogramming.linklists;

import elementsofprogramming.linkedlists.ListNode;
import elementsofprogramming.linkedlists.MergeTwoSortedList;
import org.junit.BeforeClass;
import org.junit.Test;
import util.LinkedListUtil;

/**
 * @author Tolga Duzenli on 12/24/16.
 */
public class TestMergeTwoSortedList {

    private static MergeTwoSortedList mergeTwoSortedList;

    @BeforeClass
    public static void setUp() {
        mergeTwoSortedList = new MergeTwoSortedList();
    }

    @Test
    public void testWithTwoSortedList() {
        ListNode<Integer> mergedList = mergeTwoSortedList.mergeTwoSortedList(LinkedListUtil.createListL1(),
                LinkedListUtil.createListL2());
        LinkedListUtil.printList("Test Two sorted list", mergedList);
    }

}
