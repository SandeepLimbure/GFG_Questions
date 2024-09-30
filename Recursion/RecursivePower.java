package Recursion_Basic_Adv;

public class RecursivePower {
    public static void main(String[] args) {

    }
    static int RecursivePower(int n,int p)
    {
        if(p==0){
            return 1;
        }
        if(p==1){
            return n;
        }
        if(p%2==0){
            int halfPower = RecursivePower(n,p/2);
            return halfPower*halfPower;
        }else{
            return n*RecursivePower(n,p-1);
        }
    }
}
