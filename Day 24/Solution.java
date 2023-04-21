import java.io.*;
import java.util.*;
class Node{
	int data;
	Node next;
	Node(int d){
        data=d;
        next=null;
    }
	
}
class Solution
{

    public static Node removeDuplicates(Node head) {
        Set ss = new HashSet(); Node curr = head; Node pre = null; while (curr != null) { if (ss.contains(curr.data) ) { pre.next = curr.next; curr = pre.next; }else { ss.add(curr.data); pre = curr; curr = curr.next;
}
} return head;
    }

	 public static  Node insert(Node head,int data)
