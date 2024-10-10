package Recursion_Level_2;

public class Product {
    public static void main(String[] args) {
        int x = 5;
        int y =10000;
        int product = product(x,y);
        System.out.println(product);
    }
    public static int product(int x,int y){
        if(y==0 || x==0){
            return 0;
        }
        return x+product(x,y-1);
    }
}
