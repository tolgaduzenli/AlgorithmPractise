package elementsofprogramming.linklists;

import elementsofprogramming.linkedlists.DeleteLastKthElement;
import elementsofprogramming.linkedlists.ListNode;
import org.junit.BeforeClass;
import org.junit.Test;
import util.LinkListUtil;

/**
 * @author Tolga Duzenli on 12/28/16.
 */
public class TestDeleteLastKthElement {

    private static DeleteLastKthElement deleteLastKthElement;


    @BeforeClass
    public static void setup(){
        deleteLastKthElement = new DeleteLastKthElement();
    }

    @Test
    public void testWithLast3Element(){
        ListNode<Integer> singleList = LinkListUtil.createSingleList();
        LinkListUtil.printList("Before delete:",singleList);
        ListNode<Integer> listNode = deleteLastKthElement.deleteLastKthElement(singleList, 3);
        LinkListUtil.printList("After delete last 3 element:",listNode);
    }

    @Test
    public void testWithAllElements(){
        ListNode<Integer> singleList = LinkListUtil.createSingleList();
        LinkListUtil.printList("Before delete:",singleList);
        ListNode<Integer> listNode = deleteLastKthElement.deleteLastKthElement(singleList, 6);
        LinkListUtil.printList("After delete all elements:",listNode);
    }

    @Test
    public void testWithZeroElement(){
        ListNode<Integer> singleList = LinkListUtil.createSingleList();
        LinkListUtil.printList("Before delete:",singleList);
        ListNode<Integer> listNode = deleteLastKthElement.deleteLastKthElement(singleList, 0);
        LinkListUtil.printList("After delete zero elements:",listNode);
    }
}
