package leetCode;

import java.util.ArrayList;
import java.util.List;

public class LetterCombination_17 {
    public static void main(String[] args) {
    Solution17 solution17 = new Solution17();

    solution17.letterCombinations("234").stream().forEach(
            e->{
                System.out.println("종합");
                System.out.println(e);
            }
    );
    }

}

class Solution17 {
    public List<String> letterCombinations(String digits) {
        String[] chars = {"0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        //234
        List<String>combinations = new ArrayList<>();
        List<String>finalSets = new ArrayList<>();
        if(digits.equals("")) {
            System.out.println("input이 \"\"임");
            return finalSets;
        }else{
            // 콤비네이션에 필요한 chars 넣는 프로세스
            for(int i = 0; i<digits.length(); i++){
                int digit = Integer.parseInt(String.valueOf(digits.charAt(i)));
                String charset = chars[digit];
                combinations.add(charset);
            }
            int idx = 0;
            // 2(abc)  3(def)  # of combination's base char set like,  a =0 b=1 c=2
            int maxIndex = combinations.size()-1;
            System.out.println("maxIndex: "+maxIndex);
            dfs(combinations,idx,maxIndex,finalSets, new StringBuilder());


        }



        return finalSets;
    }

    public void dfs(List<String> letterPairs, int start, int max, List<String> finalSets
    , StringBuilder sb){
        // 마지막 문자까지 왔으면 문자 finalSet에 넣고 종료
        if(start == max+1){
            System.out.println("끝까지 옴");
            finalSets.add(sb.toString());
            return;
        }

        for(int i = 0; i<letterPairs.get(start).length(); i++){
            // 문자 넣어주고
            sb.append(letterPairs.get(start));
            // 다음 문자로 가게 dfs연결
            dfs(letterPairs,start+1,max,finalSets, sb);
            // 다 끝난 후 마지막 지워주는 process
            sb.deleteCharAt(sb.length()-1);
        }


            }


    }


