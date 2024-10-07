package Array_Basic;

public class MajorityWins {
    public static void main(String[] args) {

    }
    public int majorityWins(int arr[], int n, int x, int y) {
        int cnt1 =0 ;
        int cnt2 =0;
        for(int i =0;i<n;i++){
            if(arr[i]==x){
                cnt1++;
            }else if(arr[i]==y){
                cnt2++;
            }
        }
        if(cnt1>cnt2){
            return x;
        }
        else if(cnt1==cnt2){
            return Math.min(x,y);
        }
        else{
            return y;
        }
    }
}
