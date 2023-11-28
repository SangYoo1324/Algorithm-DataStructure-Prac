package codility.bst;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapFrequency {
    public static void main(String[] args) {
        String[] data = {"a", "b", "c", "d", "e", "f", "a", "h", "i", "k", "k"};
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        for(String str : data) {
            if(map.containsKey(str)){
                int value = map.get(str);
                map.put(str,value+1);
            }else{
                map.put(str,1);//해당 값 없으면 1을 넣어줌
            }
        }
        System.out.println(map.entrySet());
        Iterator it = map.entrySet().iterator();
        while(it.hasNext()){
            Map.Entry entry = (Map.Entry)it.next();
            int value = (int)entry.getValue();
            System.out.println(entry.getKey()+" : "+value);
        }

    }
}
