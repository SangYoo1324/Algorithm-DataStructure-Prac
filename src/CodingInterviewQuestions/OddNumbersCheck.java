package CodingInterviewQuestions;

import java.util.List;
import java.util.stream.Collectors;

public class OddNumbersCheck {
    public static void main(String[] args) {

    }
    public static boolean onlyOddNumbers(List<Integer> list){
        return list
                .parallelStream()
                .anyMatch(x->x%2!=0);  // boolean return
    }
}

