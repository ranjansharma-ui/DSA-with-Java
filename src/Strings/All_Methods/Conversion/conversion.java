package Strings.All_Methods.Conversion;

public class conversion {
    public static void main(String[] args) {
        String s = "1234";

        //1. convert into integer , double, long etc use parseInt, parseLong, parseDouble,
        int n = Integer.parseInt(s);
        long n1 = Long.parseLong(s);
        double d = Double.parseDouble(s);

        System.out.println(n);
        System.out.println(n1);
        System.out.println(d);

        //2. Integer to String
        // => toString()

        int x = 9099;
        double y = 90.0;
        float f = 89.0f;
        long l = 909796996;

        String str1 = Integer.toString(x);
        String str2 = Double.toString(y);
        String str3 = Float.toString(f);
        String str4 = Long.toString(l);

        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(str4);



    }
}
