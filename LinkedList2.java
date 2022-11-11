
package javaapplication8;

/**
 *
 * @author Koica
 */
public class LinkedList2 {

    class Node {
        int data;
        Node next;

        public Node() {
            next = null;
        }

        public Node(int a) {
            data = a;
            next = null;
        }
    }
    Node head;
    Node tail;
    int size;

    public LinkedList2() {
        head = null;
        tail = null;
        size = 0;

    }

    public LinkedList2(int a) {
        Node newNode = new Node(a);
        head = newNode;
        tail = newNode;
        size = 1;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size() == 0;

    }

    public void insertAtFront(int a) {
        Node newNode = new Node(a);
        if (isEmpty()) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
        size++;

    }

    public  void insertAtBack(int b){
        Node  newNode  =  new Node(b);
        if (isEmpty()) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }


  
    public   String toString(){ 
        String S =  new String("");
        if (!isEmpty()) {
            Node current = head;
            S += "[";
            while (current != null) {
                S += ","+current.data;
                current = current.next;
            }
            S += "]";
        }
        return  S;
    }
	
    public LinkedList2 concantenate(LinkedList2  l) {
     if(l.head == null){
        return null;
     }
     else{
        Node current  =  l.head;
        while (current !=null) {
            insertAtBack(current.data);
            current =  current.next;
        }
     }
       return this;
    }

    public  boolean isSorted(LinkedList2 l){
         boolean output = true;
        Node current = l.head;
        while (current.next != null) {
            if (current.data > current.next.data) {
               output =false;
            }
            current = current.next;
        }
        return output;
    }
     public   LinkedList2  merge(LinkedList2 l){ 
     if(!(isSorted(l) && isSorted(this))){
        return null;
     }
     else{
        this.concantenate(l);
        System.out.println(this.toString());
        Node current = this.head, index = null;  
        int temp;    
            while(current != null) {  
                index = current.next;  
                while(index != null) {  
                    if(current.data > index.data) {  
                        temp = current.data;  
                        current.data = index.data;  
                        index.data = temp;  
                    }  
                    index = index.next;  
                }  
                current = current.next;  
            }      
        }  

     return this;
    }

    
}

