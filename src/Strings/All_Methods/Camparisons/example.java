package Strings.All_Methods.Camparisons;

public class example {
    public static void main(String[] args) {
        String s1 = "Tony";
        String s2 = "Tony";
        String s3 = new String("Tony");

        if (s1 == s2){
            System.out.println("Strings are equal");
        }
        else {
            System.out.println("String are not equal");
        }

        if(s1 == s3){
            System.out.println("Strings are equal");
        }else {
            System.out.println("String are not equal");
        }

        if (s1.equals(s3)) {
            System.out.println("Strings are equal");
        }else {
            System.out.println("String are not equal");
        }

    }
}
