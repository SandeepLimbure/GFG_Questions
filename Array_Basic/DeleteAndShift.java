package Array_Basic;

public class DeleteAndShift {
    public static void main(String[] args) {

    }
    public static void deleteFromArray(int arr[], int n, int index)
    {

        for(int i =index+1;i<n;i++){
            arr[i-1]=arr[i];
        }
        arr[n-1]=0;
    }
}
