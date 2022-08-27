/*
You are given the heads of two sorted linked lists list1 and list2.
Merge the two lists in a one sorted list. The list should be made by splicing together the nodes of the first two lists.
Return the head of the merged linked list.
Example 1 :
Input: list1 = [1,2,4], list2 = [1,3,4]
Output: [1,1,2,3,4,4]
Example 2:
Input: list1 = [], list2 = []
Output: []
Example 3:
Input: list1 = [], list2 = [0]
Output: [0]
*/


import java.util.*;

class Node{
  int data;
  Node next;

  Node(int data){
    this.data = data;
    this.next=null;
  }
}

public class Main
{
// inserting to the tail
   static Node insertAtTail(Node head,int data){
      Node newNode = new Node(data);
     if(head==null){
       return newNode;
     }
     Node currNode = head;
     while(currNode.next !=null){
       currNode = currNode.next;
     }
     currNode.next=newNode;
     return head;
   } 

  // merging the two sorted Lists
  public static  Node mergeTwoLists(Node list1, Node list2) {
        if(list1 == null && list2 == null) return null;
        if(list1 == null ) return list2;
        if(list2 == null ) return list1;
        
        Node ans = new Node(0);
        Node curr = ans;
        while(list1!=null && list2!=null){
            if(list1.data <=list2.data){
                curr.next= list1;
                list1=list1.next;
            }
            else{
                curr.next=list2;
                list2=list2.next;
            }
            curr = curr.next; 
        }
        if(list1 != null)  curr.next=list1;
        if(list2 != null)  curr.next = list2;
        return ans.next;
    }

  //  Printing the list
  static void printList(Node head){
    Node currNode = head;
    while(currNode != null){
      System.out.print(currNode.data + " ");
      currNode = currNode.next;
    }
  }
	public static void main (String[] args) throws java.lang.Exception
	{
      Node list1 = null;
      Node list2 = null;
		//your code here
      Scanner sc = new Scanner(System.in);
      int N = sc.nextInt();
      for(int i =0 ; i<N;i++){
        int data = sc.nextInt();
        list1= insertAtTail(list1,data);
      }
      int M = sc . nextInt();
       for(int i =0 ; i<M;i++){
        int data = sc.nextInt();
        list2= insertAtTail(list2,data);
      }

      Node ans = null;
      ans =  mergeTwoLists(list1,list2) ;
      printList(ans);

	}
}
