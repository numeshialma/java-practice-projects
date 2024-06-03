package Session_20_Collections_in_Java_ArrayList_HashSet_HashMap.task_04;

import java.util.HashMap;

public class HashMapDemo2 {
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

        /* OutPut :
        {101=John, 102=David, 103=Mary, 104=Scott}

        Note : old value replaced with new value.
         */

        // Size of HashMap
        System.out.println("Size of hashmap : " +hm.size());

        /* OutPut :
        Size of hashmap : 4
         */

        // Remove one pair
        hm.remove(103);
        System.out.println("After removing pair: " +hm);

        /* OutPut :
        After removing pair: {101=John, 102=David, 104=Scott}
         */

        // Access value of the key
        System.out.println(hm.get(102));

        /* OutPut :
        David
         */

        // get all the key from hashmap
        System.out.println(hm.keySet());

        /* OutPut :
        [101, 102, 104]
         */

        // get all values from hashmap
        System.out.println(hm.values());

        /* OutPut :
        [John, David, Scott]
         */


        System.out.println(hm.entrySet());

        /* OutPut :
        [101=John, 102=David, 104=Scott]
         */

    }
}
