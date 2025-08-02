package dataStructures.Queue.CRUDoperation;

public class QueueMain {
    public static void main(String[] args) throws Exception{
        CustomQueue queue = new CustomQueue();

        queue.insert(8);
        queue.insert(19);
        queue.insert(121);

//        queue.display();
//        System.out.println(queue.remove());
//        queue.display();


        CircularQueue queue1 = new CircularQueue();
        queue1.insert(3);
        queue1.insert(6);
        queue1.insert(5);
        queue1.insert(19);
        queue1.insert(1);

        queue1.display();

        System.out.println(queue1.remove());
        queue1.insert(121);
        queue1.display();

//        System.out.println(queue1.remove());
    }
}
