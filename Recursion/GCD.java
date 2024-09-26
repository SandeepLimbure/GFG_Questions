package Recursion_Basic_Adv;

public class GCD {
    public static int GCD(int a, int b)
    {
        if(a==b||b%a==0)return a;
        return GCD(b%a,a);
    }
}
