package Stack.QuestionBasicToAdv;

import java.util.Stack;

public class validBracket2 {
    public static boolean isValid(String str){
        Stack<Character> st = new Stack<>();

        for (int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if (ch == '(' || ch == '{' || ch == '['){
                st.push(ch);
            }else{
                if (st.isEmpty()) return false;
                else if (st.peek() == '{' && ch == '}') st.pop();
                else if (st.peek() == '(' && ch == ')') st.pop();
                else if (st.peek() == '[' && ch == ']') st.pop();

                else return false;
            }
        }

        if (!st.isEmpty()) return false;
        else return true;
    }
    public static void main(String[] args) {
        String str = "([])";
        System.out.println(isValid(str));
    }
}
