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
