package stream;

import java.io.File;
import java.util.stream.Stream;

public class StreamMap {
    public static void main(String[] args) {
        Stream<File> fileStream =  Stream.of(new File("ex1.java"), new File("ex2java"));
         fileStream.map((File f)->(f.getName()))
                                                            .filter(s->s.indexOf('.')!=-1) //확장자가 없는 것은 제외
                .map(s-> s.substring(s.indexOf('.') + 1))//확장자만 자르기
                .forEach(System.out::print); //확장자만 뽑아냄

    }
}
