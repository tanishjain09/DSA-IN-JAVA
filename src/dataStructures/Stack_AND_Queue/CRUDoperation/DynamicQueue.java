package dataStructures.Stack_AND_Queue.CRUDoperation;

public class DynamicQueue extends CircularQueue{
    public DynamicQueue() {
        super();
    }

    public DynamicQueue(int size) {
        super(size);
    }

    //revision for this
    @Override
    public boolean insert(int item) {
        if (this.isfull()){
            int[] temp = new int[data.length];

            for(int i = 0; i < data.length; i++){
                temp[i] = data[(front+i) % data.length];
            }
            front = 0;
            end = data.length;
            data = temp;
        }

        return super.insert(item);
    }
}
