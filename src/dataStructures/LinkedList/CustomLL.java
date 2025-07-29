package dataStructures.LinkedList;

public class CustomLL {

    private Node head ;
    private Node tail;
    private int size;

    public CustomLL() {
        this.size = 0;
    }

    private class Node{
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next){
            this.value = value;
            this.next = next;
        }
    }
    public void insertAtFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        head = node;
        if (tail == null) {
           tail = head;
        }
        size++;
    }

    public void insertAtLast(int val){

        if(tail == null) {
            insertAtFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size++;
    }

    public void insert(int val, int index){
        if(index == 0){
            insertAtFirst(val);
            return;
        }
        if(index == size){
            insertAtLast(val);
            return;
        }
        Node temp = head;
        for(int i = 1; i < index; i++){
            temp = temp.next;
        }

        Node newNode = new Node(val, temp.next);
        temp.next = newNode;
        size++;
    }

    public Node find(int value){
        Node node = head;
        while (node!=null){
            if(node.value == value){
                return node;
            }
            node = node.next;
        }
        return node;
    }

    public Node get(int index){
        Node node = head;
        for(int i = 0; i <index; i++){
            node = node.next;
        }
        return node;
    }

    public int deleteFirst(){
        int val = head.value;
        head = head.next;
        if(head == null){
            tail = null;
        }
        size--;
        return val;
    }

    public int deleteLast(){
        if(size <= 1){
            return deleteFirst();
        }

        Node secondLast = get(size - 2);
        int val = tail.value;

        tail = secondLast;
        tail.next = null;
        size--;
        return val;
    }

    public int delete(int index){
        if(index == 0) return deleteFirst();
        if(index == size - 1) return deleteLast();

        Node prev = get(index - 1);
        int val = prev.next.value;
        prev.next = prev.next.next;

        return val;
    }
    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("End");
    }


}
