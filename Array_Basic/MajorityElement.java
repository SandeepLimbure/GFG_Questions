package Array_Basic;

import java.util.Arrays;

public class MajorityElement {
    static int majorityElement(int arr[]) {
        Arrays.sort(arr);
        int cnt = 1;
        int n = arr.length;
        if(n==1){
            return arr[n-1];
        }
        for(int i =1;i<arr.length;i++) {
            if (arr[i] == arr[i - 1]) {
                cnt++;
            } else {
                cnt = 1;
            }
            if (cnt > n / 2) {
                return arr[i];
            }
        }
        return -1;
    }
}
