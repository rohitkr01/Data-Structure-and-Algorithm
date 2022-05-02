package Linked_List;

public class LL1 {
    Node head;
    private int size;

    LL1(){
          this.size = 0;
    }


    class Node{
        String data;
        Node next;

        Node(String data){
            this.data = data;
            this.next = null;
            size++;
        }
    }

    //add -  add first  , add last
    public void addFirst(String data){
        Node newNode  = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public  void addLast(String data){
        Node newNode  = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        Node currNode = head;
        while(currNode.next != null){
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }

    // Print Linked List
    public void printList(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }

        Node currNode = head;
        while(currNode != null){
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
        System.out.println("NULL");

    }

    //delete First
    public void deleteFirst(){
        if(head == null){
            System.out.println("The list is empty");
            return;
        }
        size--;
        head = head.next;
    }


    // Delete Last
    public void deleteLast(){
        if(head == null){
            System.out.println("The list is empty");
            return;
        }
        size--;
        if(head.next == null){
            head = null;
            return;
        }

        Node secondLast = head;
        Node lastNode = head.next;      // head.next = null -> lastNode = null
        while(lastNode.next != null){     // null.next    give error
            lastNode = lastNode.next;
            secondLast = secondLast.next;
        }
        
        secondLast.next = null;
    }

    public int getSize(){
        return size;
    }


    public static void main(String[] args){
        LL1 List = new LL1();
        List.addFirst("Kumar");
        List.addFirst("rohit");
        List.addFirst("is");
        List.addFirst("this");

        List.printList();

        List.addLast("Thanks");
        List.printList();

        List.deleteFirst();
        List.printList();

        List.deleteLast();
        List.printList();

        System.out.println("Size of List : " + List.getSize());
        

        //Operations on Linked List -  insertion , Print , Delete , Size 


    }
}
