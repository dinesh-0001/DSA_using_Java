//https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/description/
public class CountSteps {
    public static void main(String[] args) {
        int n = 14;
        int m = numberOfSteps(n);
        System.out.println(m);
    }
    static int count = 0;
    static int numberOfSteps(int num) {
       
        if(num == 0){
            return count;
        }
        if(num % 2 == 0){
            num = num / 2;
            count++;
        }
        else{
            num = num - 1;
            count++;
        }
        numberOfSteps(num);
        return count;

        
    }
}
