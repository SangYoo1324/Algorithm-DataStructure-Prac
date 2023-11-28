package hashTable;

import java.util.Hashtable;
import java.util.LinkedList;

public class HashTable {

        public static void main(String[] args) {
            HashTable h = new HashTable(3);
            h.put("sung","She is pretty");
            h.put("jin", "She is a model");
            h.put("hee","She is an angel");
            h.put("min", "She is cute");

            System.out.println(h.get("sung"));
            System.out.println(h.get("jin"));
            System.out.println(h.get("hee"));
            System.out.println(h.get("min"));
        }


    //hash화
    int getHashCode(String key){
        int hashCode = 0;
        for(char c : key.toCharArray()){
            hashCode+=c;
        }
        return hashCode;
    }

    //hash를 index로 전환
    int convertToIndex(int hashCode){
        return hashCode% data.length;
    }

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
            list = new LinkedList<Node>();
            data[index] = list;
        }
        Node node = searchKey(list,key);
        if(node == null){
            list.addLast(new Node(key,value));
        }else{
            node.setValue(value);
        }
    }

    String get(String key){
        int hashCode = getHashCode(key);
        int index = convertToIndex(hashCode);
        LinkedList<Node> list = data[index];
        Node node = searchKey(list,key);
        return node == null? "Not found" : node.getValue();

    }


    class Node{
        String key;
        String value;
        public Node(String key, String value) {
            this.key = key;
            this.value = value;
        }

        public String getKey() {
            return key;
        }

        public void setKey(String key) {
            this.key = key;
        }

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }
    }

    // linkedList를 담고 있는 index Array 생성
    LinkedList<Node> [] data;

    HashTable(int size){
        this.data = new LinkedList[size];
    }

}
