import java.util.LinkedList;
import java.util.Queue;

public class StacktoQueuePushEfficient {
    public static void main(String[] args) {
        
    }
}

class MyStack {
    Queue<Integer> main;
    Queue<Integer> helper;

    public MyStack() {
        main = new LinkedList<>();
        helper = new LinkedList<>();
    }
    
    public void push(int x) {
        main.add(x);
    }
    
    public int pop() {

        // 1) removing from main and adding to helper  
        while(main.size()>1){
            helper.add(main.remove());
        }

        //2) remove last element from main 

        int ele = main.remove();

        // 3) removing from helper and adding to main 

        while(helper.size()!=0){
            main.add(helper.remove());
        }

        return ele;
    }
    
    public int top() {
        // 1) removing from main and adding to helper  
        while(main.size()>1){
            helper.add(main.remove());
        }

        //2) remove last element from main 

        int ele = main.remove();

        // 3) adding last element to helper
        helper.add(ele);  

        // 4) removing from helper and adding to main 

        while(helper.size()!=0){
            main.add(helper.remove());
        }

        return ele;
    }
    
    public boolean empty() {
        
        if(main.size()==0){
            return true;
        }else{
            return false;
        }
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */
