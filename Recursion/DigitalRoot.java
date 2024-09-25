package Recursion_Basic_Adv;

public class DigitalRoot {
    static int sum = 0;
    public static int digitalRoot(int n)
    {
        if(n<10){
            return n;
        }
        int sum = 0;
        while(n>0){
            sum += n%10;
            n /= 10;
        }
        return digitalRoot(sum);
    }
}
