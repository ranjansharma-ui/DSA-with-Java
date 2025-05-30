package Recursion.intermediate_Level;

public class DuplicateString {
    public static void duplicatesString(String str, StringBuilder newStr, boolean map[], int idx){
        StringBuilder sb = new StringBuilder();

        //base-case
        if(idx == str.length()){
            System.out.println(newStr);
            return;

        }

        //kaam
        char currChar = str.charAt(idx);
        if (map[currChar-'a'] == true){
            //duplicate
            duplicatesString(str,newStr,map,idx+1);
        }else {
            map[currChar-'a'] = true;
            duplicatesString(str,newStr.append(currChar),map,idx+1);

        }



    }
    public static void main(String[] args) {
        String str = "appnnacollege";

        duplicatesString(str,new StringBuilder(""),new boolean[26],0);


    }
}
