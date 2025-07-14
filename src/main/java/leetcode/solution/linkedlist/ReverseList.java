package leetcode.solution.linkedlist;

public class ReverseList {

    public ListNode reverseList(ListNode head) {

        ListNode current = head, prev = null, next;

        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }
}
