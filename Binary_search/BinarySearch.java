public class BinarySearch {
    public static void main(String[] args) {
        //creating a array
        int[] arr = {1, 5, 6, 234, 434};
        int target = 66;
        int ans = Binarysearch(arr, target);
        System.out.println(ans);
    }

static int Binarysearch(int[] arr, int target){
    if(arr.length == 0){
        return -1;
    }
    int start = 0;
    int end = arr.length-1;

    while(start<=end){
        // find the middle element
        int mid = start + (end-start)/2;

        if(target< arr[mid]){
            end = mid-1;
        } else if(target> arr[mid]){
            start = mid+1;
        }
        else{
            return mid;
        }
        
    }
    return -1;
}
}
    
