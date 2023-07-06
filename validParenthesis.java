import java.util.Stack;

public class validParenthesis {
    public static void main(String[] args) {
        
    }

    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();

          for(int i=0;i<s.length();i++){

              char ch = s.charAt(i);
            if(ch=='(' || ch =='[' || ch=='{'){
                   st.push(ch);
             }else if(ch==')' && st.size()!=0 && st.peek()=='('){
                  st.pop();
              }else if(ch==']' && st.size()!=0 && st.peek()=='['){
                  st.pop();
              }else if(ch=='}' && st.size()!=0 && st.peek()=='{'){
                  st.pop();
              }else{
                  return false;
              }
          }

          if(st.size()==0)return true;
          else return false;
       
       
         
    }
}




