import java.util.Arrays;

public class SelectionSort{
    public static void main(String[] args) {
        int[] arr = {2,1,4,3,5};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    // In this function we are sorting the array using selection sort algorithm  
    static void selectionSort(int[] arr){
        for (int i = 0; i<arr.length; i++){
            int last = arr.length -i -1;
            int maxIndex = getMaxIndex(arr, 0, last);
            swap(arr, maxIndex, last);
        }
    }
    //In this function we are finding the greatest value index and returning value to selectionSort function
    static int getMaxIndex(int[] arr, int start, int end){
        int max = start;
        for(int i = start; i<=end; i++){
            if(arr[max]<arr[i]){
                max = i;
            }

        }
        return max;
    }
    //Basic Swapping Function, in which two values of array is swapped
    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}


