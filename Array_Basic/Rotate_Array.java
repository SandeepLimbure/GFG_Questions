package Array_Basic;

public class Rotate_Array {
    public static void main(String[] args) {

    }
    public static void reverseArray(int arr[], int n) {
        int left = 0;
        int right= n-1;
        while(left<right){
            int temp = arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
        }
    }
}
