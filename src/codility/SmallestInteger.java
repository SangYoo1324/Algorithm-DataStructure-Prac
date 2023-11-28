package codility;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SmallestInteger {
    public static void main(String[] args) {
        int[]A = {-1,-3};

        System.out.println(Solution.solution(A));

    }
}
class Solution{
    public static int solution(int[] A){
 List<Integer> filterSorted= Arrays.stream(A).boxed().filter(i->i>0).sorted().collect(Collectors.toList());
        System.out.println(filterSorted.toString());
 int result=1;
 if(filterSorted.isEmpty()){
     return result;
 }else{
     for(int i=0; i<filterSorted.size()-1;i++){
         if(filterSorted.get(i+1)-filterSorted.get(i)>1){
             result = i+1;
         }else{
             result = filterSorted.get(i+1)+1;
         }
 }

     return result;
}
    }
}

