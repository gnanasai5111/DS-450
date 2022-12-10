// Heapify and Delete root node - heap sort(o(nlogn))

class Heapify {
    public static void main(String[] args) {
       int a[]= {1, 3, 5, 4, 6, 13, 10, 9, 8, 15, 17};
    //   To get the last non leaf node
    int lastNode=(a.length/2)-1;
       for(int i=lastNode;i>=0;i--){  
           heapify(a,i,a.length);
       }
      for(int i=a.length-1;i>0;i--){  
             int temp=a[i];
             a[i]=a[0];
             a[0]=temp;
             heapify(a,0,i);
          
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
        if(largestIndex>=0 &&  largestIndex != index){
            int temp=a[index];
            a[index]=a[largestIndex];
            a[largestIndex]=temp;
            heapify(a,largestIndex,N);
        }
        
    }
}
