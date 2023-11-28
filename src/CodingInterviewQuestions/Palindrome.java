package CodingInterviewQuestions;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println(palindromeCheck("mam"));


    }
    public static boolean palindromeCheck(String input){
        boolean isPanlindrome;
        StringBuilder b = new StringBuilder();
        char[] inputToChar = input.toCharArray();
        for(int i = inputToChar.length-1; i>=0; i--){
            b.append(inputToChar[i]);
        }
        System.out.println(b.toString());
        if(b.toString().equals(input)){
            isPanlindrome= true;
        }else
            isPanlindrome=false;

        return isPanlindrome;
    }
}
