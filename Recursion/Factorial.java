package Recursion_Basic_Adv;

public class Factorial {
    public static void main(String[] args) {

    }
    static int factorial(int N)
    {
        if(N==1||N==0){
            return 1;
        }
        return N*factorial(N-1);
    }
}
