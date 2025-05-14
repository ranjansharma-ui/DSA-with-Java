package Strings.All_Methods.Camparisons;
import javax.swing.plaf.synth.SynthRadioButtonMenuItemUI;
import java.util.*;

/*
    Compare on String
       METHODS                    RETURN-TYPE
    1. equals()            :       boolean
    2. equalsIgnoreCase()  :       boolean [ignore upper or lower case]
    3. CompareTo()         :       int [ASCII value]

 */
public class CamparesInStrings {

    public static void main(String[] args) {

        // 1. equals() :- must be same-case and characters then equals() to return true.
        String str1 = "RANJAN";
        String str2 = "RANJAN";
        System.out.println(str1.equals(str2)); // true

        String s1 = new String("Radha");
        String s2 = new String("Radha");
        System.out.println(s1.equals(s2));

        // 2. equalIgnoreCase() :- As a name suggest that Ignore anyCase upper or lower
        String sr1 = "JaVA";
        String sr2 = "Java";
        System.out.println(sr1.equalsIgnoreCase(sr2));

        // 3. CompareTo() :- methods compare string in lexicographically order (dictionary)
        /*
           rule:
           a. if(String1 > String2) -> Positive value (i.e b > a -> 98-97 = 1)
           b. if(String1 == String2) -> 0
           c. if(String1 < String2)  -> negative value (i.e j < k ->  106-107 = -1)
         */
        String st1 = "Ranjan";
        String st2 = "Rcnjan";
        System.out.println(st1.compareTo(st2)); // a->97, c->99 , ans = -2



    }
}
