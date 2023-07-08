import java.util.Stack;

public class implementQueuePOPEfficient {
    public static void main(String[] args) {
        
    }
}

class MyQueue {

    Stack<Integer> main;
    Stack<Integer> helper;

    public MyQueue() {
        main = new Stack<>();
        helper = new Stack<>();
    }
    
    public void push(int x) {
       //1) main --> helper;
       while(main.size()!=0){
           helper.push(main.pop());
       }
       //2) x-->main
       main.push(x);
       // 3) helper --> main;

       while(helper.size()!=0){
           main.push(helper.pop());
       }
    }
    
    public int pop() {
        return main.pop();
    }
    
    public int peek() {
       return main.peek();
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
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
