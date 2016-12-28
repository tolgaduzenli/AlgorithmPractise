package elementsofprogramming.linkedlists;

/**
 * @author Tolga Duzenli on 12/28/16.
 *         This class deletes duplicate elements from given list.
 *         Time complexity O(n), space complexity O(1).
 *         Test cases:
 *         - Null or Empty list
 *         - Zero duplciate element
 *         - Full diplicate element
 */
public class DeleteDuplicateElements {

    public ListNode<Integer> deleteDuplicateElements(ListNode<Integer> head) {
        ListNode<Integer> iterator = head;

        while (iterator != null) {
            ListNode<Integer> nextDistinct = iterator.next;
            while (nextDistinct != null && nextDistinct.data == iterator.data) {
                nextDistinct = nextDistinct.next;
            }
            iterator.next = nextDistinct;
            iterator = nextDistinct;
        }
        return head;
    }
}
