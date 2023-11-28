package stream;

import java.util.Comparator;
import java.util.stream.Stream;

public class StreamPrac {
    public static void main(String[] args) {

        Stream<Student> studentStream = Stream.of(new Student("aaa",3,300),
                new Student("aaa",3,300),
                new Student("bbb",1,200),
                new Student("ccc",2,100),
                new Student("ddd",3,150)
                );
        //반별 정렬
         studentStream.sorted(Comparator.comparing(Student::getBan)).forEach(System.out::println);
         //람다식으로
        studentStream.sorted(Comparator.comparing((Student s)->s.getBan())).forEach(System.out::println);
        //역순정렬 comparing().reversed
        studentStream.sorted(Comparator.comparing(Student::getBan).reversed()).forEach(System.out::println);
    }
}

class Student implements Comparable<Student> {
String name;
int ban;
int totalScore;

    public Student(String name, int ban, int totalScore) {
        this.name = name;
        this.ban = ban;
        this.totalScore = totalScore;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBan() {
        return ban;
    }

    public void setBan(int ban) {
        this.ban = ban;
    }

    public int getTotalScore() {
        return totalScore;
    }

    public void setTotalScore(int totalScore) {
        this.totalScore = totalScore;
    }

    //내림차순
    @Override
    public int compareTo(Student o) {
        return o.totalScore -this.totalScore;
    }

    @Override
    public String toString() {
        return "stream.Student{" +
                "name='" + name + '\'' +
                ", ban=" + ban +
                ", totalScore=" + totalScore +
                '}';
    }
}
