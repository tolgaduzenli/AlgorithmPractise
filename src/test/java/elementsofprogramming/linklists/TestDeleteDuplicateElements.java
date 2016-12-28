package elementsofprogramming.linklists;

import elementsofprogramming.linkedlists.DeleteDuplicateElements;
import elementsofprogramming.linkedlists.ListNode;
import org.junit.BeforeClass;
import org.junit.Test;
import util.LinkListUtil;

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
        ListNode<Integer> duplicateElementsHead = LinkListUtil.createDuplicateElementsList();
        LinkListUtil.printList("Before duplicate element's List", duplicateElementsHead);
        ListNode<Integer> distinctList = deleteDuplicateElements.deleteDuplicateElements(duplicateElementsHead);
        LinkListUtil.printList("After duplicate element's List", distinctList);
    }


    @Test
    public void testWithZeroDuplicateElements() {
        ListNode<Integer> duplicateElementsHead = LinkListUtil.createSingleList();
        LinkListUtil.printList("Before zero duplicate element's List", duplicateElementsHead);
        ListNode<Integer> distinctList = deleteDuplicateElements.deleteDuplicateElements(duplicateElementsHead);
        LinkListUtil.printList("After zero duplicate element's List", distinctList);
    }

    @Test
    public void testWithFullDuplicateElements() {
        ListNode<Integer> duplicateElementsHead = LinkListUtil.createFullDuplicateElementsList();
        LinkListUtil.printList("Before full duplicate element's List", duplicateElementsHead);
        ListNode<Integer> distinctList = deleteDuplicateElements.deleteDuplicateElements(duplicateElementsHead);
        LinkListUtil.printList("After full duplicate element's List", distinctList);
    }
}
