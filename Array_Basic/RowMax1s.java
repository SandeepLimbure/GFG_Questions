package Array_Basic;

public class RowMax1s {
    public int rowWithMax1s(int arr[][]) {
        if(arr==null || arr.length==0){
            return 0;
        }
        int row =-1;
        int i =0 , j=arr[0].length-1;
        while(i<=arr.length-1 && j>=0){
            if(arr[i][j]==1){
                j--;
                row=i;
            }
            else{
                i++;
            }
        }
        return row;
    }
}
