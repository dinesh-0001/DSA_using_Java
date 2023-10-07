public class RBS {
    public static void main(String[] args) {
        int[] arr = {5, 1,2, 3, 4};
        int ans = rotatedSearch(arr, 2, 0, arr.length-1);
        System.out.println(ans);
    }

    static int rotatedSearch(int[] arr, int target, int s, int e){
        if(s > e){
            return -1;
        }
        int m = s + (e - s) / 2;
        if(arr[m] == target){
            return m;
        }
        if(arr[s] <= arr[m]){
            if(target >= arr[s] && target <= arr[m]){
                return rotatedSearch(arr, target, s, m-1);
            }
            else{
                return rotatedSearch(arr, target, m+1, e);
            }
        }
        if(target >= arr[m] && target <= arr[e]){
            return rotatedSearch(arr, target, m+1, e);
        }
        else{
            return rotatedSearch(arr, target, s, m-1);
        }
    }
}
