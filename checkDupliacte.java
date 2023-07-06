import java.util.Stack;

public class checkDupliacte {
    public static void main(String[] args) {
        String s1 = "(a-b+((a+b)))";
         String s2 = "a+b+(a-b)";

     boolean ans = check(s2);

     System.out.println(ans);

    }

    public static boolean check(String str){

        Stack<Character> st = new Stack<>();

        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);

            if(ch==')' && st.peek()=='('){
                return false;
            }else if ( ch==')'){
                while( st.size()!=0 && st.peek()!='('){
                    st.pop();
                }
                st.pop();
            }else{
                st.push(ch);
            }
        }
        return true;
    }
}
