package DSA.LinkedList;

import java.util.ArrayList;
import java.util.List;

public class PalindromeLinkedList_234 {
    static class ListNode{
        int val;
        ListNode next;
        ListNode(int val){
            this.val = val;
        }
    }
    public static boolean IsPalindrome(ListNode head){
        if (head==null) return true;
        List<Integer> list = new ArrayList<>();
        while (head!=null){
            list.add(head.val);
            head = head.next;
        }
        int left = 0;
        int right = list.size()-1;
        while (left<right){
            if (!list.get(left).equals(list.get(right))) return false;
            left++;
            right--;
        }
        return true;
    }
    public static ListNode reverse(ListNode head){
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
    public static boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) return false;
        ListNode slow = head;
        ListNode fast = head;
        while (fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode node = reverse(slow.next);
        slow.next = node;
        while (node!=null){
            if (head.val == node.val){
                head = head.next;
                node = node.next;
            }else {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        ListNode a = new ListNode(1);
        ListNode b = new ListNode(2);
        ListNode c = new ListNode(3);
        ListNode d = new ListNode(2);
        ListNode e = new ListNode(1);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        System.out.println(IsPalindrome(a));
        System.out.println(isPalindrome(a));
    }
}
