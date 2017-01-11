package elementsofprogramming.linklists;

import elementsofprogramming.linkedlists.DeleteDuplicateElements;
import elementsofprogramming.linkedlists.ListNode;
import org.junit.BeforeClass;
import org.junit.Test;
import util.LinkedListUtil;

/**
 * @author Tolga Duzenli on 12/28/16.
 */
public class TestDeleteDuplicateElements {


    private static DeleteDuplicateElements deleteDuplicateElements;

    @BeforeClass
    public static void setup() {
        deleteDuplicateElements = new DeleteDuplicateElements();
    }

    @Test
    public void testWithDuplicateElements() {
        ListNode<Integer> duplicateElementsHead = LinkedListUtil.createDuplicateElementsList();
        LinkedListUtil.printList("Before duplicate element's List", duplicateElementsHead);
        ListNode<Integer> distinctList = deleteDuplicateElements.deleteDuplicateElements(duplicateElementsHead);
        LinkedListUtil.printList("After duplicate element's List", distinctList);
    }


    @Test
    public void testWithZeroDuplicateElements() {
        ListNode<Integer> duplicateElementsHead = LinkedListUtil.createSingleList();
        LinkedListUtil.printList("Before zero duplicate element's List", duplicateElementsHead);
        ListNode<Integer> distinctList = deleteDuplicateElements.deleteDuplicateElements(duplicateElementsHead);
        LinkedListUtil.printList("After zero duplicate element's List", distinctList);
    }

    @Test
    public void testWithFullDuplicateElements() {
        ListNode<Integer> duplicateElementsHead = LinkedListUtil.createFullDuplicateElementsList();
        LinkedListUtil.printList("Before full duplicate element's List", duplicateElementsHead);
        ListNode<Integer> distinctList = deleteDuplicateElements.deleteDuplicateElements(duplicateElementsHead);
        LinkedListUtil.printList("After full duplicate element's List", distinctList);
    }
}
