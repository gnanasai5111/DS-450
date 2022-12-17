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
