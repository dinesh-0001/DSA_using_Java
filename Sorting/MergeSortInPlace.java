import java.util.Arrays;

public class MergeSortInPlace {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        mergeSortInplace(arr, 0, arr.length);
        System.out.println(Arrays.toString(arr));
    }

    static void mergeSortInplace(int[] arr, int s, int e){
        if(e - s == 1){
            return;
        }

        int mid = (s+e) / 2;

        mergeSortInplace(arr, s,  mid);
        mergeSortInplace(arr, mid, e);

        merge(arr, s, mid, e);
    }
    static void merge(int[] arr, int s, int m, int e){
        int[] mix = new int[e - s];

        int i = s;
        int j = m;
        int k = 0;

        while(i < m && j < e){
            if(arr[i] < arr[j]){
                mix[k] = arr[i];
                i++;
            }else{
                mix[k] = arr[j];
                j++;
            }
            k++;
        }

        while(i < m){
            mix[k] = arr[i];
            i++;
            k++;
        }
        while(j < e){
            mix[k] = arr[j];
            j++;
            k++;
        }
        for(int l = 0; l<mix.length; l++){
            arr[s + l] = mix[l];
        }
    }
}

