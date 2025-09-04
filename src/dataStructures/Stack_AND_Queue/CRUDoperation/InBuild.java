package dataStructures.Stack_AND_Queue.CRUDoperation;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class InBuild {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(3);
        queue.add(6);
        queue.add(5);
        queue.add(19);
        queue.add(1);

        System.out.println(queue.peek());
        System.out.println(queue.remove());

        queue.poll();

        Deque<Integer> deque = new LinkedList<>();

        deque.add(3);
        deque.add(6);


    }
}
