// before writing this do heap build then Delete root node and it forms heap sort

class HelloWorld {
    public static void main(String[] args) {
        int a[]={17, 15, 10, 8, 13, 3, 6, 1, 5, 4, 9};
        int j=0;
        for(int i=a.length-1;i>0;i--){
            swap(i,0,a);
            rearrange(i,0,a);
             System.out.println(Arrays.toString(a));
        }
       
       
    }
    public static void swap(int i,int j,int a[]){
        int temp=a[i];
        a[i]=a[j];
        a[j]=temp;
    }
    public static void rearrange(int N,int i,int a[]){
   
           int  leftChild=2*i+1;
           int rightChild=2*i+2;
           int index=-1;
           if(leftChild<N && rightChild<N){
           if(a[leftChild]<a[rightChild]){
               index=rightChild;
           }
           else{
               index=leftChild;
           }
           if(index>=0 && a[i]<a[index]){
               swap(i,index,a);
               rearrange(N,index,a);
           }
           }
           else if(leftChild<N){
               index=leftChild;
           if(index>=0 && a[i]<a[index]){
               swap(i,index,a);
               rearrange(N,index,a);
           }
           }
            
        
        
    }
