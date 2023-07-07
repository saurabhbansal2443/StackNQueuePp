import java.util.Stack;

public class nextGreaterElement {
    public static void main(String[] args) {
        
    }

    //Steps for this Question 

    //1) check 
    //2) pop
    //3) put 
    //4) push 


 public static long[] nextLargerElement(long[] arr, int n)
    { 
        long[] ans = new long[n];
        
        ans[n-1]=-1;
        
        Stack<Long> st = new Stack<>();
        st.push(arr[n-1]);
        
        for(int i=n-2 ;i>=0;i--){
            long  ele = arr[i];
            
            while(st.size()>0 && ele>=st.peek()){ // check 
                st.pop();                       // pop
            }
            
            //put 
            
            if(st.size()==0){
                ans[i]=-1;
            }else{
                ans[i]=st.peek();
            }
            // push 
            st.push(ele);
            
        }
        
        return ans ;
    }
}
