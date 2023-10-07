public class Nto1 {
    public static void main(String[] args) {
    int n = 5;
    fun(n);
    }

    static void fun(int n){
        if (n == 1){
            System.out.println(n);
            return;
        }
        System.out.println(n);
        fun(n-1);
        
    }
    static void funRev(int n){
        if (n == 1){
            System.out.println(n);
            return;
        }
        fun(n-1);
        System.out.println(n);
    }
}
