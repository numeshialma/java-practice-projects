package Session_20_Collections_in_Java_ArrayList_HashSet_HashMap.task_04;

import java.util.HashMap;

public class HashMapDemo3 {
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

        // 1. Using for..each
        for (int k : hm.keySet()){
            System.out.println(k+ "  " +hm.get(k));
        }

        /* Output :
            101  John
            102  David
            103  Mary
            104  Scott
         */

    }
}
