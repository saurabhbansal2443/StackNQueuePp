import java.util.ArrayDeque;
import java.util.Queue;

public class QueueBasics {
    public static void main(String[] args) {
        Queue<Integer> que = new ArrayDeque<>();

        que.add(10);
        que.add(20);

        System.out.println(que);

       
        System.out.println(que.remove());

         System.out.println(que.peek());

         System.out.println(que);


    }
}
