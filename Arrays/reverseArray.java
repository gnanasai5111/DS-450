
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
