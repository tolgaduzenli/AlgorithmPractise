package elementsofprogramming.linkedlists;

/**
 * @author Tolga Duzenli on 12/25/16.
 */
public class Cyclicity {

    public ListNode<Integer> hasCycle(ListNode<Integer> head) {
        ListNode<Integer> fast = head, slow = head;

        while (fast != null && fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                //found cycle and now tries to start point of cycle
                slow = head;
                while (slow != fast) {
                    slow = slow.next;
                    fast = fast.next;
                }
                return slow; // slow is the start of the cycle
            }
        }
        return null;
    }
}
