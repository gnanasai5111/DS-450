
  class HeapBuild {
      public static void main(String[] args) {
          int a[] = {1, 3, 5, 4, 6, 13, 10, 9, 8, 15, 17};
        for(int i=0;i<a.length;i++){                              //   o(n) since its looping entire array
            rearrange(a,i);  
        } 
         System.out.println(Arrays.toString(a));   
      }
      public static void rearrange(int a[],int index){            //   o(logn) since we compare the index with its ancestors.
          while(index>0 && a[index]>a[getParentIndex(index)]){
              int temp=a[index];
              a[index]=a[getParentIndex(index)];
              a[getParentIndex(index)]=temp;
              index=getParentIndex(index);
          }
      }
      public static int getParentIndex(int index){
          return index%2==0?(index-1)/2:index/2;
      }
  }                                                                //  overall - o(nlogn)  o/p-[17, 15, 10, 8, 13, 3, 6, 1, 5, 4, 9]
