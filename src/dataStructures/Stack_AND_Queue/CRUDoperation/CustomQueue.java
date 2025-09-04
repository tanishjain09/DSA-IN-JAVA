package dataStructures.Stack_AND_Queue.CRUDoperation;

public class CustomQueue {
    protected int[] data;
    private static final int DEFAULT_SIZE = 5;

    int end = 0;

    public CustomQueue() {
        this(DEFAULT_SIZE); //this here work as constructor and give value to CustomStack(int size) function
    }

    public CustomQueue(int size) {
        this.data = new int[size];
    }

    public boolean isfull(){
        return end == data.length - 1;
    }

    public boolean isEmpty(){
        return end == -1;
    }

    public boolean insert(int item){
        if(isfull()){
            return false;
        }
        data[end++] = item;
        return true;
    }

    public int remove() throws Exception{
        if(isEmpty()){
            throw new Exception("Queue is empty");
        }
        int removed = data[0];

        //remove the elements to left
        for(int i = 1; i < end; i++){
            data[i-1] = data[i];
        }
        end--;
        return removed;
    }

    public int front() throws Exception{
        if(isEmpty()){
            throw new Exception("Queue is empty");
        }
        return data[0];
    }

    public void display(){
        for(int i = 0; i < end; i++){
            System.out.print(data[i] + " <- ");
        }
        System.out.println("END");
    }

}
