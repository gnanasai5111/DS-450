# Hash Map and Hash Set

## Hash Map
- Hash Map class implements the Map interface which allows us to store key,value pair.
- Keys are different and values can be same.
- If you try to insert a duplicate key,it will replace the value of that corresponding key.
- HashMaps are unordered maps(not in order).

## Hash Set(unique values)
- The HashSet class implements the Set interface, backed by a hash table which is actually a HashMap instance 
- HashSets are unordered

```
import java.util.*;
public class Hashing{
    public static void main(String args[]){
    //HashMap
    HashMap<String,Integer> map=new HashMap<String,Integer>();
    //Insertion
    map.put("India",120);
    map.put("Australia",40);
    
    // get the element
    map.get("India");  //gets the value
    
    // search
    map.containsKey();  //gives boolean
    
    //Iteration
    for(Map.Entry<String,Integer> m:map.entrySet()){
         System.out.println(m.getKey()+" "+m.getValue());    
 
    }
    map.keySet()  //iterating through keys
    
    //remove
    map.remove(key)  
    
    //HashSet
    HashSet<String> set=new HashSet<String>();
    //Insert
    set.add("ss");
    
    //search
    set.contains("ss"); //returns boolean
    
    //delete
    set.remove("ss");
    
    //Iterator
    Iterator it=set.iterator();
    
    while(it.hasNext()){
    System.out.println(it.next());
    }
    }
    
}
```



### Implementation

- HashMap is array of nodes(Linked list)
- each index in array is called bucket.

- we will send a key as a input to hash function and it returns the bucket index.In that bucket index we will store the key-value pair if it not exists,if it   already exists ,then update the value.

####Constructors in HashMap is as follows:
-> HashMap provides 4 constructors and the access modifier of each is public which are listed as follows:

- HashMap();
- HashMap(int initialCapacity);
- HashMap(int initialCapacity, float loadFactor);
- HashMap(Map map);

**LoadFactor** - It is percent value of capacity,after which capacity has to be increased.This is called Rehashing.Default Load factor in java is 0.75.If the array of buckets gets filled more than 75% then the it has to rehashed(i.e, capacity has to be doubled).

**Threshold** -product of Load Factor and Initial Capacity.

Default Initial capacity-16
Default load factor-0.75
Threshold=16*0.75=12.

That is, Rehashing takes place after inserting 12 key-value pairs into the HashMap.

**Rehashing** – It is the process of doubling the capacity of the HashMap after it reaches its Threshold. 

