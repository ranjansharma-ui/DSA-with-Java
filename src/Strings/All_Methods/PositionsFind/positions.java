package Strings.All_Methods.PositionsFind;

public class positions {
    public static void main(String[] args) {
        String str = "INHERITANCE";

        //1. indexOf() -> return index particular characters of first occurrence
        System.out.println(str.indexOf("I")); // 0

        //2. lastIndexOf("E") -> name sagest when char to until last occur
        System.out.println(str.lastIndexOf("E"));

        //3. charAt() -> through index find characters
        System.out.println(str.charAt(4));

        //4. startsWith() :- boolean return type
        System.out.println(str.startsWith("I")); // true
        System.out.println(str.startsWith("H")); // false

        //5. endWith() :- return type boolean
        System.out.println(str.endsWith("E")); // true
        System.out.println(str.endsWith("R")); // false


    }
}
