Find Min and Max element in an Array
**First Approach**

->Looping through the array and getting min and max.
  
import java.util.*;
class Reverse {
    public static void main(String[] args) {
       int arr[] = {1000, 11, 445, 1, 330, 3000};
       int min=arr[0];
       int max=arr[0];
       for(int i=1;i<arr.length;i++){
           if(arr[i]>max){
               max=arr[i];
           }
           if(arr[i]<min){
               min=arr[i];
           }
       }
        System.out.println("Minimum is:"+min);
        System.out.println("Maximum is:"+max);
    }
}

->Time complexity - o(n)
->Space complexity - o(n)
