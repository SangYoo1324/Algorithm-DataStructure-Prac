package stream;

import java.io.File;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMapPrac {
    public static void main(String[] args) {
        File []fileArr= { new File("Ex1.java"), new File("Ex2.java"), new File("Ex3.java")};

        Stream<File> fileStream = Stream.of(fileArr);
        fileStream.map((File f)->f.getName()).//String화
        filter(s->s.indexOf('.')!=-1).// 확장자 안들어간 애들 제외
        map(s->s.substring(s.indexOf('.')+1)).
//        map(s->s.toUpperCase()).
                map(String::toUpperCase).
//        distinct().
        forEach(System.out::print);


    }
}
