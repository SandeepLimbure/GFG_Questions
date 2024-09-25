package Recursion_Basic_Adv;

public class CheckPalindrome {
    private static int reverseNum = 0;
    static boolean isPalin(int N)
    {
        reverseNum = 0;
        return checker(N,N);

    }
    static boolean checker(int n,int curr){
        if(curr==0){
            return n == reverseNum;
        }
        reverseNum = reverseNum*10 + curr%10;
        return checker(n,curr/10);
    }
}
