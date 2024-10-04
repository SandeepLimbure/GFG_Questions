package Array_Basic;

public class RotateArray {
    public static void main(String[] args) {

    }
    static void rotateArr(int arr[], int d) {
        int n = arr.length;
        d = d%n;
        inplace(arr,0,n-1);
        inplace(arr,0,n-d-1);
        inplace(arr,n-d,n-1);
    }
    static void inplace(int []arr,int left,int right){
        while(left<right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right]= temp;
            left++;
            right--;
        }
    }
}
