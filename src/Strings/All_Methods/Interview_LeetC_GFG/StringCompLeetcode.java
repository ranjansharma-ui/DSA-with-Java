package Strings.All_Methods.Interview_LeetC_GFG;

public class StringCompLeetcode {
    public static String  compress(String[] chars) {
        StringBuilder sb = new StringBuilder("");
        int ans = 0;
        int count = 0;
        for (int i = 0; i < chars.length; i++) {
            int j = 0;
            while (i < chars.length-1 && chars[j].equals(chars[j + 1])) {
                count++;
                j++;


            }

            // sb.append(str.charAt(i));
            sb.append(chars[i]);
            if(count > 1){
                sb.append(count);
            }

        System.out.println(count);
        }

        String str = sb.toString();
//        String sh = str.toCharArray();
        return str;



    }
    public static void main(String[] args) {
        String ch[] = {"a","a","b","b","c","c","c"};
        System.out.println(compress(ch));
    }
}
