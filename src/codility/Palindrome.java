package codility;

public class Palindrome {
    public static void main(String[] args) {
    String input = "yooya";
        System.out.println(checkPalindromeString(input));
    }
   static boolean checkPalindromeString(String input) {
        boolean result= true;
        int length = input.length();
        for (int i=0; i<length/2; i++) {
            if(input.charAt(i)!= input.charAt(length-1-i)){
                return false;

            }
        }
        return true;
    }
}
