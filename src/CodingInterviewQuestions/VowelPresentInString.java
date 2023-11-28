package CodingInterviewQuestions;

public class VowelPresentInString {
    public static void main(String[] args) {
        System.out.println(stringContainsVowels("Hello"));

    }

    private static boolean stringContainsVowels(String hello) {
        return hello.toLowerCase().matches(".*[aeiou].*");
    }
}
