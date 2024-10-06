package Array_Basic;

public class PeakElement {
    public int peakElement(int[] arr,int n)
    {
        int min =0;
        for(int i =1;i<n;i++){
            if(arr[i]>arr[i-1]){
                min = i;
            }
        }
        return min;
    }
    public int peakElement1(int[] arr,int n)
    {
        int left = 0;
        int right = n-1;
        while(left<right){
            int mid = left+(right-left)/2;
            if(mid<n-1 && arr[mid]<arr[mid+1]) left = mid+1;
            else right = mid;
        }
        return left;
    }
}
