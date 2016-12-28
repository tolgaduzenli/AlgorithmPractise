package util;

import elementsofprogramming.linkedlists.ListNode;

/**
 * @author Tolga Duzenli on 12/25/16.
 */
public class LinkListUtil {

    /**
     * List; 9, 3, 11, 2, 5, 7
     *
     * @return
     */
    public static ListNode<Integer> createSingleList() {
        ListNode<Integer> n1 = new ListNode<>(7, null);
        ListNode<Integer> n2 = new ListNode<>(5, n1);
        ListNode<Integer> n3 = new ListNode<>(2, n2);
        ListNode<Integer> n4 = new ListNode<>(11, n3);
        ListNode<Integer> n5 = new ListNode<>(3, n4);
        ListNode<Integer> n6 = new ListNode<>(9, n5);
        return n6;
    }

    /**
     * List; 9, 3, 11, 2, 5, 7, 11 .....
     *
     * @return
     */
    public static ListNode<Integer> createCycleList() {
        ListNode<Integer> n1 = new ListNode<>(7, null);
        ListNode<Integer> n2 = new ListNode<>(5, n1);
        ListNode<Integer> n3 = new ListNode<>(2, n2);
        ListNode<Integer> n4 = new ListNode<>(11, n3);
        n1.next = n4;
        ListNode<Integer> n5 = new ListNode<>(3, n4);
        ListNode<Integer> n6 = new ListNode<>(9, n5);
        return n6;
    }

    public static ListNode<Integer> createListL1() {
        ListNode<Integer> n1 = new ListNode<>(7, null);
        ListNode<Integer> n2 = new ListNode<>(5, n1);
        ListNode<Integer> n3 = new ListNode<>(2, n2);
        return n3;
    }

    public static ListNode<Integer> createListL2() {
        ListNode<Integer> n1 = new ListNode<>(11, null);
        ListNode<Integer> n2 = new ListNode<>(3, n1);
        return n2;
    }

    /**
     * List; 9, 3, 3, 11, 11, 2, 2, 5, 5, 5, 7
     *
     * @return
     */
    public static ListNode<Integer> createDuplicateElementsList() {
        ListNode<Integer> n1 = new ListNode<>(7, null);
        ListNode<Integer> n2 = new ListNode<>(5, n1);
        ListNode<Integer> n3 = new ListNode<>(5, n2);
        ListNode<Integer> n4 = new ListNode<>(5, n3);
        ListNode<Integer> n5 = new ListNode<>(2, n4);
        ListNode<Integer> n6 = new ListNode<>(2, n5);
        ListNode<Integer> n7 = new ListNode<>(11, n6);
        ListNode<Integer> n8 = new ListNode<>(11, n7);
        ListNode<Integer> n9 = new ListNode<>(3, n8);
        ListNode<Integer> n10 = new ListNode<>(3, n9);
        ListNode<Integer> n11 = new ListNode<>(9, n10);
        return n11;
    }

    /**
     * List; 9, 9, 9, 9
     *
     * @return
     */
    public static ListNode<Integer> createFullDuplicateElementsList() {
        ListNode<Integer> n1 = new ListNode<>(9, null);
        ListNode<Integer> n2 = new ListNode<>(9, n1);
        ListNode<Integer> n3 = new ListNode<>(9, n2);
        ListNode<Integer> n4 = new ListNode<>(9, n3);
        return n4;
    }

    public static void printList(String testCaseName, ListNode<Integer> listNode) {
        while (listNode != null) {
            System.out.printf(listNode.data + " ");
            listNode = listNode.next;
        }
        System.out.println("\n" + testCaseName);
    }
}
