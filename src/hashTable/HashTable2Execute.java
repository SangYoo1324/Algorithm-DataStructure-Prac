package hashTable;

import java.util.LinkedList;

public class HashTable2Execute {
    public static void main(String[] args) {
        HashTable2 h = new HashTable2(3);
        h.put("sung","She is pretty");
        h.put("jin", "She is a model");
        h.put("hee","She is an angel");
        h.put("min", "She is cute");

        System.out.println(h.getValue("sung"));
        System.out.println(h.getValue("jin"));
        System.out.println(h.getValue("hee"));
        System.out.println(h.getValue("min"));
    }

}

class HashTable2{
    // LinkedList를 가지고 있는 Node
    LinkedList<Node>[] data;

  HashTable2(int size) {this.data = new LinkedList[size];}

    int getHashCode(String key){
      int hashCode = 0;
      for(char c: key.toCharArray()){
          hashCode+=c;
      }
        System.out.println("HashCode::: "+hashCode);
      return hashCode;
    }

    int convertToIndex(int hashCode) {return hashCode% data.length;};

    Node searchKey(LinkedList<Node>list, String key){
      if(list == null) return null;
      for(Node node:list){
          if(node.key.equals(key)){
              return node;
          }
      }
      return null;
    }

    void put(String key, String value){
      int hashCode = getHashCode(key);
      int index = convertToIndex(hashCode);
      LinkedList<Node> list = data[index];
      if(list == null){
          list  = new LinkedList<Node>();
          data[index] = list;
      }
      Node node = searchKey(list,key);
      if(node == null){
          list.addLast(new Node(key,value));
      }else{
          node.value = value;
      }

    }

    String getValue(String key){
        int hashCode = getHashCode(key);
        int index = convertToIndex(hashCode);
        LinkedList<Node> list = data[index];
        Node node = searchKey(list,key);
        return node == null ? "Not Found": node.value;
    }
}

//node class 정의
    class Node{
    String key;
    String value;

    public Node(String key, String value) {
        this.key = key;
        this.value = value;
    }
}
