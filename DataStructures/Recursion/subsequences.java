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

// print all subsequences whose sum is equal to given sum.


class HelloWorld {
    public static void subSum(ArrayList<Integer> res,int idx,int sum,ArrayList<Integer> sub,int tempSum){
        
        if(res.size()==idx){
        if(tempSum==sum){
           System.out.println(sub); 
        }
            return ;
        }
        sub.add(res.get(idx));
        tempSum=tempSum+res.get(idx);
        subSum(res,idx+1,sum,sub,tempSum);
        tempSum=tempSum-res.get(idx);
        sub.remove(res.get(idx));
        subSum(res,idx+1,sum,sub,tempSum);
    }
    public static void main(String[] args) {
       ArrayList<Integer> res=new ArrayList<Integer>();
       ArrayList<Integer> sub=new ArrayList<Integer>();
       res.add(1);
       res.add(2);
       res.add(1);
       int sum=2;
       subSum(res,0,2,sub,0);
       
    }
}



// return the first subsequence whose sum is equal to given sum

import java.util.*;
class HelloWorld {
    public static boolean subSum(ArrayList<Integer> res,int idx,int sum,ArrayList<Integer> sub,int tempSum){
        
        if(res.size()==idx){
        if(tempSum==sum){
           System.out.println(sub); 
           return true;
        }
            return false;
        }
        sub.add(res.get(idx));
        tempSum=tempSum+res.get(idx);
        if(subSum(res,idx+1,sum,sub,tempSum)==true){
            return true;
        }
        tempSum=tempSum-res.get(idx);
        sub.remove(res.get(idx));
        if(subSum(res,idx+1,sum,sub,tempSum)==true){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
       ArrayList<Integer> res=new ArrayList<Integer>();
       ArrayList<Integer> sub=new ArrayList<Integer>();
       res.add(1);
       res.add(2);
       res.add(1);
       int sum=2;
       subSum(res,0,2,sub,0);
       
    }
}


// count no of subsequences whose sum is equal to the given sum

import java.util.*;
class HelloWorld {
    public static int subSum(ArrayList<Integer> res,int idx,int sum,ArrayList<Integer> sub,int tempSum){
        
        if(res.size()==idx){
        if(tempSum==sum){
           return 1;
        }
            return 0;
        }
        sub.add(res.get(idx));
        tempSum=tempSum+res.get(idx);
        int l=subSum(res,idx+1,sum,sub,tempSum);
        tempSum=tempSum-res.get(idx);
        sub.remove(res.get(idx));
        int r=subSum(res,idx+1,sum,sub,tempSum);
        return l+r;
    }
    public static void main(String[] args) {
       ArrayList<Integer> res=new ArrayList<Integer>();
       ArrayList<Integer> sub=new ArrayList<Integer>();
       res.add(1);
       res.add(2);
       res.add(1);
       int sum=2;
       System.out.println(subSum(res,0,2,sub,0));
       
    }
}
