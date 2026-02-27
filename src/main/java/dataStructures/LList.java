package dataStructures;

public class LList {
	
	class Node{
		
		String data;
		Node nextNode;
		
		Node(String item){
			this.data = item;
			this.nextNode = null;
		}
	}
	
	Node root;
	
	private void insertFirst(String element) {
		
		Node newNode = new Node(element);
		if(root == null) {
			root = newNode;
			return;
		}
		
		newNode.nextNode = root;
		root = newNode;
	}
	
	private void insertLast(String element) {
		
		Node newNode = new Node(element);
		if(root == null) {
			root = newNode;
			return;
		}
		
		Node currentNode = root;
		while(currentNode.nextNode != null) {
			currentNode = currentNode.nextNode;
		}
		
		currentNode.nextNode = newNode;
		newNode.nextNode = null;
	}
	
	private void deleteFirst() {
		
		Node currentNode = root;
		if(currentNode == null) 
			System.out.println("List empty");
		else if(currentNode.nextNode == null) {
			root = null;
		}else if(currentNode.nextNode != null) 
			root = currentNode.nextNode;
	}
	
	private void deleteLast() {
		
		Node currentNode = root;
		Node secondLastNode = null;
		if(currentNode == null) 
			System.out.println("List empty");
		else if(currentNode.nextNode == null) {
			root = null;
		}
		
		while(currentNode.nextNode != null) {
			secondLastNode = currentNode;
			currentNode = currentNode.nextNode;
		}
		
		secondLastNode.nextNode = null;
	}
	
	private void printList() {
		
		Node currentNode = root;
		
		while(currentNode != null) {
			System.out.print(currentNode.data + "->");
			currentNode = currentNode.nextNode;
		}
		
		System.out.print("null");
	}
	
	public static void main(String[] args) {
		
		LList list= new LList();
		
		list.insertFirst("is");
		list.insertFirst("this");
		list.insertFirst("Hi");
		list.insertFirst("Hello");
		list.insertLast("Singly");
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