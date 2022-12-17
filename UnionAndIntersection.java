class Union{
    public static int doUnion(int a[], int n, int b[], int m) 
    {
        //Your code here
        HashSet<Integer> set1=new HashSet<Integer>();
        for(int i=0;i<a.length;i++){
            set1.add(a[i]);
        }

        for(int i=0;i<b.length;i++){
            set1.add(b[i]);
        }
        return set1.size();
    }
}
TimeComplexity -o(mlogm+nlogn) -(its beacuse insertion takes o(logn) in ordered set and o(1) in unorderes set)-(same approach for both sorted and unsorted)
SpaceComplexity -o(m+n).
  
we can solve this approach in Hashmap same way

Another approach(only for sorted array)

class   union {
    public static void main(String[] args) {
        int a1[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int a2[] = {2, 3, 4, 4, 5, 11, 12}; 
        int i=0;
        int j=0;
        ArrayList<Integer> res=new ArrayList<Integer>();
        while(i<a1.length &&  j<a2.length){
            if(a1[i]<=a2[j]){
                if(res.size()==0 || res.get(res.size()-1)!=a1[i]){
                res.add(a1[i]);
                }
                i++;
            }
            else {
                if(res.size()==0 || res.get(res.size()-1)!=a2[j]){
                res.add(a2[j]);
                }
                j++;
            }

        }
        while(i<a1.length){
            res.add(a1[i]);
            i++;
        }
        while(j<a2.length){
            res.add(a2[j]);
            j++;
        }
        System.out.println(res);
    }
}
TimeComplexity -o(m+n) 
SpaceComplexity -o(m+n).
  
  
//   Intersection 
  
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
       
        HashSet<Integer> a=new HashSet<Integer>();
         HashSet<Integer> b=new HashSet<Integer>();
         for(int i=0;i<nums1.length;i++){
          a.add(nums1[i]);
         }
         for(int i=0;i<nums2.length;i++){
             if(a.contains(nums2[i])){
                 b.add(nums2[i]);
             }
           
         }
          int res[]=new int[b.size()];
          int count=0;
            for(Integer i:b){
                   res[count++]=i;
                }
                return res;

        
    }
}
  
