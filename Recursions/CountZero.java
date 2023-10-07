public class CountZero {
    public static void main(String[] args) {
        count(0);
        System.out.println(count);
    }
    static int count = 0;
    static void count(int n){
        if(n == 0){
            return;
        }
        int rem = n % 10;
        if(rem == 0){
            count++;
        }
        count(n/10);
    }
}
