package stack_queue;

import java.util.EmptyStackException;



class Stack<T> {
// Stack에서만 통하는 Node 클래스 생성
    class Node<T> {
        private T data;
        //Node next값
        private Node<T> next;
        //Node 생성자
        public Node(T data) {
            this.data = data;
        }
    }

    //Stack 의 Node Instance variable = top값
    private Node<T> top;


    public T pop(){
        // Top이 없으면 에러 발생
        if(top == null){
           throw new EmptyStackException();
        }
        // return할 top 값을 미리 백업하구
        T itemToRetrieve  = top.data;
        //top의 nex로 Top 지정
        top = top.next;
        return itemToRetrieve;
    }

    public void push(T item){
        Node<T>t = new Node<T>(item);
        // 새로운 Node의 다음값을 Top으로 변경하고
        t.next = top;
        // Top은 새로운 Node가 된다
        top =t;
    }

    public T peek(){
        if(top == null){
            throw new EmptyStackException();
        }else{
            return top.data;
        }
    }

    public boolean isEmpty(){
        return top == null;
    }
}


public class Stack_test {

    public static void main(String[] args) {
        Stack<Integer> s   = new Stack<Integer>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);

        System.out.println(s.pop());
        System.out.println(s.peek());
    }
}
