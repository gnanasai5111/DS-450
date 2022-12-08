class Heap {
    public static void main(String[] args) {
        int a[] = {1, 3, 5, 4, 6, 13, 10, 9, 8, 15, 17};
          // Index of last non-leaf node
      int startIdx = (a.length / 2) - 1;
      for(int i=startIdx;i>=0;i--){
       
          heapify(a,i);
      } 
         System.out.println(Arrays.toString(a));  
    }
    public static void heapify(int a[],int index){
        int leftChildNode=2*index+1;
        int rightChildNode=2*index+2;
          
           int maxIndex=-1;
           if(leftChildNode<a.length && rightChildNode<a.length){
            if(a[leftChildNode]<a[rightChildNode]){
                maxIndex=rightChildNode;
            }
            else{
                maxIndex=leftChildNode;
            }
            if(maxIndex>=0 && a[index]<a[maxIndex]){
                swap(a,index,maxIndex);
                heapify(a,maxIndex);
            }
           }
    }
    public static void swap(int a[],int i,int j){
       int temp=a[i];
       a[i]=a[j];
       a[j]=temp;
    }
}


Time complexity - o(n)
