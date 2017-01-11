package hackerrank;

import hackerrank.linkedlist.Node;

/**
 * @author Tolga Duzenli on 1/6/17.
 */
public class ReverseDoublyLinkedList {

    public Node reverse(Node head) {
        while (head != null) {
            Node temp = head.next;
            head.next = head.prev;
            head.prev = temp;
            if(head.prev == null){
                return head;
            }
            head = temp;
        }
        return head;
    }
}
