package elementsofprogramming.linkedlists;

/**
 * @author Tolga Duzenli on 12/24/16.
 */
public class ListNode<T> {
    public T data;
    public ListNode<T> next;

    public ListNode() {
    }

    public ListNode(T data, ListNode next) {
        this.data = data;
        this.next = next;
    }
}
