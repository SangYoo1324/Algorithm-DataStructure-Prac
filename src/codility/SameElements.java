package codility;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SameElements {
    public static void main(String[] args) {

    }
    static boolean sameElemnts(Object[] array1, Object[]array2){
        Set<Object> uniqueEl1 = new HashSet<Object>(Arrays.asList(array1));
        Set<Object> uniqueEl2 = new HashSet<Object>(Arrays.asList(array2));
    if(uniqueEl1.size() != uniqueEl2.size()) return false;

    for(Object el : uniqueEl1){
        if(!uniqueEl2.contains(el)) return false;
    }
    return true;
    }
}
