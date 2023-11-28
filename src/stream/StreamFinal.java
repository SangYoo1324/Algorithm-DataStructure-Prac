package stream;

import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamFinal {
    public static void main(String[] args) {
    String[] strArr= {
            "a", "b", "c", "d", "e", "f"
    };
        Stream.of(strArr).forEach(System.out::println);
//        Stream.of(strArr).forEach(s -> System.out.println(s));

        boolean noEmtpyStr = Stream.of(strArr).
                noneMatch(s-> s.length()==0); // 문자열 길이가 0인거 없는지 체크
        System.out.println(noEmtpyStr);

        Optional<String> aWord = Stream.of(strArr).//Optional로 받는 이유는 null일 수 도 있기 때문에
                    filter(s-> s.charAt(0)=='a').
                findFirst();
        System.out.println(aWord.get());//Optional 객체에서 값 꺼내올땐 get()으로

        //reduce()
        IntStream intStream = Stream.of(strArr).mapToInt(s->s.length());
        int count  = intStream.reduce(0, (a,b)->a+1);   // 0은 시작값/ a는 시작값(=0) / b는 stream 요소
        try {
            int sum = intStream.reduce(0, (a,b)->a+b);
        } catch(IllegalStateException e){
//        throw new IllegalStateException("bruh");
            System.out.println("Something went wrong");
        }

        System.out.println("Still next line excecute");
    }

}
