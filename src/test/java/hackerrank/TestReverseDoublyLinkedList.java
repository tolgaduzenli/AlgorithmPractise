package hackerrank;

import hackerrank.linkedlist.Node;
import org.junit.BeforeClass;
import org.junit.Test;
import util.LinkedListUtil;

import static org.junit.Assert.assertNull;

/**
 * @author Tolga Duzenli on 1/6/17.
 */
public class TestReverseDoublyLinkedList {

    private static ReverseDoublyLinkedList reverseDoublyLinkedList;

    @BeforeClass
    public static void setup() {
        reverseDoublyLinkedList = new ReverseDoublyLinkedList();
    }

    @Test
    public void testWithNullList() {
        Node reverse = reverseDoublyLinkedList.reverse(null);
        assertNull(reverse);
    }

    @Test
    public void testReverseWithOneNode() {
        Node node = new Node(2, null, null);
        System.out.print("TestReverseWithOneNode - Original List : ");
        LinkedListUtil.printLinkedList(node);
        Node reverse = reverseDoublyLinkedList.reverse(node);
        System.out.print("TestReverseWithOneNode - Reversed List : ");
        LinkedListUtil.printLinkedList(reverse);
    }

    @Test
    public void testReverseWithSuccessList() {
        Node doublyLinkedList = LinkedListUtil.createDoublyLinkedList();
        System.out.print("TestReverseWithSuccessList - Original List : ");
        LinkedListUtil.printLinkedList(doublyLinkedList);
        Node reverse = reverseDoublyLinkedList.reverse(doublyLinkedList);
        System.out.print("TestReverseWithSuccessList - Reversed List : ");
        LinkedListUtil.printLinkedList(reverse);
    }

}
