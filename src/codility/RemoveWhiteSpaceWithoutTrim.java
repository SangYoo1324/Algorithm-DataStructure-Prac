package codility;

public class RemoveWhiteSpaceWithoutTrim {
    public static void main(String[] args) {

    }
    String removeWhiteSpaces(String input){
        StringBuilder output = new StringBuilder();
        char[] charArray = input.toCharArray();
        for(char c: charArray){
            if(!Character.isWhitespace(c)){
                output.append(c);
            }
        }
        return output.toString();
    }
}
