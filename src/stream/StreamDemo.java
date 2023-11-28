package stream;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamDemo {
    public static void main(String[] args) {
String[] str = {"a", "a", "c", "d", "e"};
//둘다 같음
    Arrays.stream(str).toList().stream().distinct().forEach(System.out::println);
    Arrays.asList(str).stream().distinct().forEach(System.out::println);

//stream.Stream 없이 List를 Array로 변환
       List list = Arrays.asList(str).stream().distinct().collect(Collectors.toList());
        String [] back = (String[]) list.toArray(new String[5]);
        System.out.println(back.toString());

        //stream.Stream 으로 List를 Array 로 변환
        String[] result = (String[]) list.stream().toArray(String[]::new);
        for(String s : result){
            System.out.println(s);
        }

        //랜덤 숫자 제너레이터
        IntStream intStream = new Random().ints(1,45);
        intStream.limit(3).forEach(System.out::print);

        System.out.println();
        //1~10까지 제너레이트 후 filter(조건식)
        IntStream intStreamRangeClosed = IntStream.rangeClosed(1, 10);
        intStreamRangeClosed.filter(i-> i%2==0).forEach(System.out::print);
        System.out.println();
        //스트림 정렬하기 sorted()z
        List<String> unsorted = new ArrayList<String>(Arrays.asList("b", "a", "c", "d", "e", "f"));
        unsorted.stream().sorted(Comparator.reverseOrder()).forEach(System.out::print);
    }

}
