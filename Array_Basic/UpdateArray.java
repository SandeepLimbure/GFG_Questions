package Array_Basic;

public class UpdateArray {
    public static void main(String[] args) {

    }
    public static void updateArray(int arr[], int index, int element)
    {
        int cnt=0;
        for(int i = 0;i<index;i++){
            cnt++;
        }
        arr[cnt]=element;
    }
}
