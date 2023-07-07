import java.util.ArrayDeque;
import java.util.Queue;

public class QueueToStackPOPEfficient {
    public static void main(String[] args) {

        QueToStack st = new QueToStack();

        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);

        st.pop();

        st.pop();

        System.out.println(st.peek());
    }
}

class QueToStack {
    Queue<Integer> main;
    Queue<Integer> helper;

    QueToStack() {
        this.main = new ArrayDeque<>();
        this.helper = new ArrayDeque<>();
    }

    public void push(int ele) {

        if (this.main.size() == 0) {
            this.main.add(ele);
        } else {

            // first step main --> helper

            while (this.main.size() != 0) {

                this.helper.add(this.main.remove());
            }

            // second step main --> ele

            main.add(ele);

            // third step helper --> main

            while (this.helper.size() != 0) {
                this.main.add(this.helper.remove());
            }
        }
    }

    public int pop() {
        return this.main.remove();
    }

    public int size() {
        return this.main.size();
    }

    public int peek() {
        return this.main.peek();
    }

}
