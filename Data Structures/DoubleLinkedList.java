/* 
Author : Jayaprakash Aluri @ IIIT Hyderabad
Double Linked list with few methods
1. insert at First
2. insert at Last
3. delete at last
4. delete at first
5. length of linked list
6. show linked list in Forward Direction
7. show linked list in Backward Direction

*/ 


import java.util.NoSuchElementException;

public class DoubleLinkedList {
    // Double Linked list parameters
    Node head;
    Node tail;
    int listCounter;

    //Node class
    class Node{
        Node next;
        Node previous;
        int data;

        // constructor for Node
        Node(int data){
            this.data = data;
            this.next = null;
            this.previous = null;
        }
    }

    // Insert at First Node
    public void insertFirst(int data){
        Node newNode = new Node(data);
        if(head == null || tail == null){
            head = newNode;
            tail = newNode;
            listCounter++;   // LinkedList length counter
            return;
        }
        head.previous = newNode;
        newNode.next = head;
        head = newNode;
        listCounter++;   // LinkedList length counter
    }

    // Insert at Last Node
    public void insertLast(int data){
        Node newNode = new Node(data);
        if(head == null || tail == null){
            head = newNode;
            tail = newNode;
            listCounter++;   // LinkedList length counter
            return;
        }
        tail.next = newNode;
        newNode.previous = tail;
        tail = newNode;
        listCounter++;   // LinkedList length counter
    }
    
    // Delete First node
    public int deleteFirst(){
        if(head == null || tail == null){
            throw new NoSuchElementException();
        }
        Node temp = head;
        head.next.previous = null;
        head = temp.next;
        temp.next = null;
        listCounter--;   // LinkedList length counter
        return temp.data;
    }

    // Delete last node
    public int deleteLast(){
        if(head == null || tail == null){
            throw new NoSuchElementException();
        }
        Node temp = tail;
        tail.previous.next = null;
        tail = temp.previous;
        tail.next = null;
        listCounter--;   // LinkedList length counter
        return temp.data;
    }

    // Print Double LinkedList in Forward Direction
    public void showForwardDirection(){
        if(head == null){
            return;
        }
        Node temp = head;
        System.out.print("null --> ");
        while(temp != null){
            System.out.print(temp.data + " --> ");
            temp = temp.next;
        }
        System.out.print("null");

    }

    // Print Double LinkedList in Backward Direction
    public void showBackwardDirection(){
        if(head == null){
            return;
        }
        Node temp = tail;
        System.out.print("null --> ");
        while(temp != null){
            System.out.print(temp.data + " --> ");
            temp = temp.previous;
        }
        System.out.print("null");

    }

    // to get the length of Double LinkedList
    public int getLength(){
        return listCounter;
    }

    

    public static void main(String[] args){
        DoubleLinkedList dll = new DoubleLinkedList();
        dll.insertFirst(5);
        dll.insertFirst(4);
        dll.insertFirst(3);
        dll.insertFirst(2);
        dll.insertFirst(1);
        dll.insertLast(6);
        System.out.println("Double linked list length is : " + dll.getLength());
        dll.showForwardDirection();
        // System.out.println(dll.deleteLast());
        // dll.showForwardDirection();
        
        // dll.showBackwardDirection();

    }
}
