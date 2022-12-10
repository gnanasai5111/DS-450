class Heapify {
    public static void main(String[] args) {
       int a[]= {1, 3, 5, 4, 6, 13, 10, 9, 8, 15, 17};
    //   To get the last non leaf node
    int lastNode=(a.length/2)-1;
       for(int i=lastNode;i>=0;i--){  
           heapify(a,i,a.length);
       }
       System.out.println(Arrays.toString(a));
    }
    public static void heapify(int a[],int index,int N){
        int leftChildIndex=2*index+1;
        int rightChildIndex=2*index+2;
        int largestIndex=-1;
        if(leftChildIndex<N && a[leftChildIndex]>a[index]){
            largestIndex=leftChildIndex;
        }
        if(rightChildIndex< N && a[rightChildIndex]>a[largestIndex]){
            largestIndex=rightChildIndex;
        }
        if(largestIndex>=0){
            int temp=a[index];
            a[index]=a[largestIndex];
            a[largestIndex]=temp;
            heapify(a,largestIndex,N);
        }
        
    }
}



Time complexity - o(n)

 Since you are only looping through non leaf nodes,the time complexity for that would be o(n/2) and when you call heapify each element will swap at most 
 the height of the node i.e o(h).


Which implementation for buildHeap is more efficient?
Both of these solutions will produce a valid heap. Unsurprisingly, the more efficient one is the second operation that uses siftDown(heapify).

Let h = log n represent the height of the heap. The work required for the siftDown approach is given by the sum

(0 * n/2) + (1 * n/4) + (2 * n/8) + ... + (h * 1).
Each term in the sum has the maximum distance a node at the given height will have to move (zero for the bottom layer, h for the root)
multiplied by the number of nodes at that height. In contrast, the sum for calling siftUp on each node is

(h * n/2) + ((h-1) * n/4) + ((h-2)*n/8) + ... + (0 * 1).
It should be clear that the second sum is larger. The first term alone is hn/2 = 1/2 n log n, so this approach has complexity at best O(n log n).
 

    
