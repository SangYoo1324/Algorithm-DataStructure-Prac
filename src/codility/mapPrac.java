package codility;

import java.util.*;



public class mapPrac {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        map.put("a", 100);
        map.put("b", 100);
        map.put("c", 100);

        Set set = map.entrySet();
        Iterator it  = set.iterator();
        while(it.hasNext()) {
            Map.Entry e = (Map.Entry)it.next();
            System.out.println("name: "+e.getKey()+" score: "+e.getValue());
        }

        set = map.keySet();
        System.out.println("participants: "+set);// keyset 전체 출력

        Integer sum =map.values().stream().reduce(0,(total,y)->total+y);
        Optional<Integer> sumOp = map.values().stream().reduce((x,y)->x+y);
        System.out.println(sum);
        sumOp.ifPresent(System.out::println);


    }
}
