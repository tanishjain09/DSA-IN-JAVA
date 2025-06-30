package algorithms.searching.linear;

//If the second largest element does not exist, return -1.

//first approach is to sort the array and and get second largest in array other approaches are:
public class SecondLargestInArray {
    public static void main(String[] args) {
        int[] arr = {12, 35, 1, 10, 34, 1};
        System.out.println(getSecondLargest1(arr));
        System.out.println(getSecondLargest2(arr));
    }
    static int getSecondLargest1(int[] arr){  //better approach - two pass search

        //make larget and secondLargest as -1 both
        int largest = -1;
        int secondLargest = -1;

        //first find the largest
        for(int i = 0; i<arr.length; i++){
            if(arr[i] > largest){
                largest = arr[i];
            }
        }
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > secondLargest && arr[i] != largest){
                secondLargest = arr[i];
            }
        }
        return secondLargest;
    }

    static int getSecondLargest2(int[] arr){  //expected approach - one pass search

        int largest = -1, secondLargest = -1;

        for(int i = 0; i < arr.length; i++){

            if(arr[i] > largest){
                secondLargest = largest;
                largest = arr[i];
            }

            if(arr[i] < largest && arr[i] > secondLargest){
                secondLargest = arr[i];
            }
        }
        return secondLargest;
    }
}
