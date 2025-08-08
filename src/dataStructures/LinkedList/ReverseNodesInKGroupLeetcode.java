package dataStructures.LinkedList;

import org.w3c.dom.NodeList;

public class ReverseNodesInKGroupLeetcode {
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

    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode temp = head;
        int count = 0;


        //count if list have k element
        while(count < k){
            if(temp == null){
                return head;
            }
            temp = temp.next;
            count++;
        }

        //recursively call for remaining list
        ListNode prevNode = reverseKGroup(temp,k);

        //reverse the current node and add to the coming from recusion

        temp = head; count = 0;
        while (count < k){
            ListNode next = temp.next;
            temp.next = prevNode;
            prevNode = temp;
            temp = next;
            count++;
        }
        return prevNode;
    }
}
