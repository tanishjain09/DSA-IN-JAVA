package dataStructures.LinkedList;

public class PalindromeLinkedList {
    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
    public static void main(String[] args) {

    }
    public boolean isPalindrome(ListNode head) {
        ListNode mid = findMidde(head);
        ListNode headSecond = reverseList(mid);
        ListNode reverseHead = headSecond;

        //compare both the half
        while (head !=null && headSecond != null) {
            if(head.val != headSecond.val){
                break;
            }
            head = head.next;
            headSecond = headSecond.next;
        }
        reverseList(reverseHead);
        if(head == null || headSecond == null){
            return true;
        }
        return false;
    }

    private ListNode findMidde(ListNode head){
        ListNode slow = head;
        ListNode fast = head;

        while(fast!=null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }

        return slow;
    }

    public ListNode reverseList(ListNode head) {
        if(head == null){
            return head;
        }
        ListNode prev = null;
        ListNode present = head;
        ListNode next = present.next;

        while(present != null){
            present.next = prev;
            prev = present;
            present = next;
            if(next != null){
                next = next.next;
            }
        }
        return prev;
    }
}
