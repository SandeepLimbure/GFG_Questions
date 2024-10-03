package Array_Basic;

import java.util.ArrayList;

public class Sort012 {
    public void sort012(ArrayList<Integer> arr) {
        int low = 0;
        int mid =0;
        int high = arr.size()-1;
        while(mid<=high){
            if(arr.get(mid)==0){
                swap(arr,low,mid);
                low++;
                mid++;
            }else if(arr.get(mid)==1){
                mid++;
            }else{
                swap(arr,mid,high);
                high--;
            }
        }
    }
    static void swap(ArrayList<Integer> arr, int i, int j){
        int temp = arr.get(i);
        arr.set(i,arr.get(j));
        arr.set(j,temp);
    }
}
