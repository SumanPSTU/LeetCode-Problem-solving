package DSA.LinkedList;
public class ReverseLinkedList_206 {
    static class ListNode{
        ListNode next;
        int val;
        ListNode(int val){
            this.val = val;
        }
    }
    static void display(ListNode head){
        ListNode temp = head;
        while (temp!=null){
            System.out.print(temp.val+"->");
            temp = temp.next;
        }
        System.out.println("End");
    }
    public static ListNode reverseIteratorList(ListNode head){
        if (head == null || head.next == null) return head;
        ListNode prev = head;
        ListNode current = head.next;
        while (current!=null){
            ListNode nextNode = current.next;
            current.next = prev;
            prev = current;
            current = nextNode;
        }
        head.next = null;
        return prev;
    }
    public static ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode newHead = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }

    public static void main(String[] args) {
        ListNode a = new ListNode(1);
        ListNode b = new ListNode(2);
        ListNode c = new ListNode(4);
        ListNode d = new ListNode(5);
        ListNode e = new ListNode(6);
        ListNode f = new ListNode(7);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        display(a);
        //display(reverseIteratorList(a));
        display(reverseList(a));
    }
}
