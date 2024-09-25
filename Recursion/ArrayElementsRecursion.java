package Recursion_Basic_Adv;

public class ArrayElementsRecursion {
    public static void printArrayRecursively(int []arr, int n)
    {
        if(n==0)return ;
        printArrayRecursively(arr,n-1);
        System.out.print(STR."\{arr[n - 1]} ");
    }
}
