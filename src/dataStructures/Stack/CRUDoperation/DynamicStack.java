package dataStructures.Stack.CRUDoperation;

public class DynamicStack extends CustomStack{
    public DynamicStack() {
        super(); //it will call CustomStack()
    }

    public DynamicStack(int size){
        super(size); //it will call CustomStack(int size)
    }

    @Override
    public void push(int item) {
        //this take care of it begin full
        if(this.isfull()){
            int[] temp = new int[data.length * 2];
            for(int i = 0; i < data.length; i++){
                temp[i] = data[i];
            }
            data = temp;
        }

        //at this point we know that array can not full
        super.push(item);
    }
}
