package Array_Basic;

import java.util.Arrays;

public class SortArray {
    public static void main(String[] args) {
        int []arr = {5,3,1,10,6,9};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void sort(int []arr){
        for(int i =0;i<arr.length;i++){
            for(int j =i+1;j< arr.length;j++){
                if(arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
    }
}
