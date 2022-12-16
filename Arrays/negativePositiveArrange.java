An array contains both positive and negative numbers in random order.
Rearrange the array elements so that all negative numbers appear before all positive numbers.
  
Brute force - Sort the array -o(nlogn)

  
Two pointer approach

class Arrange {
    public static void main(String[] args) {
         int[] a = { -1, 2, -3, 4, 5, 6, -7, 8, 9 };
         int i=0;
         int j=a.length-1;
         while(i<=j){
             if(a[i]<0){
                 i++;
             }
             if(a[j]>0){
                 j--;
             }
             if(a[i]>0 && a[j]<0){
                 int temp=a[i];
                 a[i]=a[j];
                 a[j]=temp;
                 i++;
                 j--;
             }
         }
         System.out.println(Arrays.toString(a));
    }
}

Time complexity -o(n)
space complexity -o(1)
  
Dutch National Flag alogorithm(Two pointer )
  
Swap the elements  such that (0 to low-1) contains negative numbers and (high+1 to n) contains positive
  
  
  
class HelloWorld {
    public static void main(String[] args) {
         int[] a = { -1, 2, -3, 4, 5, 6, -7, 8, 9 };
         int low=0;
         int high=a.length-1;
         while(low<=high){
             if(a[low]<0){
                 low++;
             }
             else{
                 int temp=a[low];
                 a[low]=a[high];
                 a[high]=temp;
                 high--;
                 
             }
           
         }
         System.out.println(Arrays.toString(a));
    }
}

Time complexity -o(n)
space complexity -o(1)

