package stream;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.Arrays.asList;

public class StreamPeek {
    public static void main(String[] args) {
        File[] fileArr = {new File("javaioFiletxt"), new File("java.io.File2.java")};
       List<File> fileList =  Arrays.asList(fileArr);
       fileList.stream().map(File::getName).
               filter(s->s.indexOf('.')!=-1).
               peek(s->System.out.printf("filename:%S ,",s)).// peek로 스트림 닫지 않고 확장자 있는 것만 걸러졌는지 확인
               map(s-> s.substring(s.indexOf('.')+1)).// . 이후 확장자만 추출
               forEach(s->System.out.printf("filename:%S ,",s));


    }




}
