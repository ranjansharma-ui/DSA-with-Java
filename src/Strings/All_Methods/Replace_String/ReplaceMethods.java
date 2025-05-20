package Strings.All_Methods.Replace_String;

public class ReplaceMethods {
    public static void main(String[] args) {
        String str = "Human";
        // 1. replace()
        System.out.println(str.replace("man","women"));

        String str1 = "Where you are! i am here";
        System.out.println(str1.replace("re","is"));
        //2. replaceFirst()
        System.out.println(str1.replaceFirst("re","is"));

        //3. replaceAll() <-> replace()
        System.out.println(str1.replaceAll("re","is"));
    }
}
