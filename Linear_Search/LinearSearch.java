public class LinearSearch{
    public static void main(String[] args) {
        //creating a array
        int[] arr = {1, 5, 6, 234, 434, 347, 67};
        int target = 6;
        int ans = Linearseach(arr, target);
        System.out.println(ans);
    }
    //return the index of element
    static int Linearseach(int[] arr, int target){
        if(arr.length == 0){
            return -1;
        }
        for (int index =0; index<arr.length; index++){
            int element = arr[index];
            if(element == target){
                return index;
            }
        }
        return -1;
    }
    //return the boolean type true or false
    static boolean Linearseach2(int[] arr, int target){
        if(arr.length == 0){
            return false;
        }
        for (int index =0; index<arr.length; index++){
            int element = arr[index];
            if(element == target){
                return true;
            }
        }
        return false;
    }
}