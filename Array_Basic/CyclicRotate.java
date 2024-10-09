package Array_Basic;

public class CyclicRotate {
    public void rotate(int[] arr) {
        int n = arr.length-1;
        int temp = arr[n];
        for(int i =n;i>=1;i--){
            arr[i]=arr[i-1];
        }
        arr[0]=temp;
    }
}
