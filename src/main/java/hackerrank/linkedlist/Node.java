package hackerrank.linkedlist;

/**
 * @author Tolga Duzenli on 1/6/17.
 */
public class Node {
    public int data;
    public Node next;
    public Node prev;

    public Node() {
    }

    public Node(int data, Node next, Node prev) {
        this.data = data;
        this.next = next;
        this.prev = prev;
    }
}
