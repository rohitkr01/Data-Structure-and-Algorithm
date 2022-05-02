package Linked_List;
import java.util.*;

public class LL1_UsingCollectonFramwork {
    public static void main(String[] args){
         LinkedList<String> list = new LinkedList<String>();
         list.addFirst("a");
         list.addFirst("is");
         System.out.println(list);

         list.addFirst("this");
         list.addLast("list");
         System.out.println(list);

         list.add(" in linked List");  // add()  - method add at last by default
         System.out.println(list);

         System.out.println("Size of list : " + list.size());     //  size()  -  method return size of linked list

         // traverse in list
         for(int i = 0 ; i < list.size() ; i++){
             System.out.print(list.get(i) + " -> ");
         }
         System.out.println("NUll");


         // Remove/Delete  from list
         list.removeFirst();
         System.out.println(list);

         list.removeLast();
         System.out.println(list);

         list.remove(2);      // remove(index) -> remove at given index
         System.out.println(list);
    }
   
}
