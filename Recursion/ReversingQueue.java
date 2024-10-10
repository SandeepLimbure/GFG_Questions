package Recursion_Level_2;

import java.util.LinkedList;
import java.util.Queue;

public class ReversingQueue {
    static Queue<Integer> queue;
    public static void main(String[] args) {
        queue = new LinkedList<Integer>();
        queue.add(5);
        queue.add(24);
        queue.add(9);
        queue.add(6);
        queue.add(8);
        queue.add(4);
        queue.add(1);
        queue.add(8);
        queue.add(3);
        queue.add(6);
        queue = reverse(queue);
        while (!queue.isEmpty())
        {
            System.out.print(queue.peek() + " ");
            queue.remove();
        }
    }
    public static Queue<Integer> reverse(Queue<Integer> queue){
        if(queue.isEmpty()){
            return queue;
        }
        int data = queue.peek();
        queue.remove();
        queue = reverse(queue);
        queue.add(data);
        return queue;
    }
}
