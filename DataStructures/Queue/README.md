- It is an ordered list of objects, where insertion of elements occurs at the end of the list(rear), and removal of elements occur 
  at the beginning of the list(front).
- It follows First in first out structure(FIFO)


**Operation 

```

Enque - add
Dequeue - remove
Front - peek 
```

***Implementation

Arrays,arraylist and linkedlist


```
class QueueCode {
    public static class Queue{
        int a[];
        int size;
        int rear=-1;
        public Queue(int size){
            a=new int[size];
            this.size=size;
        }
        public boolean isEmpty(){
            return rear==-1;
        }
        public void add(int data){
            if(rear==size-1){
                System.out.println("Full Queue");
                return ;
            }
            rear++;
            a[rear]=data;
        }
         public int remove(){
            if(rear==-1){
                System.out.println("Empty Queue");
                return -1 ;
            }
            int top=a[0];
            for(int i=0;i<rear;i++){
                a[i]=a[i+1];
            }
            rear--;
            return top;
        }
          public int peek(){
            if(rear==-1){
                System.out.println("Empty Queue");
                return -1;
            }
           return a[0];
        }
    }
    public static void main(String[] args) {
      Queue q=new Queue(5);
      q.add(10);
      q.add(20);
      q.add(30);
      q.remove();
      while(!q.isEmpty()){
          System.out.println(q.peek());
          q.remove();
          
      }
    }
}
```

*** Circular queue

A circular queue is the extended version of a regular queue where the last element is connected to the first element.
Thus forming a circle-like structure.


```
class QueueCode {
    public static class CQueue{
        int a[];
        int size;
        int rear=-1;
        int front=-1;
        public CQueue(int size){
            a=new int[size];
            this.size=size;
        }
        public boolean isEmpty(){
            return rear==-1 && front==-1;
        }
        public boolean isFull(){
            return (rear+1)%size==front;
        }
        public void add(int data){
            if(isFull()){
                System.out.println("Full Queue");
                return ;
            }
            if(front==-1){
                front=0;
            }
            rear=(rear+1)%size;
            a[rear]=data;
        }
         public int remove(){
            if(isEmpty()){
                System.out.println("Empty Queue");
                return -1 ;
            }
            int top=a[front];
            // single elemnt condition
            if(rear==front){
                rear=-1;
                front=-1;
            }
            else{
                front=(front +1)%size;
            }
            return top;
        }
          public int peek(){
            if(isEmpty()){
                System.out.println("Empty Queue");
                return -1;
            }
           return a[front];
        }
    }
    public static void main(String[] args) {
      CQueue q=new CQueue(6);
      q.add(10);
      q.add(20);
      q.add(30);
      q.add(40);
      q.add(50);
      q.remove();
      q.add(6);
      q.remove();
      while(!q.isEmpty()){
          System.out.println(q.peek());
          q.remove();
          
      }
    }
}
```


##LinkedList

```
class QueueCode {
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            next=null;
            
        }
    }
    public static class Queue{
         Node head=null;
         Node tail=null;
        public boolean isEmpty(){
            return head==null && tail==null;
        }
      
        public void add(int data){
            Node node=new Node(data);
            if(tail==null){
              tail=node;
              head=node;
              return ;
            }
            else{
              tail.next=node;
              tail=node;   
            }
           
          
        }
         public int remove(){
              if(isEmpty()){
                System.out.println("Empty Queue");
                return -1;
            }
           int front=head.data;
           if(head==tail){
               tail=null;
           }
           head=head.next;
           return head.data;
        }
          public int peek(){
            if(isEmpty()){
                System.out.println("Empty Queue");
                return -1;
            }
           return head.data;
        }
    }
    public static void main(String[] args) {
      Queue q=new Queue();
      q.add(10);
      q.add(20);
      q.add(30);
      q.add(40);
      q.add(50);
      q.remove();
      q.add(6);
      q.remove();
      while(!q.isEmpty()){
          System.out.println(q.peek());
          q.remove();
          
      }
    }
}
```


### Queue using two stacks

```
class QueueCode {
    public static class Queue{
         Stack<Integer> s1=new Stack<>();
         Stack<Integer> s2=new Stack<>();
         
         public  boolean isEmpty(){
             return s1.size()==0;
         }
         public void add(int data){
             while(!s1.isEmpty()){
                 s2.push(s1.pop());
             }
             s1.push(data);
             while(!s2.isEmpty()){
                 s1.push(s2.pop());
             }
         }
         public int remove(){
             if(s1.isEmpty()){
                 System.out.println("Empty Queue");
                 return -1;
             }
             int res=s1.pop();
             return res;
         }
          public int peek(){
             if(s1.isEmpty()){
                 System.out.println("Empty Queue");
                 return -1;
             }
             int res=s1.peek();
             return res;
         }
        }
    
    public static void main(String[] args) {
      Queue q=new Queue();
      q.add(10);
      q.add(20);
      q.add(30);
      q.add(40);
      q.add(50);
      q.remove();
      q.add(6);
      q.remove();
      while(!q.isEmpty()){
          System.out.println(q.peek());
          q.remove();
          
      }
    }
}
```
