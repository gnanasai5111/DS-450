# Stack

Stack is a linear data structure that follows Last in first out(LIFO) 

## Operations

```
**push(val)** - pushes the val element at the top of stack
**pop()**   - removes the top most element of stack
**peek()**  -returns the top most element of stack
```

Implementation 
-Array,Arraylist and linkedlist

### using linkedlist
```
class StackClass {
    static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            next=null;
        }
    }
    static class Stack{
        public Node head;
        public boolean isEmpty(){
            return head==null;
            
        }
        public  void push(int data){
            Node node=new Node(data);
            if(head==null){
                head=node;
            }
            else{
              node.next=head;
              head=node;
            }
        }
        public int pop(){
            if(isEmpty()){
                return -1;
            }
            int top=head.data;
            head=head.next;
            return top;
        }
        public int peek(){
             if(isEmpty()){
                return -1;
            }
            return head.data;
            
        }
    }
    public static void main(String[] args) {
        Stack s=new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
}
```

## using arraylist
```
import java.util.*;
class StackClass {
    static class Stack{
        ArrayList<Integer> list=new ArrayList<>();
        public boolean isEmpty(){
            return list.size()==0;
        }
        public  void push(int data){
            list.add(data);
        }
        public int pop(){
            if(isEmpty()){
                return -1;
            }
            int top=list.get(list.size()-1);
            list.remove(list.size()-1)
           return ;
        }
        public int peek(){
            if(isEmpty()){
                return -1;
            }
            return list.get(list.size()-1);
            
        }
    }
    public static void main(String[] args) {
        Stack s=new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
}
```
