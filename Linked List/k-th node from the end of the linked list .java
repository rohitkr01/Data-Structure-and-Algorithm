import java.util.*;
import java.lang.*;
import java.io.*;
class Node{
  int data;
  Node next;
  Node(int data){
    this.data=data;
    this.next = null;
  }
}

public class Main
{
  // insert node at tail of list
    public static Node insertAtTail(Node head, int data){
      Node newNode = new Node(data);
      if(head==null)  return newNode;
      Node currNode= head;
      while(currNode.next!=null){
        currNode = currNode.next;
      }
      currNode.next = newNode;
      return head;
    }

  //calculating value at kth index
    public static int findKthNode(Node head ,int n, int k){
      Node currNode = head;

     for(int i =0;i<n-k;i++){
        currNode = currNode.next;
      }
      return currNode.data;
    }
  
	public static void main (String[] args) throws java.lang.Exception
	{
		//your code here
      Node head = null;
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt() , k = sc.nextInt();
      for(int i=0;i<n;i++){
        int data = sc.nextInt();
        head = insertAtTail(head,data);
      }
    int ans = findKthNode(head,n,k);
      System.out.println(ans);
    }
}
