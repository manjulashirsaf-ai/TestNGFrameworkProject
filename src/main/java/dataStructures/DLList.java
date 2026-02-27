package dataStructures;

public class DLList {
	
	class Node{
		
		String data;
		Node nextNode;
		Node prevNode;
		
		Node(String item){
			this.data = item;
			this.nextNode = null;
			this.prevNode = null;
		}
	}
	
	Node root;
	Node last;
	
	private void insertFirst(String element) {
		
		Node newNode = new Node(element);
		if(root == null) {
			root = last = newNode;
			return;
		}
		newNode.nextNode = root;
		root.prevNode = newNode;
		root = newNode;
	}
	
	private void insertLast(String element) {
		
		Node newNode = new Node(element);
		if(last == null) {
			root = last = newNode;
			return;
		}
		newNode.prevNode = last;
		last.nextNode = newNode;
		last = newNode;
	}
	
	private void deleteFirst() {
		
		Node currentNode = root;
		if(currentNode == null) 
			System.out.println("List empty");
		else if(currentNode.nextNode == null) {
			root = null;
		}else if(currentNode.nextNode != null) { 
			root = currentNode.nextNode;
			currentNode.prevNode = null;
		}
		
	}
	
	private void deleteLast() {
		
		Node currentNode = last;
		if(currentNode == null) 
			System.out.println("List empty");
		else if(currentNode.prevNode == null) {
			last = null;
		}else if(currentNode.prevNode != null) { 
			last = currentNode.prevNode;
			last.nextNode = null;
		}
	}
	
	private void printList() {
		
		Node currentNode = root;
		
		while(currentNode != null) {
			System.out.print(currentNode.data + "=>");
			currentNode = currentNode.nextNode;
		}
		
		System.out.print("null");
	}
	
	public static void main(String[] args) {
		
		DLList list= new DLList();
		
		list.insertFirst("is");
		list.insertFirst("this");
		list.insertFirst("Hi");
		list.insertFirst("Hello");
		list.insertLast("Doubly");
		list.insertLast("Linked");
		list.insertLast("List");
		list.insertLast("!");
		list.printList();
		list.deleteFirst();
		System.out.println();
		list.printList();
		list.deleteLast();
		System.out.println();
		list.printList();
	}
}