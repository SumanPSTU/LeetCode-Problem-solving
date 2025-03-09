package DSA.LinkedList;

public class RemoveNthNode {
    static class ListNode{
        int value;
        ListNode next;
        ListNode(int value){

        }
    }
    public static void main(String[] args) {
        ListNode a = new ListNode(1);
        ListNode b = new ListNode(3);
        ListNode c = new ListNode(8);
        ListNode d = new ListNode(45);
        a.next = b;
        b.next = c;
        c.next = d;

    }
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode fast = dummy;
        ListNode slow = dummy;

        for (int i = 0; i <= n; i++) {
            fast = fast.next;
        }

        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return dummy.next;
    }

    public static class EvenOddLinkedList {
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
        public void oddEvenList(ListNode head) {
            /*if (head == null) {
                return null;
            }*/

            ListNode odd = head;
            ListNode even = head.next;
            ListNode evenHead = even;

            while (even != null && even.next != null) {
                odd.next = even.next;
                odd = odd.next;
                even.next = odd.next;
                even = even.next;
            }

            odd.next = evenHead;
            display(head);
        }
        public static void SeparateList(ListNode head){
            ListNode temp = head;
            ListNode dummy1 = new ListNode(0);
            ListNode dummy2 = new ListNode(0);
            ListNode temp1 = dummy1;
            ListNode temp2 = dummy2;
            while (temp!=null){
                if (temp.val%2==0){
                    ListNode a = new ListNode(temp.val);
                    temp1.next = a;
                    temp1 = a;
                }else {
                    ListNode a = new ListNode(temp.val);
                    temp2.next = a;
                    temp2 = a;
                }
                temp = temp.next;
            }
            temp1.next = dummy2.next;
            display(dummy1.next);
        }

        public static void main(String[] args) {
            ListNode a = new ListNode(1);
            ListNode b = new ListNode(2);
            ListNode c = new ListNode(3);
            ListNode d = new ListNode(4);
            ListNode e = new ListNode(5);
            ListNode f = new ListNode(6);
            a.next = b;
            b.next = c;
            c.next = d;
            d.next = e;
            e.next = f;
            SeparateList(a);
        }
    }

    public static class RemoveDuplicateElement {
        static class ListNode{
            ListNode next;
            int val;
            ListNode(int val){
                this.val = val;
            }
        }

        public static void main(String[] args) {
            ListNode a = new ListNode(1);
            ListNode b = new ListNode(1);
            ListNode c = new ListNode(2);
            ListNode d = new ListNode(3);
            ListNode e = new ListNode(3);
            ListNode f = new ListNode(3);
            ListNode g = new ListNode(4);
            ListNode h = new ListNode(4);
            ListNode i = new ListNode(4);
            ListNode j = new ListNode(5);
            ListNode k = new ListNode(5);
            ListNode l = new ListNode(6);
            ListNode m = new ListNode(6);
            a.next = b;
            b.next = c;
            c.next = d;
            d.next = e;
            e.next = f;
            f.next = g;
            g.next = h;
            h.next =i;
            i.next = j;
            j.next = k;
            k.next = l;
            l.next = m;
        }
    }
}