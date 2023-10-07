public class CeilingNumber {
    public static void main(String[] args) {
        int[] arr = {1, 5, 6, 234, 434};
        int target = 66;
        int ans = Ceiling(arr, target);
        System.out.println(ans);
    }

    static int Ceiling(int [] arr, int target){

        // if target is greater then the greatest element of an array
        if(target< arr[arr.length-1]){
            return -1;
        }

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
        return start;
    
    }
}
