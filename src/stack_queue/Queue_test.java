package stack_queue;

import java.util.NoSuchElementException;

class Queue<T>{
    // Node  클래스 생성
    class Node<T>{
        private T data;
        private Node<T> next;
        public Node(T data){
            this.data = data;
        }
    }

    private Node<T> first;
    private Node<T> last;

    public void add(T item){
        Node<T> t = new Node<T>(item);
        //마지막 노드가 있다면
        if(last!= null){
            last.next = t;
        }
        last = t;
        //데이터가 아얘 없을 때
        if(first == null){
            first = last;
        }
    }

    public T remove(){
        // queue 가 비어있으면
        if(first == null){
            throw new NoSuchElementException();
        }
        // return 위해 first.data 백업
        T data = first.data;
        //first 뒤에꺼 first로 바꿈
        first = first.next;
        //first.next가 null이어서  새로운 first가 null인 경우
        // last도 null로 바꿈(데이터가 아얘 없는거니까)
        if(first== null){
            last = null;
        }

        return data;
    }

    public T peek(){
        if(first == null){
            throw new NoSuchElementException();
        }
        return first.data;
    }

    public boolean isEmpty(){
        return first == null;
    }
}


public class Queue_test {
    public static void main(String[] args) {
        Queue<Integer> q = new Queue<Integer>();

        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        System.out.println(q.remove());
        System.out.println(q.remove());
        System.out.println(q.remove());
        System.out.println(q.remove());



    }
}
