package Recursion_Level_2;

public class StrToInt {
    public static void main(String[] args) {
        String s = "1234";
        int n = s.length();
        System.out.println(Int(s,n));
    }
    public static int Int(String s,int n){
        if(n==0){
            return 0;
        }
        int lastDigit = s.charAt(n - 1) - '0';
        return Int(s, n - 1) * 10 + lastDigit;
    }
}
