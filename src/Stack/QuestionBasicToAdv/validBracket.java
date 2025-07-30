package Stack.QuestionBasicToAdv;

import java.util.Stack;

public class validBracket {
    boolean isValid(String str){
        Stack<Character> st = new Stack<>();

        for (int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if (ch == '('){
                st.push(ch);
            }else{
                if (st.isEmpty()) return false;
                else st.pop();
            }
        }

        if (!st.isEmpty()) return false;
        else return true;
    }
    // follow-up question to ask an interviewer , find the minimum number of brackets that
    // we need to remove to make the given bracket sequence balanced.

    public static int minimumNum(String str) {
        int count = 0;
        Stack<Character> st = new Stack<>();
        for (int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if (ch == '(') st.push(ch);
            else if (ch == ')') {
                count++;
            }else {
                st.pop();
            }

        }
        int min = count + st.size();
        return min;
    }


    public static void main(String[] args) {
        String str = ")((())()";
        validBracket v = new validBracket();

        System.out.println(v.isValid(str));
        System.out.println(minimumNum(str));
        System.out.println(str);
    }
}
