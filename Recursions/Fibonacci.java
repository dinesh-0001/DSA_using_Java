import java.util.Scanner;

public class Fibonacci{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number for fibonacci");
        int n = sc.nextInt();
        for (int i = 0; i <= n; i++) {
            System.out.println("Fibonacci Number of "+ i+ " is "+fibonacci(i));}
        sc.close();

    }
    static int fibonacci(int n){
        if(n<2){
            return n;
        }
        return fibonacci(n-1)+fibonacci(n-2);
    }
}