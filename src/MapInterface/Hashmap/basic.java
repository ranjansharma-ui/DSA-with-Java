package MapInterface.Hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.*;

class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());

        for (int num : nums) {
            pq.add(num);
        }

        for (int i = 0; i < k - 1; i++) {
            pq.poll(); // remove the largest k-1 times
        }

        return pq.peek(); // k-th largest
    }
}

public class basic {
    static void HashMapMethods(){
        //Syntax
        Map<String,Integer> mp = new HashMap<>();
        //Adding Elements
        mp.put("Akash",34);
        mp.put("Yash",50);
        mp.put("Lash",16);
        mp.put("Lav",17);
        mp.put("Rishika",19);
        mp.put("Harry",18);
        //Getting value of a key from the HashMap
        System.out.println(mp.get("Lav")); // 17
        System.out.println(mp.get("rahul")); // null
        //Changing value of a key in the Hashmap
        mp.put("Akash",25); //Akash -> 25
        System.out.println(mp.get("Akash"));
        //Removing a pair from the Hashmap

        System.out.println(mp.remove("Akash")); //25
        System.out.println(mp.remove("Riya")); //null
        //Checking if a key is in the Hashmap
        System.out.println(mp.containsKey("Akash")); // false
        System.out.println(mp.containsKey("Lav")); // true
        //Adding a new entry only if the new key doesn't exist already
        mp.putIfAbsent("Yashika",30); // will enter
        mp.putIfAbsent("Yash",30); // will not enter
        //Get all key in the Hashmap
        System.out.println(mp.keySet());
        //Get all entries in the Hashmap
        System.out.println(mp.values());
        //Traversing all entries of Hashmap - multiple methods
        System.out.println(mp.entrySet());

        for (String key : mp.keySet()){
            System.out.printf("Age of %s is %d\n", key,mp.get(key));
        }
        System.out.println();


        for(Map.Entry<String,Integer> e : mp.entrySet()){
            System.out.printf("Age of %s is %d\n", e.getKey(),e.getValue());
        }
        System.out.println();

        for(var e : mp.entrySet()){
            System.out.printf("Age of %s is %d\n", e.getKey(),e.getValue());
        }

    }




    public static void main(String[] args) {
//        HashMapMethods();
        Solution s = new Solution();
        int[] arr = {3,2,1,5,6,4};

        System.out.println(s.findKthLargest(arr,2));

    }
}
