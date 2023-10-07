public class OrderAgnostic {
    public static void main(String[] args) {
        //creating a array
        int[] arr = {12, 8, 4, 3, 2, 1}; // will give descending order output
        //int[] arr = {1, 2, 4, 5, 8, 12}; //will give ascending order output
        int target = 12;
        int ans = orderAgnostic(arr, target);
        System.out.println(ans);
    }

static int orderAgnostic(int[] arr, int target){
    if(arr.length == 0){
        return -1;
    }
    int start = 0;
    int end = arr.length-1;

    // finding whether array is ascending order or descending order
    boolean isAsc = arr[start]<arr[end];
    
    while(start<=end){
        // find the middle element
        int mid = start + (end-start)/2;

        if(arr[mid] == target){
            return mid;
        }

        if(isAsc){
            if(target< arr[mid]){
                end = mid-1;
            } 
            else {
                start = mid+1;
            }
        }
        else{
            if(target> arr[mid]){
                 end = mid-1;
            } 
            else {
                start = mid+1;
            }   
        }
        
    }
    return -1;
}

}
