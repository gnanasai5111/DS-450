# Brute force approach 
- Sort the array(Time complexity - o(nlogn)
                 

Another approach is to take temporary array and loop through the arrays three times to get 0s,1s, and 2s.
                 
class Arrange
{
    public static void Arrange()
    {
      int a[]={0, 2, 1, 2, 0};
       int res[]=new int[a.length];
       int j=0;
       for(int i=0;i<a.length;i++){
           if(a[i]==0){
               res[j]=0;
               j++;
           }
       }
       for(int i=0;i<a.length;i++){
           if(a[i]==1){
               res[j]=1;
               j++;
           }
       }
       for(int i=0;i<a.length;i++){
           if(a[i]==2){
               res[j]=2;
               j++;
           }
       }
    }
}
                 
Time Complexity -o(3n)-o(n)
space complexity -o(n)
                 
Dutch National Flag alogorithm -(Three Pointer approach)

Three pointers-Low,mid,high
mid loops through the array ,if it encounters zero,it swaps with low ,if it encounters one it skips,if it encounters two,it swaps with 2.Swapping 
is fone in the way such that (0 to low-1) containns 0 (low to high) contains 1 and (high+1 to n) contains 2.
                 
                 
class Arrange
{
    public static void Arrange(int a[], int n)
    {
     int low=0;
     int mid=0;
     int high=a.length-1;
     while(mid<=high){
         if(a[mid]==0){
             int temp=a[mid];
             a[mid]=a[low];
             a[low]=temp;
             mid++;
             low++;
             
         }
         else if(a[mid]==1){
            mid++;
         }
          else if(a[mid]==2){
             int temp=a[mid];
             a[mid]=a[high];
             a[high]=temp;
             high--;
         }
     }
        
    }
}
                 
 Time complexity -o(n)
 Space complexity- o(1)
                 
                 
