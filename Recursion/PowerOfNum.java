package Recursion_Basic_Adv;

public class PowerOfNum {
    static long mod = (long)Math.pow(10,9)+7;
    static long P = 1;
    static long half =1;
    long power(int N,int R)
    {
        if(R==0)return 1;
        if(R==1)return N;

        half = power(N,R/2);
        half = (half*half)%mod;
        if(R%2 == 0){
            return half;
        }else{
            return (N*half)%mod;
        }
    }
}
