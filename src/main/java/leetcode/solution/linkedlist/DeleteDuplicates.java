package leetcode.solution.linkedlist;

public class DeleteDuplicates {

    public ListNode deleteDuplicates(ListNode head) {

        if (head == null){
            return null;
        }

        ListNode prev = head;
        ListNode current = head.next;

        while (current!=null){
            if(current.val == prev.val){
                prev.next = current.next;
            }else{
                prev = current;
            }
            current = current.next;
        }

        return head;
    }
}
