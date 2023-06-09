import java.io.*;
import java.util.*;

class Node {
	int data;
	Node next;
	Node(int d) {
        data = d;
        next = null;
    }
}

class Solution {

    public static Node insert(Node head,int data) {
        if(head == null){
            head = new Node(data);
            return head; }
        
        Node start = head;
        while(start.next != null){
            start = start.next;
            }
        start.next = new Node(data);
        return head; 
        }

	public static void display(Node head) {
