package Session_20_Collections_in_Java_ArrayList_HashSet_HashMap.task_04;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapDemo5 {
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
        
        //
        hm.clear();
        System.out.println(hm.isEmpty());

        /* Output :
            true
         */

    }
}
