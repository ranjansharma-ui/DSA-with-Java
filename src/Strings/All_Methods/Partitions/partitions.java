package Strings.All_Methods.Partitions;

public class partitions {
    public static void main(String[] args) {
        // 1. substring(start idx, end idx)
        String str1 = "Hanuman";
        System.out.println(str1.substring(0,3));
        System.out.println(str1.substring(0));
        // 2. subsequences
        System.out.println(str1.subSequence(0,4));

    }
}
