package Recursion_Basic_Adv;

public class TowerOfHanoi {
    public static void main(String[] args) {

    }
    public long toh(int n, int from, int to, int aux) {
        if(n==0){
            return 0;
        }
        long cnt = toh(n-1,from,aux,to);
        System.out.println("move disk " + n + " from rod " + from + " to rod " + to);
        cnt++;
        cnt += toh(n-1,aux,to,from);
        return cnt;
    }
}
