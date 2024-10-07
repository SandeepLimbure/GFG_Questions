package Array_Basic;

public class Min_Max {
    public static void main(String[] args) {

    }
    public static int maximumElement(int arr[],int n)
    {
        int min = Integer.MIN_VALUE;
        for(int i =0;i<n;i++){
            min = Math.max(arr[i],min);
        }
        return min;
    }

    public static int minimumElement(int arr[],int n)
    {
        int max = Integer.MAX_VALUE;
        for(int i =0;i<n;i++){
            max = Math.min(arr[i],max);
        }
        return max;
    }
}
