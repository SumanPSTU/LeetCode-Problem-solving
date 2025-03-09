package DSA.LinkedList;

public class MergeTwoList {
    static class ListNode{
        ListNode next;
        int val;
        ListNode(int val){
            this.val = val;
        }
    }
    public static ListNode mergeTwoListsWithOutExtraSpace(ListNode list1, ListNode list2){
        if (list1==null && list2 == null) return  null;
        if (list1.val>list2.val){
            list2.next = list1;
        }else {
            list1.next = list2;
        }

        return null;
    }
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2){
        if (list1==null && list2==null) return null;
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        while (list1!=null && list2!=null){
            if (list1.val < list2.val){
                current.next = list1;
                list1 = list1.next;
            }else {
                current.next = list2;
                list2 = list2.next;
            }
            current = current.next;
        }
        if (list1.next==null){
            current.next = list2;
        }else {
            current.next = list1;
        }
        return dummy.next;
    }
    static void display(ListNode head){
        ListNode temp = head;
        while (temp!= null){
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
        System.out.println("End");
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

        // make second list

        ListNode e = new ListNode(12);
        ListNode f = new ListNode(21);
        ListNode g = new ListNode(22);
        ListNode h = new ListNode(23);
        // connect second lsit
        e.next = f;
        f.next = g;
        g.next = h;
        display(mergeTwoLists(a,e));
    }
}
