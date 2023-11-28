package codility;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IsOddStream {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5));
        System.out.println(onlyOddNumbers(list));
    }
    public static boolean onlyOddNumbers(List<Integer> list) {
      return  list.stream().anyMatch(x->x%2 !=0);
    }

}
