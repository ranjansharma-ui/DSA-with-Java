package MapInterface.Hashmap.Questions;

import java.util.HashMap;

public class ValidAnagram {

    static HashMap<Character,Integer> CreateFreqMap (String str){
        HashMap<Character,Integer> mp = new HashMap<>();
        for (int i=0; i<str.length(); i++){
            Character ch = str.charAt(i);
            if (!mp.containsKey(ch)){
                mp.put(ch,1);
            } else {
                int currFreq = mp.get(ch);
                mp.put(ch,currFreq+1);

            }
        }

        return mp;
    }

    public static boolean isAnagram(String s1, String s2){
        if (s1.length() != s2.length()) return false;
        HashMap<Character,Integer> mp1 = CreateFreqMap(s1);
        HashMap<Character, Integer> mp2 = CreateFreqMap(s2);

        return mp1.equals(mp2);
    }

    public static boolean isAnagram1(String s1,String s2){
        if (s1.length() != s2.length()) return false;

        HashMap<Character,Integer> mp = CreateFreqMap(s1);
        for (int i=0; i<s2.length(); i++){
            Character ch = s2.charAt(i);
            if (!mp.containsKey(ch)) return false;
            int currFreq = mp.get(ch);
            mp.put(ch,currFreq-1);
        }

        for (Integer i : mp.values()){
            if (i != 0) return  false;
        }

        return true;
    }

    public static void main(String[] args) {

        String s1 = "knee";
        String s2 = "keew";
        System.out.println(isAnagram1(s1,s2));

    }
}
