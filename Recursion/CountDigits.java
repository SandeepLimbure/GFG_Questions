package Recursion_Basic_Adv;

public class CountDigits {
    public static void main(String[] args) {

    }
    public static int countDigits(int n) {
        if(n>-10 && n<10){
            return 1;
        }else{
            return countDigits(n/10)+1;
        }
    }
}
