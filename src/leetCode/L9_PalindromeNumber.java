package leetCode;

public class L9_PalindromeNumber {
    public static void main(String[] args) {

        Solution9 solution9 = new Solution9();
        System.out.println(solution9.isPalindrome(-121));
    }
}

class Solution9 {
    public boolean isPalindrome(int x) {

        String stringChanged = String.valueOf(x);
        //sign Checker
        if(!Character.isDigit(stringChanged.charAt(0))) return false;

        for(int i = 0; i<stringChanged.length()/2; i++){
            if(stringChanged.charAt(i) != stringChanged.charAt(stringChanged.length()-1-i))
                return false;
        }

        return true;

    }

}