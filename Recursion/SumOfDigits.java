package Recursion_Basic_Adv;

public class SumOfDigits {
    public static void main(String[] args) {

    }
    public static int sumOfDigits(int n)
    {
        if(n==0){
            return 0;
        }
        return sumOfDigits(n/10)+n%10;
    }
}
