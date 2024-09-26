package Recursion_Basic_Adv;

public class fibonacci {
    public static void main(String[] args) {

    }
    static int fibonacci(int n)
    {
        if(n==1||n==0){
            return n;
        }
        return fibonacci(n-1)+fibonacci(n-2);
    }
}
