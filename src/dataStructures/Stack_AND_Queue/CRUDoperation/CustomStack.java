package dataStructures.Stack_AND_Queue.CRUDoperation;

public class CustomStack {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;

    int top = -1;

    public CustomStack() {
        this(DEFAULT_SIZE); //this here work as constructor and give value to CustomStack(int size) function
    }

    public CustomStack(int size) {
        this.data = new int[size];
    }

    public void push(int item){
        if(isfull()){
            System.out.println("Stack is full");
            return;
        }
        top++;
        data[top] = item;
    }


    public int pop() throws StackException{
        if(isEmpty()){
            throw new StackException("Cannot pop from an empty stack");
        }
        return data[top--];
    }

    public int peek() throws StackException{
        if(isEmpty()){
            throw new StackException("Cannot peek from an empty stack");
        }
        return data[top];
    }

    public boolean isfull(){
        return top == data.length - 1;
    }

    public boolean isEmpty(){
        return top == -1;
    }

}
