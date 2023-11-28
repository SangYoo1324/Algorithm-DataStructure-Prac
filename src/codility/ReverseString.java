package codility;

public class ReverseString {
    public static void main(String[] args) {

        System.out.println(reverse("abcde"));
    }

    public static String reverse(String input){
        StringBuilder output= new StringBuilder();
        if(input==null){
            throw new IllegalArgumentException("Input must not be null");
        }else{

            char[] chars = input.toCharArray();
            for(int i=chars.length-1; i>=0; i--){
                output.append(chars[i]);
            }
        }
        return output.toString();
    }
}
