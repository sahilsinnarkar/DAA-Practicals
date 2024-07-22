import java.util.*;

class CheckPalindrome {

    private static boolean checkPalindrome(String s) {
        String rev = "";
        int len = s.length();
        for (int i = 0; i < len; i++) {
            rev = s.charAt(i) + rev;
        }
        if (s.equals(rev))
            return true;
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string to check for palindrome : ");
        String str = sc.next();
        if (checkPalindrome(str)) {
            System.out.println("The string " + str + " is Palindrome.");
        } else {
            System.out.println("The string " + str + " is Not Palindrome.");
        }
        sc.close();
    }
}
