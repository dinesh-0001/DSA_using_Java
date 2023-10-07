// Searching element in given range

import java.util.Scanner;

public class RangeLinearSearch {
    public static void main(String[] args) {
        //creating a array
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the Size of array:");
        int n = in.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the "+ n+" element of array:");
        for(int i =0; i<n;i++){
            arr[i]=in.nextInt();
        }
        System.out.print("Enter the element to find in array");
        int target = in.nextInt();
        System.out.print("Enter the Starting index to find element:");
        int start =in.nextInt();
        System.out.print("Enter the Ending index to find element:");
        int end =in.nextInt();

        int ans = RangeLinearsearch(arr, target, start, end);
        if(ans==-1){
            System.out.println("Error in inputing values! Please try again");
        }
        else if(ans == -2){
            System.out.println("Element not found In Array(Given Range)");
        }
        else{

            System.out.println(ans);

        }
        
        in.close();

        
    }
    // Return the index or -1
    static int RangeLinearsearch(int[] arr, int target, int start, int end){
        if(arr.length == 0){
            return -1;
        }
        if(end>arr.length-1){
            return -1;
        }

        for(int i =start; i<=end; i++){
            int element = arr[i];
            if(element == target){
                return i;
            }
        }
        return -2;
    
    }
}