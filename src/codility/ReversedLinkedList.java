package codility;

import java.util.*;

public class ReversedLinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> li = new LinkedList<Integer>();
        li.add(1);
        li.add(2);
        li.add(3);
//        LinkedList<Integer> reversed = new LinkedList<>();
//        li.descendingIterator().forEachRemaining(a->reversed.add(a));
        LinkedList<Integer> reversed = new LinkedList<>();
        Stack<Integer> stack =new Stack<>();
        li.stream().forEach((i)->stack.push(i));
        System.out.println(stack.toString());

//        reversed.stream().map(i->reversed.add(stack.pop())).forEach(System.out::println);

        Iterator<Integer> it  = stack.iterator();
        while(it.hasNext()) {
            reversed.add(stack.pop());
        }

        System.out.println(reversed.toString());



//        Iterator<Integer> it  = reversed.iterator();
//        while(it.hasNext()){
//            System.out.println(it.next().toString());
//        }
    }

}
