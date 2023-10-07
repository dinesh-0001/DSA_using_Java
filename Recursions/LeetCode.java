import java.util.Arrays;
//https://leetcode.com/problems/flipping-an-image/description/
public class LeetCode {
    public static void main(String[] args) {
        int[][] image = {{1,1,0},{1,0,1},{0,0,0}};
        int[][] ans = flipAndInvertImage(image);
        System.out.println(Arrays.deepToString(ans));

    }
    
    static int[][] flipAndInvertImage(int[][] image) {
        for(int[] n:image){
            for(int i = 0; i < (image[0].length + 1) / 2; i++){
                int temp = n[i] ^ 1;
                n[i] = n[image[0].length - i - 1] ^ 1;
                n[image[0].length - i - 1] = temp;
            }
        }
        return image;
    }
    
}
