package Session_20_Collections_in_Java_ArrayList_HashSet_HashMap.task_04;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapDemo4 {
    public static void main(String[] args) {

        // declaration

        HashMap<Integer,String> hm = new HashMap<Integer,String>();

        // Adding pairs
        hm.put(101,"John");
        hm.put(102,"Scott");
        hm.put(103,"Mary");
        hm.put(104,"Scott");
        hm.put(102,"David");

        System.out.println(hm);
        
        // Reading data from hashmap

        // 2 . Using Iterator

        Iterator<Map.Entry<Integer, String>> it = hm.entrySet().iterator();   // Entry<Integer, String> ==> auto suggested return type

        while (it.hasNext()){
            Map.Entry<Integer,String> entry = it.next();
            System.out.println(entry.getKey()+ "  " +entry.getValue());
        }
        /* Output :
            101  John
            102  David
            103  Mary
            104  Scott
         */

    }
}
