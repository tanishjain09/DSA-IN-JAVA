package dataStructures.Queue.CRUDoperation;

public class QueueMain {
    public static void main(String[] args) throws Exception{
        CustomQueue queue = new CustomQueue();

        queue.insert(8);
        queue.insert(19);
        queue.insert(121);

        queue.display();
        System.out.println(queue.remove());
        queue.display();
    }
}
