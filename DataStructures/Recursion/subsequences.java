### Subsequences-A contigious or non -contigious sequence ,which follows order.
  
class SubSequences {
    public static void subseq(String s,int idx,String newString){
        if(idx==s.length()){
            System.out.println(newString+" ");
            return ;
        }
        subseq(s,idx+1,newString+s.charAt(idx));  //take it 
        subseq(s,idx+1,newString);                // not take it
    }
    public static void main(String[] args) {
       String s ="abc";
       subseq(s,0,"");
       
    }
}  




import java.util.*;
class SubSequences {
    public static void subseq(ArrayList<Integer> a,int idx,ArrayList<Integer> res){
        if(idx==a.size()){
            System.out.println(res);
            return ;
        }
        res.add(a.get(idx));
        subseq(a,idx+1,res);
        res.remove(a.get(idx));
        subseq(a,idx+1,res);
    }
    public static void main(String[] args) {
       ArrayList<Integer> a=new ArrayList<Integer>();
       ArrayList<Integer> res=new ArrayList<Integer>();
       a.add(3);
       a.add(1);
       a.add(2);
       subseq(a,0,res);
       
    }
}
