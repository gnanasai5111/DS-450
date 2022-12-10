
Naive approach -o(nlogn)
 -Sort the array and get the kth element from last if its in ascending order and vice versa.

Heap sort-(o(nlogk))
 
- create a heap by using heapify-o(n).And delete the root and swap it with last element and heapify till we get the
   kth largest/smallest element(delete-o(logk)).
  
  
  class Solution {
    public int findKthLargest(int[] a, int k) {
    //   To get the last non leaf node
    int lastNode=(a.length/2)-1;
       for(int i=lastNode;i>=0;i--){  
           heapify(a,i,a.length);
       }
      for(int i=a.length-1;i>=a.length-k;i--){  
             int temp=a[i];
             a[i]=a[0];
             a[0]=temp;
             heapify(a,0,i);
          
      }
       System.out.println(Arrays.toString(a));
       return a[a.length-k];
        
    }
        public static void heapify(int a[],int index,int N){
        int leftChildIndex=2*index+1;
        int rightChildIndex=2*index+2;
        int largestIndex=index;
        if(leftChildIndex<N && a[leftChildIndex]>a[index]){
            largestIndex=leftChildIndex;
        }
        if(rightChildIndex< N && a[rightChildIndex]>a[largestIndex]){
            largestIndex=rightChildIndex;
        }
        if(largestIndex>=0 && largestIndex != index){
            int temp=a[index];
            a[index]=a[largestIndex];
            a[largestIndex]=temp;
            heapify(a,largestIndex,N);
        }
        
    }
    
}
