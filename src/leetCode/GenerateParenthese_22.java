package leetCode;

import java.util.ArrayList;
import java.util.List;

public class GenerateParenthese_22 {
    public static void main(String[] args) {

    }

}


class Solution22 {
    public List<String> generateParenthesis(int n) {
        List<String> output_arr =  new ArrayList<>();
        backTrack(output_arr,"", 0,0, n);

        return output_arr;

    }

void backTrack(List<String> output_arr,String current, int open, int closed, int max ){



}
}