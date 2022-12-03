
**First Approach**

->Create an temporary array and copy the contents of one array to other array .
  
  class Reverse {
    public static void main(String[] args) {
        int arr[] = {1, 4,2, 3};
        int res[]=new int[arr.length];
        for(int i=0;i<res.length;i++){
            res[i]=arr[arr.length-1-i];
        }
        System.out.println(Arrays.toString(res));
        
    }
}

-> Time Complexity - o(n) 
(Since you are looping through the entire array).
-> Space Complexity - o(n)
 (Since we used the temporary array to store the result). 
  
**Second Approach**

->We Can further optimise this code by not using the temorary array and doing in place shifting in array.
  
  
  class Reverse {
    public static void main(String[] args) {
        int arr[] = {1, 4,5,2, 3};
       int start=0;
       int end=arr.length-1;
       while(start<end){
           int temp=arr[start];
           arr[start]=arr[end];
           arr[end]=temp;
           start++;
           end--;
       }
        System.out.println(Arrays.toString(arr));
        
    }
}

-> Time Complexity - o(n) 
(Since you are looping through the entire array).
-> Space Complexity - o(1)
 (Since we did it in in-place). 
