import java.util.Stack;

class Solution
{
    //Function to calculate the span of stockâ€™s price for all n days.
    public static int[] calculateSpan(int price[], int n)
    {
        int[] ans = new int[n];
        
        ans[0]=1;
        
        Stack<Pair> st = new Stack<>();
        
        Pair p = new Pair(price[0],0);
        
        st.push(p);
        
        for(int i=1;i<n;i++){
            int ele = price[i];
            
            while(st.size()!=0 && ele>=st.peek().ele ){
                st.pop();
            }
            
            if(st.size()==0){
                ans[i]=i+1;
            }else{
                ans[i]=i-st.peek().idx;
            }
            
            Pair p1 = new Pair(ele,i);
            
            st.push(p1);
            
        }
        
        return ans;
        
    }
    
}

class Pair{
    int ele ;
    int idx ;
    
    Pair(int ele , int idx ){
        this.ele=ele;
        this.idx=idx;
    }
}