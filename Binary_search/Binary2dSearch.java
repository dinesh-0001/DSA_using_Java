//have to learn again
public class Binary2dSearch {
    public static void main(String[] args) {
        
    }

    static int[] binarySearch(int[][] arr, int row, int cStart, int cEnd, int target){
       

        while(cStart<cEnd){
            int mid = cStart + (cEnd-cStart)/2;

            if(target<arr[row][mid]){
                cEnd = mid-1;
            }else if(target>arr[row][mid]){
                cStart = mid+1;
            }else{
                return new int[]{row, mid};
            }
        }return new int[]{-1, -1};
    }

    static int[] search(int[][] arr, int target){
        int r = arr.length;
        int c = arr[0].length;

        if(r == 1){
            return binarySearch(arr, 0, 0, c-1, target);
        }

        int rStart = 0;
        int rEnd = r-1;
        int cMid = c/2;

        while(rStart<(rEnd-1)){
            int mid = rStart + (rEnd - rStart)/2;
            if(arr[mid][cMid] == target){
                return new int[]{mid, cMid};
            }
            if(arr[mid][cMid] < target){
                rStart = mid;
            }else{
                rEnd = mid;
            }
        }
        if(arr[rStart][cMid]==target){
            return new int[]{rStart,cMid};
        }
        if(arr[rStart+1][cMid]==target){
            return new int[]{rStart+1,cMid};
        }
    }
}
