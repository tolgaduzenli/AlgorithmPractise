package elementsofprogramming.linkedlists;

import java.util.PriorityQueue;

/**
 * @author Tolga Duzenli on 12/28/16.
 *         This class deletes last k th element from list.
 *         Time complexity O(n), space complexity O(1).
 *         Test cases:
 *         - Null or Empty list
 *         - Zero element
 *         - All elements
 *         - negative number for k
 *         - for k, greater than list size.
 */
public class DeleteLastKthElement {

    public ListNode<Integer> deleteLastKthElement(ListNode<Integer> head, int k) {
        ListNode<Integer> dummyHead = new ListNode<>(0,head);
        ListNode<Integer> first = dummyHead.next;

        while (k-- > 0) {
            first = first.next;
        }

        ListNode<Integer> second = dummyHead;
        while (first != null) {
            first = first.next;
            second = second.next;
        }
        second.next = first;
        return dummyHead.next;
    }
}
