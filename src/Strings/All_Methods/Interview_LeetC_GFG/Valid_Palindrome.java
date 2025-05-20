package Strings.All_Methods.Interview_LeetC_GFG;

public class Valid_Palindrome {
    public static boolean isAlphaNum(char ch){
        if ((ch >= '0' && ch <= '9') || (Character.toLowerCase(ch) >= 'a' && Character.toLowerCase(ch) <= 'z')){
            return true;
        }

        return false;

    }

    public static boolean isPalindrome(String s){
        int n = s.length();
        int left = 0, right = n-1;

        while (left < right){
            if (!isAlphaNum(s.charAt(left))){
                left++;
                System.out.println("Ranjan"); // for checking purpose
                continue;
            }
            if (!isAlphaNum(s.charAt(right))){
                right--;
                System.out.println("Ranjan");
                continue;

            }

            if(Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(left))){
                return false;
            }
            left++;
            right--;



        }
        return true;
    }
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        String s1 = "race ar";
        System.out.println(isPalindrome(s1));
    }
}
