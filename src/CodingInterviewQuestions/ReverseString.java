package CodingInterviewQuestions;

import java.util.*;
import java.util.stream.Stream;

public class ReverseString {
    public static void main(String[] args) {
        String st = "asdf";
        System.out.println(reverse(st));
    }

    public static String reverse(String in){
        if(in == null)
            throw new IllegalArgumentException("Null is not valid input");
    //    StringBuilder out = new StringBuilder();
    List<Character> out = new ArrayList<Character>();

        char[] chars = in.toCharArray();
        //stack 이용한 풀이
        Stack st = new Stack();
        for(char i  : chars){
            st.push(i);
        }

        st.stream().forEach((i)->{
            out.add((Character) st.pop());
        });
        // ConcurrentModificationException 발생

                // reverse for문 이용한 풀이
//        char[] chars = in.toCharArray();
//        for(int i = chars.length-1; i<=0; i++)
//            out.append(chars[i]);

        return out.toString();
        }



    }


