package leetcode.solution.linkedlist;

public class DeleteNode {
    public void deleteNode(ListNode node) {

        ListNode nextNode = node.next;
        node.val = nextNode.val;
        node.next = nextNode.next;
    }
}
