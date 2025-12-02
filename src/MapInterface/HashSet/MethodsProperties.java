package MapInterface.HashSet;

import java.util.HashSet;

public class MethodsProperties {
    public static void main(String[] args) {
        HashSet<String> st = new HashSet<>();
        st.add("james");
        st.add("scott");
        System.out.println(st);
        System.out.println(st.contains("james"));
        System.out.println(st.size());
        st.remove("james");
        st.add("marks");

        //traving
        for(String s: st){
            System.out.println(s);
        }
    }
}
