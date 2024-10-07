package Array_Basic;

import java.util.Arrays;

public class Mean_Median {
    public static void main(String[] args) {

    }
    public int median(int A[],int N)
    {

        Arrays.sort(A);
        int left =0;
        int  right = N-1;
        int mid = left+(right-left)/2;
        return A[mid];
    }
    //Function to find median of the array elements.
    public int mean(int A[],int N)
    {
        int sum =0;
        for(int i =0;i<N;i++){
            sum += A[i];
        }
        int mean = sum/N;
        return mean;
    }
}
