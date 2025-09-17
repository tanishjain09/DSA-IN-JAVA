package dataStructures.Stack_AND_Queue.CRUDoperation;

public class CustomStack<T> {
    protected T[] data;
    private static final int DEFAULT_SIZE = 10;

    int top = -1;

    @SuppressWarnings("unchecked")
    public CustomStack() {
        this.data = (T[]) new Object[DEFAULT_SIZE];
    }

    @SuppressWarnings("unchecked")
    public CustomStack(int size) {
        this.data = (T[]) new Object[size];
    }

    public void push(T item){
        if(isfull()){
            System.out.println("Stack is full");
            return;
        }
        top++;
        data[top] = item;
    }


    public T pop() throws StackException{
        if(isEmpty()){
            throw new StackException("Cannot pop from an empty stack");
        }
        return data[top--];
    }

    public T peek() throws StackException{
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
