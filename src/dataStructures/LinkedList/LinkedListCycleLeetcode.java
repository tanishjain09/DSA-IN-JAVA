package dataStructures.LinkedList;

public class LinkedListCycleLeetcode {
    class ListNode1 {
        int val;
        ListNode1 next;

        ListNode1(int x) {
            val = x;
            next = null;
        }
    }
    public static void main(String[] args) {

    }
    public boolean hasCycle(ListNode1 head) {
        ListNode1 fast = head;
        ListNode1 slow = head;

        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow){
                return true;
            }
        }
        return false;
    }

    //findind length of the cycle
    public int cycleLength(ListNode1 head) {
        ListNode1 fast = head;
        ListNode1 slow = head;

        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow){
                //calculate the length by moving slow pointer again in the loop
                ListNode1 temp = slow;
                int length = 0;
                do{
                    temp = temp.next;
                    length++;
                }while (temp != fast);
                return length;
            }
        }
        return 0;
    }

}
