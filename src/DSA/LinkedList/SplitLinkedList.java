package DSA.LinkedList;

public class SplitLinkedList {
    static class ListNode{
        ListNode next;
        int val;
        ListNode(int val){
            this.val = val;
        }
    }
    public static void main(String[] args) {
        ListNode a = new ListNode(2);
        ListNode b = new ListNode(6);
        ListNode c = new ListNode(33);
        ListNode d = new ListNode(34);
        // connect first list
        a.next = b;
        b.next = c;
        c.next = d;
    }
}
