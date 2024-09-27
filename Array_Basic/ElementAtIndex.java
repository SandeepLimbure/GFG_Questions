package Array_Basic;

public class ElementAtIndex {
    public static void main(String[] args) {

    }
    public static int getByIndex(int arr[], int n, int i)
    {
        if(i>n){
            return -1;
        }
        return arr[i];
    }
}
