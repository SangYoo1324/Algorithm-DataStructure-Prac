package leetCode;

public class LongestPanlindromicSubstring {
    public static void main(String[] args) {
        Solution5 solution5  = new Solution5();
        //cbbd
        System.out.println(solution5.longestPalindrome("abba"));
    }
}

class Solution5 {
    public String longestPalindrome(String s) {
        String maxStr = "";
        for(int i = 0; i< s.length(); i++){
            String oddPalind  = checker(i,i,s);
            String evenPalind = checker(i,i+1, s);
        if(oddPalind.length()>evenPalind.length() && oddPalind.length()>maxStr.length()) maxStr = oddPalind;
            if(oddPalind.length()<evenPalind.length() && evenPalind.length()>maxStr.length()) maxStr = evenPalind;

        }

        return maxStr;
    }

    public String checker(int leftPointer , int rightPointer, String s){
        while(leftPointer>=0 && rightPointer<s.length()){
            // matching 하면
            if(s.charAt(leftPointer) == s.charAt(rightPointer)){
                leftPointer--;
                rightPointer++;
            }
            else break;

            // while문에서 감소시키고 끝나서 사실상 pallindrome 범위보다 1칸씩 더 간거라 다시 원상복구 시켜줌
            leftPointer++;
            rightPointer--;
        }

        return s.substring(leftPointer, rightPointer+1);
    }


}

class altSolution{

}