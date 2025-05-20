package Strings.All_Methods.Interview_LeetC_GFG;
import java.util.*;
import java.lang.*;
/*
   aaabbcccdd -> a3b2c3d2
 */
public class String_Compression {
    public static int Compression(char[] chars){
        int n = chars.length;
        int idx = 0;
        for (int i=0; i<n; i++){
            char ch = chars[i];
            Integer count = 0;

            while(i<n && chars[i] == ch){
                count++;
                i++;
            }

            if (count == 1){
                chars[idx++] = ch;
            }
            else{
                chars[idx++] = ch;
                String str = count.toString();

                for (int j=0;j<str.length(); j++){
                    chars[idx++] = str.charAt(j);
                }
            }
            i--;
        }
//        char [] chr = new char[idx];
//        System.arraycopy(chars, 0, chars, 0, Math.min(chars.length, idx));
//
//        return chars.length;

        return idx;


    }
    public static void main(String[] args) {
        char [] chars = {'a','a','a','b','c','c','c'};
        System.out.println(Compression(chars));

        Character ch = 'S';
        System.out.println(Character.toLowerCase(ch));

    }
}
