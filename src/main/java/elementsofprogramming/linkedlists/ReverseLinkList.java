package elementsofprogramming.linkedlists;

import constants.EnumParameterErrorCodes;
import exception.WrongParameterException;

/**
 * @author Tolga Duzenli on 12/24/16.
 */
public class ReverseLinkList {

    public ListNode<Integer> reverseSublist(ListNode<Integer> L, int start, int finish) throws WrongParameterException {
        if (start == finish || L == null || L.next == null) {
            return L;
        }
        if (start > finish || start < 1 || finish < 1) {
            throw new WrongParameterException(EnumParameterErrorCodes.WRONG_PARAMETER);
        }

        ListNode<Integer> dummyHead = new ListNode<>(0, L);
        ListNode<Integer> sublistHead = dummyHead;
        int k = 1;
        while (k++ < start) {
            sublistHead = sublistHead.next;
        }

        ListNode<Integer> sublistIter = sublistHead.next;
        while (start++ < finish) {
            ListNode<Integer> tmp = sublistIter.next;
            sublistIter.next = tmp.next;
            tmp.next = sublistHead.next;
            sublistHead.next = tmp;
        }
        return dummyHead.next;
    }

    public ListNode<Integer> reverseList(ListNode<Integer> L) {
        if (L == null) {
            return L;
        }
        ListNode<Integer> currentNode = L;
        ListNode<Integer> reversedList = null;
        while (currentNode != null) {
            ListNode<Integer> temp = currentNode.next;
            currentNode.next = reversedList;
            reversedList = currentNode;
            currentNode = temp;
        }
        return reversedList;
    }
}
