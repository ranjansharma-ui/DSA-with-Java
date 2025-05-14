package Strings.All_Methods.Concatition;

public class concat_Method {
    public static void main(String[] args) {
        String s1 = "Ranjan";
        String s2 = "Sharma";

        // 1. concat() method
        String s3 = s1.concat(s2);
        System.out.println(s3);

        //2. join() method
        String s4 = String.join("_",s1,s2);
        System.out.println(s4);

        // 3. (+) operator
        String s5 = s1 + s2;
        System.out.println(s5);
    }
}
