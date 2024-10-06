package Array_Basic;

public class NegElementsEnd {
    public void segregateElements(int[] arr) {
        int []res = new int[arr.length];
        int posIndex = 0;
        for(int i =0;i<arr.length;i++){
            if(arr[i]>=0){
                res[posIndex++]=arr[i];
            }
        }
        for(int i =0;i<arr.length;i++){
            if(arr[i]<0){
                res[posIndex++]=arr[i];
            }
        }
        System.arraycopy(res,0,arr,0,arr.length);
    }
}
