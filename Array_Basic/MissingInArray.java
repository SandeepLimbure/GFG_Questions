package Array_Basic;

public class MissingInArray {
    int missingNumber(int n, int arr[]) {
        int sum =0;
        for(int i =0;i<arr.length;i++){
            sum += arr[i];
        }
        return n*(n+1)/2 - sum;
    }
}
