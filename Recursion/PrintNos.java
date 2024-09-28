package Recursion_Basic_Adv;

public class PrintNos {
    public static void main(String[] args) {

    }
    public void printNos(int N)
    {
        if(N==0){
            return;
        }
        printNos(N-1);
        System.out.print(N+" ");
    }
}
