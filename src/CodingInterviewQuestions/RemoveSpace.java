package CodingInterviewQuestions;

public class RemoveSpace {
    public static void main(String[] args) {
        System.out.println(removeSpace("hello world"));
    }
    public static String removeSpace (String input){
        StringBuilder output = new StringBuilder();
        char[] inputToChar = input.toCharArray();

            for(char c: inputToChar){
                if(!Character.isWhitespace(c))
                output.append(c);
            }
            return output.toString();


    }
}
