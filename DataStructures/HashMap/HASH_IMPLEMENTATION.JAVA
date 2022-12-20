import java.util.*;

public class HashMapCode{
    public static class HashMap<K,V>{   //Generics
    private class Node{
        K key;
        V value;
        public Node(K key,V value){
            this.key=key;
            this.value=value;
        }
    }
    private int n;  //no of nodes
    private int N;  //No of buckets
    private LinkedList<Node> buckets[];
    public HashMap(){
        this.N=4;
        this.buckets=new LinkedList[4];
        for(int i=0;i<4;i++){
            this.buckets[i]=new LinkedList<>();
        }
    }
    
    private int hashFun(K key){
        int bi=Math.abs(key.hashCode());
        return bi%N;
    }
    
    private int searchInLL(K key,int bi){
        LinkedList<Node> ll=buckets[bi];
        for(int i=0;i<ll.size();i++){
            if(key==ll.get(i).key){
                return i;
            }
        }
        return -1;
    }
    private void rehash(){
        LinkedList<Node> oldBuckets[]=buckets;
        buckets=new LinkedList[N*2];
        for(int i=0;i<N*2;i++){
            buckets[i]=new LinkedList<>();
        }
        for(int i=0;i<oldBuckets.length;i++){
            LinkedList<Node> ll=oldBuckets[i];
            for(int j=0;j<ll.size();j++){
                Node node=ll.get(j);
                put(node.key,node.value);
            }
        }
    }
    // private 
    public void put(K key,V value){
        int bi=hashFun(key);    //get bucket index
        int ni=searchInLL(key,bi);  // get node index 
        
        if(ni==-1){       // key doesnt exist
            buckets[bi].add(new Node(key,value));
            n++;
        }
        else{             // key exist
            Node node=buckets[bi].get(ni);
            node.value=value;
        }
        
        double lambda=(double) n/N;
        if(lambda>2.0){
            //rehashing
            rehash();
        }
    }
    
    public V get(K key){
        int bi=hashFun(key);    //get bucket index
        int ni=searchInLL(key,bi);  // get node index 
          if(ni==-1){       // key doesnt exist
           return null;
        }
        else{             // key exist
            Node node=buckets[bi].get(ni);
            return node.value;
        }
        
    }
    public boolean containsKey(K key){
        int bi=hashFun(key);    //get bucket index
        int ni=searchInLL(key,bi);  // get node index 
          if(ni==-1){       // key doesnt exist
           return false;
        }
        else{             // key exist
            return true;
        }
        
    }
    public V remove(K key){
        int bi=hashFun(key);    //get bucket index
        int ni=searchInLL(key,bi);  // get node index 
          if(ni==-1){       // key doesnt exist
           return null;
        }
        else{             // key exist
        Node node= buckets[bi].remove(ni);
        n--;
        return node.value;
        }
    }
    public boolean isEmpty(){
        return n==0;
    }
    public ArrayList<K> keySet(){
        ArrayList<K> keys=new ArrayList<>();
        for(int i=0;i<buckets.length;i++){
            for(int j=0;j<buckets[i].size();j++){
                Node node=buckets[i].get(j);
                keys.add(node.key);
            }
        }
        return keys;
    }
    
    
    
    
        
    }
    
public static void main(String args[]){
    HashMap<String,Integer> map=new HashMap<String,Integer>();
    map.put("India",100);
    map.put("UK",50);
    map.put("USA",25);
   
     ArrayList<String> keys=map.keySet();
     for(int i=0;i<keys.size();i++){
       System.out.println(keys.get(i)+" "+map.get(keys.get(i)));
   }
   System.out.println(map.containsKey("India"));
   System.out.println(map.containsKey("Indddddia"));
   System.out.println(map.remove("UK"));
    ArrayList<String> keys1=map.keySet();
     for(int i=0;i<keys1.size();i++){
       System.out.println(keys1.get(i)+" AFTER REMOVING "+map.get(keys1.get(i)));
   }
    
    
}
}
