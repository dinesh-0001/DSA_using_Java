import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {-2,1,4,2,6,2,3};
        insertionSort(arr);
        System.out.println(arr.length);
        System.out.println(Arrays.toString(arr));
    }
    static void insertionSort(int[] arr){
        for(int i = 0; i<=arr.length-2; i++){
            for (int j = i+1; j>0; j-- ){
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
        int temp = arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}
