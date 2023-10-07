import java.util.ArrayList;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {1,34,23, 23, 21,35};
        int target = 23;
        System.out.println(Check(arr, target, 0));
        System.out.println(FindIndex(arr, target, 0));
        System.out.println(FindLastIndex(arr, target, arr.length-1));
        FindAllIndex(arr, target, 0);
        System.out.println(list);
        System.out.println(FindAlIndex(arr, target, 0, new ArrayList<>()));
        System.out.println(FindAlIndex1(arr, target, 0));
    }
    //Returning true or false
    static boolean Check(int[] arr, int target, int index){
        if(index == arr.length){
            return false;
        }
        return arr[index]==target || Check(arr, target, index+1);
    }
    // Return the Index
    static int FindIndex(int[] arr, int target, int index){
        if(index == arr.length){
            return -1;
        }
        if(arr[index] == target){
            return index;
        }
        return FindIndex(arr, target, index + 1);
    }
    //Return Index from Last
    static int FindLastIndex(int[] arr, int target, int index){
        if(index == -1){
            return -1;
        }
        if(arr[index] == target){
            return index;
        }
        else{
            return FindLastIndex(arr, target, index - 1);
        }
        
    }
    //Return all the index of the target element
    static ArrayList<Integer> list = new ArrayList<>();
    static void FindAllIndex(int[] arr, int target, int index){
        if(index == arr.length){
            return;
        }
        if(arr[index] == target){
            list.add(index);
        }
        FindAllIndex(arr, target, index+1);
    }
    //Another way of doing above
    static ArrayList<Integer> FindAlIndex(int[] arr, int target, int index, ArrayList<Integer> list){
        if(index == arr.length){
            return list;
        }
        if(arr[index] == target){
            list.add(index);
        }
        return FindAlIndex(arr, target, index+1, list);

    }
    //Another way of doing above
    static ArrayList<Integer> FindAlIndex1(int[] arr, int target, int index){
        ArrayList<Integer> list = new ArrayList<>();
        if(index == arr.length){
            return list;
        }
        if(arr[index] == target){
            list.add(index);
        }
        ArrayList<Integer> ansfromBelowCalls = FindAlIndex1(arr, target, index+1);

        list.addAll(ansfromBelowCalls);

        return list;

    }
}
