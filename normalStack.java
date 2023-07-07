public class normalStack {
    public static void main(String[] args) {
        MyStack st = new MyStack(3);

        st.push(1);
        st.push(2);
        st.push(3);

        st.display();

        //st.push(4);

        st.pop();
          st.display();
        st.pop();
          st.display();
        st.pop();
          st.display();

            st.pop();




    }
}

class MyStack {

    int[] arr;
    int tos;

    MyStack(int n) {
        this.arr = new int[n];
        this.tos = -1;
    }

    public void push(int ele) {

        if (this.tos == this.arr.length - 1) {
            System.out.println("Stack is full");
            return;
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

    public int size(){
        return tos+1;
    }

    public int peek(){
      if (this.tos == -1) {
            System.out.println("Stack is empty");
            return -1;
        } else {
            int ele = arr[this.tos];
            return ele;
        }  
    }

    public void display(){
        for(int i=0;i<=tos;i++){
            System.out.print(arr[i] + "  ");
        } 
        System.out.println();  
     }
}
