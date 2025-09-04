package dataStructures.Stack_AND_Queue.CRUDoperation;

public class StackMain {
    public static void main(String[] args) throws StackException{
        CustomStack stack = new CustomStack();

        stack.push(4);
        stack.push(4);
        stack.push(4);
        stack.push(4);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        DynamicStack ds = new DynamicStack();

        ds.push(12);
        ds.push(12);
        ds.push(12);
        ds.push(12);
        ds.push(12);
        ds.push(12);
        ds.push(12);
        ds.push(12);
        ds.push(12);
        ds.push(12);
        ds.push(12);
        ds.push(12);
        ds.push(12);
        ds.push(12);
        ds.push(12);
        ds.push(12);
    }
}
