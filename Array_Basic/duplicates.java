package Array_Basic;
import java.util.ArrayList;
import java.util.Arrays;

public class duplicates {
    public static ArrayList<Integer> duplicates(int[] arr) {
        Arrays.sort(arr);
        ArrayList<Integer> res = new ArrayList<>();
        for(int i =0;i<arr.length-1;i++){
            if(arr[i]==arr[i+1]){
                if (res.isEmpty() || res.get(res.size() - 1) != arr[i]) {
                    res.add(arr[i]);
                }
            }
        }
        if(res.isEmpty()){
            res.add(-1);
        }
        return res;
    }
}
