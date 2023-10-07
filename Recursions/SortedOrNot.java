public class SortedOrNot {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,11};
        System.out.println(Check(arr, 0));
    }

    static boolean Check(int[] arr, int index){
        if(index == arr.length -1 ){
            return true;
        }
        if(arr[0]<arr[arr.length-1]){
            // for checking ascending
            return arr[index] < arr[index + 1] && Check(arr, index+1);
        }
        //for checking descending
        return arr[index] > arr[index + 1] && Check(arr, index+1);
    }
}
