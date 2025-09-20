package algorithms.greedyAlogoProblem;

import java.util.Arrays;
import java.util.Comparator;

class Item{
    int value,weight;
    public Item(int value, int weight) {
        this.value = value;
        this.weight = weight;
    }
}

class itemCoparator implements Comparator<Item> {

    @Override
    public int compare(Item a, Item b) {
        double fractionA = (double)a.value / a.weight;
        double fractionB = (double)b.value / b.weight;

        if(fractionA < fractionB) return 1;
        else if(fractionA > fractionB) return -1;
        else return 0;
    }
}


public class KnapsackProblem {

    double fractionKnapSack(int W, Item[] arr, int n){
        Arrays.sort(arr, new itemCoparator());

        double totalValue = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i].weight <= W){
                totalValue += arr[i].value;
                W -= arr[i].weight;
            }else{
                double faction = (double)arr[i].value / arr[i].weight;
                totalValue += faction * W;
                break;
            }
        }
        return totalValue;
    }
}
