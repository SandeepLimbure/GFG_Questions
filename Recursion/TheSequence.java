package Recursion_Basic_Adv;

public class TheSequence {
    public static void main(String[] args) {

    }
    public static int theSequence(int N)
    {
        if(N==0){
            return 1;
        }
        return N+N*theSequence(N-1);
    }
}
