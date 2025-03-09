package DSA.LinkedList;

public class RemoveDuplicate_83 {
    static class ListNode{
        ListNode next;
        int val;
        ListNode(int val){
            this.val = val;
        }
    }
    public ListNode deleteDuplicates(ListNode head) {
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        ListNode slow = head;
        ListNode fast = head.next;
        while (fast!=null){
            if (slow.val!=fast.val){
                current.next = slow;
                current = slow;
            }
            slow = fast;
            fast = fast.next;
        }
        current.next = slow;
        return dummy.next;
    }
    class Solution {
        public ListNode deleteDuplicates(ListNode head) {
            if (head == null) return null;
            ListNode temp = head;
            while (temp!=null && temp.next!= null){
                if (temp.val == temp.next.val){
                    temp.next = temp.next.next;
                }
                temp = temp.next;
            }
            return head;
        }
    }

}
