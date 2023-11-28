package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamFlatMap {
    public static void main(String[] args) {
        List<String[]> arrList = new ArrayList<String[]>(Arrays.<String[]>asList(new String[]{"a", "b", "c", "d"}
                , new String[]{"e", "f", "g", "h"}));
        arrList.stream().flatMap(Arrays::stream).forEach(System.out::println);// List안의 array까지 다 파헤쳐서 어레이 병합
        System.out.println();

        String[] lineArr = {
                "sbibal johnna",
                "him dul daaaaaa"
        };
        Stream<String> lineStream = Arrays.stream(lineArr);//문장 두개 들어있는 스트림
        lineStream.map(line -> Stream.of(line.split(" +")))// 단어별로 들어있느 스트림
                .forEach(System.out::println);
        //문장 스트림에 단어 스트림이 들어가 있으므로 Map을 쓰면 단어스트림이 아닌 단어스트림 reference 주소가 나옴

        //Arrays.stream(ineArr) 에서  stream(T[] Array) 선택해야함 안해주면 line value 특정 못해서 오류남
        Arrays.stream(lineArr).flatMap(line -> Stream.of(line.split(" +")))
                .forEach(System.out::println);

    }
}
