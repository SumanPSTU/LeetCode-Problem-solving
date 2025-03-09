package DSA.LinkedList;
import java.util.ArrayList;
import java.util.List;

public class MaximumTwinSum_2130 {
    static class ListNode{
        ListNode next;
        int val;
        ListNode(int val){
            this.val = val;
        }
    }
    public static int pairSumWithArrayList(ListNode head){
        if (head == null) return 0;
        List<Integer> list = new ArrayList<>();
        ListNode temp =head;
        while (temp!=null){
            list.add(temp.val);
            temp = temp.next;
        }
        int max = 0;
        int left = 0;
        int right = list.size()-1;
        while (left<right){
            if (list.get(left)+list.get(right)>max){
                max = list.get(left)+list.get(right);
            }
            left++;
            right--;
        }
        return max;
    }
    public static ListNode reverse(ListNode head){
        ListNode prev = head;
        ListNode current = head.next;
        while (current!= null){
            ListNode nextNode = current.next;
            current.next = prev;
            prev = current;
            current = nextNode;
        }
        head.next = null;
        return prev;
    }
    public static int pairSum(ListNode head){
        if (head == null) return 0;
        ListNode slow = head;
        ListNode fast = head;
        while (fast.next!=null && fast.next.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        int max = 0;
        ListNode node = reverse(slow.next);
        while (node!=null){
            if (max<head.val+node.val){
                max = head.val + node.val;
            }
            head = head.next;
            node = node.next;
        }
        return max;
    }

    public static void main(String[] args) {
        ListNode a = new ListNode(1);
        ListNode b = new ListNode(8);
        ListNode c = new ListNode(6);
        ListNode d = new ListNode(9);
        // connect node each other
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = null;
        System.out.println(pairSum(a));
    }
}
