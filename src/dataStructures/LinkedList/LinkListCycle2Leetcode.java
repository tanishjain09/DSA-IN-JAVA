package dataStructures.LinkedList;

public class LinkListCycle2Leetcode {
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
    public ListNode1 detectCycle(ListNode1 head) {
        int length = 0;
        ListNode1 fast = head;
        ListNode1 slow = head;

        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow){
                length = cycleLength(slow);
                break;
            }
        }

        if(length == 0){
            return null;
        }

        //find the start
        ListNode1 f = head;
        ListNode1 s = head;

        while (length > 0){
            s = s.next;
            length --;
        }

        //keep moving both forward and they will meet at cycle start

        while (f!= s){
            f = f.next;
            s = s.next;
        }
        return s;
    }

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

