public class SubtractCount {
    public static void main(String[] args) {
       int n = 10;
       int m = 10;
       int ans = countOperations(n, m);
       System.out.println(ans); 
    }
    static int count = 0;
    static int countOperations(int num1, int num2) {
        if(num1 == num2){
            return count++;
            
        }
        if(num1 > num2){
            num1 = num1 - num2;
            count++;
        }
        else{
            num2 = num2 - num1;
            count++;
        }
        countOperations(num1, num2);
        return count;
    }
}
