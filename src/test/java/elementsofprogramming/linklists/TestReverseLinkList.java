package elementsofprogramming.linklists;

import elementsofprogramming.linkedlists.ListNode;
import elementsofprogramming.linkedlists.ReverseLinkList;
import exception.WrongParameterException;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

/**
 * @author Tolga Duzenli on 12/24/16.
 */
public class TestReverseLinkList {

    private static ReverseLinkList reverseLinkList;

    @BeforeClass
    public static void setUp() {
        reverseLinkList = new ReverseLinkList();
    }

    @Test
    public void testWithNullList() throws WrongParameterException {
        ListNode<Integer> L = null;
        ListNode<Integer> reversedList = reverseLinkList.reverseSublist(L, 2, 5);
        assertEquals(L, reversedList);
    }

    @Test
    public void testWithEmptyList() throws WrongParameterException {
        ListNode<Integer> L = new ListNode<>();
        ListNode<Integer> reversedList = reverseLinkList.reverseSublist(L, 2, 3);
        assertEquals(L, reversedList);
    }

    @Test(expected = WrongParameterException.class)
    public void testWithWrongOrder() throws WrongParameterException {
        ListNode<Integer> L = createListL();
        reverseLinkList.reverseSublist(L, 5, 2);
    }

    // List = 9,3,11,2,5,7
    //expected List = 5, 2, 11, 3, 9, 7
    @Test
    public void testWithFirstNode() throws WrongParameterException {
        ListNode<Integer> L = createListL();
        printList("Original List", L);
        ListNode<Integer> reversedList = reverseLinkList.reverseSublist(L, 1, 5);
        printList("Test reverseSublist with first Node, start: 1, finish: 5", reversedList);
    }

    // List = 9,3,11,2,5,7
    //expected List = 9, 5, 2, 11, 3, 7
    @Test
    public void testSublistSuccessfulCase() throws WrongParameterException {
        ListNode<Integer> L = createListL();
        printList("Original List", L);
        ListNode<Integer> reversedList = reverseLinkList.reverseSublist(L, 2, 5);
        printList("Test reverseSublist with successful case, start: 2, finish: 5", reversedList);
    }

    @Test
    public void testReverseWithNull() {
        ListNode<Integer> reversedList = reverseLinkList.reverseList(null);
        assertNull(reversedList);
    }

    @Test
    public void testReverseWithSuccessfulCase() {
        ListNode<Integer> L = createListL();
        printList("Original List", L);
        ListNode<Integer> reversedList = reverseLinkList.reverseList(L);
        printList("Reversed List", reversedList);
    }


    private ListNode<Integer> createListL() {
        ListNode<Integer> n1 = new ListNode<>(7, null);
        ListNode<Integer> n2 = new ListNode<>(5, n1);
        ListNode<Integer> n3 = new ListNode<>(2, n2);
        ListNode<Integer> n4 = new ListNode<>(11, n3);
        ListNode<Integer> n5 = new ListNode<>(3, n4);
        ListNode<Integer> n6 = new ListNode<>(9, n5);
        return n6;
    }


    private void printList(String testCaseName, ListNode<Integer> listNode) {
        while (listNode != null) {
            System.out.printf(listNode.data + " ");
            listNode = listNode.next;
        }
        System.out.println("  : " + testCaseName);
    }

}
