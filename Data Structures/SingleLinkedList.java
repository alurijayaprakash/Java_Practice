/* 
Author : Jayaprakash Aluri @ IIIT Hyderabad
Single Linked list with few methods
1. insert at First
2. insert at Last
3. insert at given position
4. delete at last
5. delete at first
6. delete at given index
7. find element
8. length of linked list
9. show linked list
*/ 
public class SingleLinkedList {
    class Node{
        int data;
        Node next;
        // Node constructor
        Node (int data){
            this.data = data;
            this.next = null;
        }
    }

    Node head;  // head declaration
    int listCounter = 0;
    // insert Node at last
    public void insertFirst(int data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
        listCounter++; //LinkedList Length counter
    }

    // insert Node at last
    public void insertLast(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
        }
        Node current = head;
        while(current.next != null){
            current = current.next;
        }
        current.next = newNode;
        listCounter++; //LinkedList Length counter
    }

    // insert node at given position -- assume positions starts from 1 not 0.
    // assume valid position else use getLength()
    public void insertAtPosition(int data, int position){
        Node newNode = new Node(data);
        if(position == 1){
            newNode.next = head;
            head = newNode;
            return;
        }

        Node previous = head;
        int counter = 1;
        while(counter < position-1){
            previous = previous.next;
            counter++;
        }
        // now previous is just before the position value
        Node current = previous.next;
        previous.next = newNode;
        newNode.next = current;
        listCounter++; //LinkedList Length counter
    }



    // delete First node
    public int deleteFirst(){
        if(head==null){
            System.out.println("nothing to delete");
        }
        int deletedVal = head.data; // return deleted value
        Node current = head;
        head = head.next;
        current.next = null;
        listCounter--; //LinkedList Length counter
        return deletedVal;
    }

    // delete Last node
    public int deleteLast(){
        if(head==null){
            System.out.println("nothing to delete");
        }
        Node current = head;
        Node previous = null; 
        while(current.next != null){
            previous = current; // this is holding last but one node
            current = current.next; // this is holding ast node
        }
        previous.next = null;
        int deletedVal = current.data;  // return the deleted value
        listCounter--; //LinkedList Length counter
        return deletedVal;
    }

// delete node at given position -- assume positions starts from 1 not 0.
    // assume valid position else use getLength()
    public int deleteAtPosition(int position){
        if(position == 1){
            Node current = head;
            head = head.next;
            current.next = null;
            int deletedVal = current.data;
            listCounter--; //LinkedList Length counter
            return deletedVal;
        }

        Node previous = head;
        int counter = 1;
        while(counter < position-1){
            previous = previous.next;
            counter++;
        }
        // now previous is just before the position value
        Node current = previous.next;
        previous.next = previous.next.next;
        current.next = null;
        int deletedVal = current.data;
        listCounter--; //LinkedList Length counter
        return deletedVal;
    }

    // Search element in SLL
    // need to pass searching element
    public boolean find(int data){
        if(head == null){
            return false;
        }
        Node current = head;
        while(current != null){
            if(current.data == data){
                return true;
            }
            current = current.next;
        }
        return false;
    }

    // Linked List length
    public int getLength(){
        return listCounter;
    }


    // printing LinkedList
    public void show(){
        if (head == null){
            System.out.println("head is null");
        }
        Node current = head;
        while(current != null){
            System.out.print(current.data + " --> ");
            current = current.next;
        }
        System.out.print(" null ");
        
    }

    // Main method
    public static void main (String[] args){
        SingleLinkedList sll = new SingleLinkedList();
        sll.insertFirst(6);
        sll.insertFirst(5);
        sll.insertFirst(4);
        sll.insertFirst(3);
        sll.insertFirst(2);
        sll.insertFirst(1);
        // sll.insertAtPosition(99,3);
        sll.deleteAtPosition(6);
        System.out.println("Searching value isPresent : "+sll.find(5));
        System.out.println("Total Linked List Length is : " + sll.getLength());
        sll.show();
    }
}
