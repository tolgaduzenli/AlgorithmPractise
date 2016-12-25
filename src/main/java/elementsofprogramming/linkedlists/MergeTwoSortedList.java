package elementsofprogramming.linkedlists;

/**
 * @author Tolga Duzenli on 12/24/16.
 *         This class provides merge operation for two sorted list.
 *         Time complexity: O(n+m) n; lenght of first list, m; lenght of second list.
 *         Space complexity: O(1)
 */
public class MergeTwoSortedList {

    public ListNode<Integer> mergeTwoSortedList(ListNode<Integer> L1, ListNode<Integer> L2) {
        ListNode<Integer> dummyHead = new ListNode<Integer>(0, null);
        ListNode<Integer> current = dummyHead;
        ListNode<Integer> p1 = L1, p2 = L2;

        while (p1 != null && p2 != null) {
            if (p1.data <= p2.data) {
                current.next = p1;
                p1 = p1.next;
            } else {
                current.next = p2;
                p2 = p2.next;
            }
            current = current.next;
        }
        //appends the remaining nodes of p1 or p2.
        current.next = p1 != null ? p1 : p2;
        return dummyHead.next;
    }
}
