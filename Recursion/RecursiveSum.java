package Recursion_Basic_Adv;

public class RecursiveSum {
    public static void main(String[] args) {

    }
    public static int recursiveSum(int N)
    {
        if(N==1){
            return 1;
        }
        if(N==0){
            return 0;
        }
        return N + recursiveSum(N-1);
    }
}
