class HeapBuild {
    public static void main(String[] args) {
       int a[]= {1, 3, 5, 4, 6, 13, 10, 9, 8, 15, 17};
       for(int i=0;i<a.length;i++){                                         //  loop will run for n times-o(n)
           int j=i;                                               
           while(j>0 && a[j]>a[j%2==0?(j-1)/2:j/2]){                        // comaring the element with parent and swapping - o(logn)
                 int temp=a[j];
                 a[j]=a[j%2==0?(j-1)/2:j/2];
                 a[j%2==0?(j-1)/2:j/2]=temp;
                 j=j%2==0?(j-1)/2:j/2;
           }          
       }
      System.out.println(Arrays.toString(a));                             //   overall -o(nlogn)
    }
}
