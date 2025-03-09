package DSA.LinkedList;
public class OddEvenLinkedList {
    static class ListNode{
        ListNode next;
        int val;
        ListNode(int val){
            this.val = val;
        }
    }
    public static void main(String[] args) {

    }
    public ListNode OddEvenList(ListNode head){
       if (head==null) return null;
       ListNode odd = head;
       ListNode even = head.next;
       ListNode evenHead = even;
       while (even!=null && even.next!=null){
           odd.next = even.next;
           odd = odd.next;
           even.next = odd.next;
           even = even.next;
       }
       odd.next = evenHead;
       return head;
    }
}
