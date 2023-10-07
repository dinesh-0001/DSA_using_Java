import java.util.Arrays;

public class InsrtionSort{
    public static void main (String[] args){
        int[] arr = {3,54,23,5};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void insertionSort(int[] arr){
        for(int i=0; i<=arr.length-2; i++){
            for(int j=i+1; j>0; j--){
                if(arr[j]<arr[j-1]){
                    swap(arr, j-1, j);
                }
                else{
                    break;
                }
                }
            }
        }
    static void swap(int[] arr, int first, int second){
        int temp= arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
    }
    