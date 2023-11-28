package CodingInterviewQuestions;


import java.util.*;
// comparable=> @Override compareTo(int a) 자기자신과 parameter을 비교  // comparator => @Override compare(a,b)두 파라미터를 비교
// Sorting array using lots of comparable options(Custom Comparable)

public class SortingArray {
    public static void main(String[] args) {
        String[] array = {"abc","bcd","efj","klm","abd","4"};
        List <String>list = Arrays.asList(array);
//        Collections.sort(list,(a,b)->{   람다식으로 표현
//            return a-b;  // 작은거부터 큰거
//            return b-a;  //큰거부터 작은거
//        });
        Comparator<String> comparator = new Comparator<String>() {

            @Override
            public int compare(String a, String b) {
                return b.compareTo(a);  // z부터 a
               // return a.compareTo(b); // a부터 z
            }
        };
        Collections.sort(list,comparator);

      //  Iterator it = Arrays.stream(array).iterator();
        Iterator it = list.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }



}
