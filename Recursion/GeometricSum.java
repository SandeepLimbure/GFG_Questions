package Recursion_Level_2;

public class GeometricSum {
    private static double sum = 0;
    public static void main(String[] args) {
       double n = 5;
       double sum = sum(n);
        System.out.println(sum);
    }
    public static double sum(double n){
        if(n==0){
            return 1;
        }
        double ans = 1/Math.pow(3,n)+sum(n-1);
        return ans;
    }
}
