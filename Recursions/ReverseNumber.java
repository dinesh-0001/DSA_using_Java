public class ReverseNumber {
    public static void main(String[] args) {
        // Rev(1234);
        // System.out.println(sum);

        int ans = Rev1(2345);
        System.out.println(ans);
    }
    static int sum = 0;
    static void Rev(int n){
        if(n == 0){
            return;
        }
        int rem = n % 10;
        sum = sum * 10 + rem;
        Rev(n/10);
    }

    static int Rev1(int n){
        int digit = (int)(Math.log10(n)) + 1;
        return helper(n, digit);
    }
    static int helper(int n, int digit){
        if(n % 10 == n){
            return n;
        }
        int rem = n % 10;
        return rem * (int)(Math.pow(10, digit-1)) + helper(n/10, digit-1);
    }
}
