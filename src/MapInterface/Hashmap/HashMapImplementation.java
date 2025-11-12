package MapInterface.Hashmap;
import java.util.*;
public class HashMapImplementation {

    static class MyHashMap<K, V>{
        public static  final int  DEFAULT_CAPACITY = 4;
        public static  final float  DEFAULT_LOAD_FACTOR = 0.75f;

        private class Node {
            K key;
            V value;

            Node(K key, V value){
                this.key = key;
                this.value = value;
            }
        }



        private int n; // the number of entries in map
        private LinkedList<Node>[] buckets;

        private void initBuckets(int N){ // N- capacity/size of buckets array
            buckets = new LinkedList[N];
            for(int i=0; i<buckets.length; i++){
                buckets[i] = new LinkedList<>();
            }
        }

        public int capacity() {
            return buckets.length;
        }

        public float load(){
            return (n*1.0f)/buckets.length;
        }

        private int HashFunc(K key){
            int hc = key.hashCode();
            return (Math.abs(hc)) % buckets.length;
        }

        private int searchInBucket(LinkedList<Node> ll,K key){
            //Traverse the ll and looks for a node with key, if found it returns it's index otherwise it return null
            for (int i=0; i<ll.size(); i++){
                if (ll.get(i).key == key){
                    return i;
                }

            }
            return -1;

        }

        public MyHashMap(){
            initBuckets(DEFAULT_CAPACITY);

            
        }

        private void rehash(){
            LinkedList<Node>[] oldBuckets = buckets;
            initBuckets(oldBuckets.length * 2);
            n = 0;
            for (var bucket : oldBuckets){
                for (var node : bucket){
                    put(node.key, node.value);
                }
            }

        }


        public int size() { // return number of entries in map
            return n;
        }

        public void put(K key, V value) {// insert/update
            int bi = HashFunc(key);
            LinkedList<Node> currBucket = buckets[bi];
            int ei = searchInBucket(currBucket,key);

            if (ei == -1){
                Node newNode = new Node(key,value);
                currBucket.add(newNode);
                n++;
            } else {
                //update
                Node currNode = currBucket.get(ei);
                currNode.value =value;
            }

            if (n >= buckets.length * DEFAULT_LOAD_FACTOR){
                rehash();
            }

        }
        public V get(K key){
            int bi = HashFunc(key);
            LinkedList<Node> currBucket = buckets[bi];
            int ei = searchInBucket(currBucket,key);

            if (ei != -1){//key exits
                Node currNode = currBucket.get(ei);
                return currNode.value;
            }
            // key do not exit
            return null;
        }

        public V remove(K key){
            int bi = HashFunc(key);
            LinkedList<Node> currBucket = buckets[bi];
            int ei = searchInBucket(currBucket,key);

            if (ei != -1){
                Node currNode = currBucket.get(ei);
                V val = currNode.value;
                currBucket.remove(ei);
                n--;
                return val;
            }
            return null;


        }

    }

    public static void main(String[] args) {
        MyHashMap<String, Integer> mp = new MyHashMap<>();
        System.out.println("Testing put");
        mp.put("a",1);
        mp.put("b",2);
        System.out.println("Capacity:"+mp.capacity()); //4
        System.out.println("load :"+mp.load()); // <0.75
        mp.put("c",3);
        mp.put("d",61);
        mp.put("e",71);
        System.out.println("Capacity:"+mp.capacity()); //8
        System.out.println("load :"+mp.load()); // <0.75

//        System.out.println("Testing size "+mp.size());
//        mp.put("c",30);
//        System.out.println("Testing size "+mp.size());
//
//        //Testing get
//        System.out.println(mp.get("a"));
//        System.out.println(mp.get("b"));
//        System.out.println(mp.get("c"));
//        System.out.println(mp.get("college"));
//
//        int v = mp.remove("a");
//        System.out.println(v);


    }
}
