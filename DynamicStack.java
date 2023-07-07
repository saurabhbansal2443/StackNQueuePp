public class DynamicStack {
    public static void main(String[] args) {
        MyStack2 st = new MyStack2();

        st.push(1);
        st.push(2);
        st.push(3);
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(1);
        st.push(2);
        st.push(3);

        System.out.println(st.size());

    }
}

class MyStack2 {

    int[] arr;
    int tos;

    MyStack2(int n) {
        this.arr = new int[n];
        this.tos = -1;
    }

    MyStack2() {
        this.arr = new int[10];
        this.tos = -1;
    }

    public void push(int ele) {

        if (this.tos == this.arr.length - 1) {
            int[] narr = new int[arr.length * 2];
            for (int i = 0; i <= tos; i++) {
                narr[i] = arr[i];
            }
            this.arr = narr;

            tos++;
            arr[tos] = ele;

        } else {
            tos++;
            arr[tos] = ele;
        }
    }

    public int pop() {

        if (this.tos == -1) {
            System.out.println("Stack is empty");
            return -1;
        } else {
            int ele = arr[this.tos];
            this.tos--;
            return ele;
        }
    }

    public int size() {
        return tos + 1;
    }

    public int peek() {
        if (this.tos == -1) {
            System.out.println("Stack is empty");
            return -1;
        } else {
            int ele = arr[this.tos];
            return ele;
        }
    }

    public void display() {
        for (int i = 0; i <= tos; i++) {
            System.out.print(arr[i] + "  ");
        }
        System.out.println();
    }
}
