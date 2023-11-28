package optionalClass;



import java.util.Arrays;
import java.util.Optional;

public class OptionalDemo {
    public static void main(String[] args) {
        // null일 지라도 optioinial 객체에 담아서 보내 nullPointerException이 안뜨게 해줌
        Optional<String> optVal = Optional.ofNullable("aaa");//  값이 있긴 있는데 null일 수 있다
        Optional<String> optVal2 = Optional.<String>empty();// 빈 객체로 초기화

        Student[] students = {new Student("a",100),
                new Student("b",90),
                new Student("c",90)
        };

        Arrays.asList(students).stream().map(Student::getScore).filter(i->i<100).forEach(System.out::println);

    }

}

class Student {
    String name;
    int score;

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
