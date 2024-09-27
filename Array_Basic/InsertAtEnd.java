package Array_Basic;

public class InsertAtEnd {
    public static void main(String[] args) {

    }
    public void insertAtEnd(int arr[],int sizeOfArray,int element)
    {
        int cnt =0;
        for(int i =0;i<sizeOfArray;i++){
            cnt++;
        }
        arr[cnt-1]=element;
    }

}
