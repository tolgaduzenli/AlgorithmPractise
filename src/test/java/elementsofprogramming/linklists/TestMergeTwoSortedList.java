package elementsofprogramming.linklists;

import elementsofprogramming.linkedlists.ListNode;
import elementsofprogramming.linkedlists.MergeTwoSortedList;
import org.junit.BeforeClass;
import org.junit.Test;

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
        ListNode<Integer> mergedList = mergeTwoSortedList.mergeTwoSortedList(createListL1(), createListL2());
        printList(mergedList);
    }

    private ListNode<Integer> createListL1() {
        ListNode<Integer> n1 = new ListNode<>(7, null);
        ListNode<Integer> n2 = new ListNode<>(5, n1);
        ListNode<Integer> n3 = new ListNode<>(2, n2);
        return n3;
    }

    private ListNode<Integer> createListL2() {
        ListNode<Integer> n1 = new ListNode<>(11, null);
        ListNode<Integer> n2 = new ListNode<>(3, n1);
        return n2;
    }

    private void printList(ListNode<Integer> listNode) {
        while (listNode != null) {
            System.out.printf(listNode.data + " ");
            listNode = listNode.next;
        }
    }

}
