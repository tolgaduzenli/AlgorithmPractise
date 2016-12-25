package elementsofprogramming.linklists;

import elementsofprogramming.linkedlists.ListNode;
import elementsofprogramming.linkedlists.ReverseLinkList;
import exception.WrongParameterException;
import org.junit.BeforeClass;
import org.junit.Test;
import util.LinkListUtil;

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
        ListNode<Integer> L = LinkListUtil.createSingleList();
        reverseLinkList.reverseSublist(L, 5, 2);
    }

    // List = 9,3,11,2,5,7
    //expected List = 5, 2, 11, 3, 9, 7
    @Test
    public void testWithFirstNode() throws WrongParameterException {
        ListNode<Integer> L = LinkListUtil.createSingleList();
        LinkListUtil.printList("Original List", L);
        ListNode<Integer> reversedList = reverseLinkList.reverseSublist(L, 1, 5);
        LinkListUtil.printList("Test reverseSublist with first Node, start: 1, finish: 5", reversedList);
    }

    // List = 9,3,11,2,5,7
    //expected List = 9, 5, 2, 11, 3, 7
    @Test
    public void testSublistSuccessfulCase() throws WrongParameterException {
        ListNode<Integer> L = LinkListUtil.createSingleList();
        LinkListUtil.printList("Original List", L);
        ListNode<Integer> reversedList = reverseLinkList.reverseSublist(L, 2, 5);
        LinkListUtil.printList("Test reverseSublist with successful case, start: 2, finish: 5", reversedList);
    }

    @Test
    public void testReverseWithNull() {
        ListNode<Integer> reversedList = reverseLinkList.reverseList(null);
        assertNull(reversedList);
    }

    @Test
    public void testReverseWithSuccessfulCase() {
        ListNode<Integer> L = LinkListUtil.createSingleList();
        LinkListUtil.printList("Original List", L);
        ListNode<Integer> reversedList = reverseLinkList.reverseList(L);
        LinkListUtil.printList("Reversed List", reversedList);
    }

}
