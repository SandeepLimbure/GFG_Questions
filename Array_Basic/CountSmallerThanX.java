package Array_Basic;

public class CountSmallerThanX {
    public static void main(String[] args) {

    }
    public static int smallerThanX(int arr[], int n, int x)
    {
        int cnt =0;
        for(int i =0;i<n;i++){
            if(arr[i]<x){
                cnt++;
            }
        }
        return cnt;
    }
}
