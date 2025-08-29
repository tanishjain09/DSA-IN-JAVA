package dataStructures.Heap;
import java.util.ArrayList;

public class Heap<T extends Comparable<T>> {
    private ArrayList<T> list;
    public Heap(){
        list = new ArrayList<>();
    }
    private void swap(int first, int second){
        T temp = list.get(first);
        list.set(first, list.get(second));
        list.set(second, temp);
    }

    private int parent(int index){
        return (index - 1) / 2; //for zero based
    }
    private int left(int index){
        return index * 2 + 1; //for zero based
    }
    private int right(int index){
        return index * 2 + 2; //for zero based
    }

    public void insert(T value){
        list.add(value);
        //as we know in theory learned will go form bottom to up i.e. up heap
        upheap(list.size()-1);
    }
    private void upheap(int index){
        if(index == 0) return;
        int p = parent(index);
        if(list.get(index).compareTo(list.get(p)) < 0){
            //if(item at this index is smaller than parent than swap)
            swap(index, p);
            upheap(p);
        }
    }
    public T remove() throws Exception{
        if(list.isEmpty()) throw new Exception("Removing from an empty heap");

        T temp = list.get(0);

        T last = list.remove(list.size() - 1);
        //now add this last item to first place in the heap
        if(!list.isEmpty()){
            list.set(0, last);
            downheap(0); //now check from top to bottom is the placed position is correct or not
        }
        return temp;
    }
    private void downheap(int index){

        int min = index; //imagine the current at you are rn is min;
        int left = left(index);
        int right = right(index);
        if(left < list.size() && list.get(min).compareTo(list.get(left)) > 0){
            min = left;
        }
        if(right < list.size() && list.get(min).compareTo(list.get(right)) > 0){
            min = right;
        }
        if(min != index){
            swap(min, index);
            downheap(min);
        }
    }
    public ArrayList<T> heapSort() throws Exception{
        ArrayList<T> data = new ArrayList<>();

        while (!list.isEmpty()){
            data.add(this.remove());
        }
        return data;
    }
}
