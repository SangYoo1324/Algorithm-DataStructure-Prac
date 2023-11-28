package CodingInterviewQuestions;

import java.util.LinkedList;

public class ReverseLinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(1);
        ll.add(2);
        ll.add(3);
        System.out.println(ll);

        LinkedList<Integer> ll2 = new LinkedList<>();
        ll.descendingIterator().forEachRemaining(ll2::add);
        System.out.println(ll2);
    }


}
