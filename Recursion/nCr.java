package Recursion_Level_2;

public class nCr {
    public static void main(String[] args) {
        int n = 10;
        int r =5;
        int combination = nCr(n,r);
        System.out.println(combination);
    }
    public static int nCr(int n,int r){
        if(n<r){
            return 0;
        }
        if(r==0 || n==1){
            return 1;
        }
        if(r==1){
            return n;
        }
        return nCr(n-1,r-1)+nCr(n-1,r);
    }
}
