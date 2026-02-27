package dataStructures;

public class StackLinkedList {

	class Node{

		int element;
		Node nextNode;

		Node(int element){
			this.element = element;
			nextNode = null;
		}
	}

	Node root;

	private void push(int element) {

		Node newNode = new Node(element);

		if(root == null) {
			root = newNode;
			return;
		}

		newNode.nextNode = root;
		root = newNode;
	}

	private int pop() {

		int element;

		if(root == null) { 
			System.out.println("Stack empty");
			return 0;
		}

		element = root.element;
		root = root.nextNode;
		return element;
	}

	private void print() {

		Node currentNode = root;

		while(currentNode != null) {

			System.out.print(currentNode.element + "->");
			currentNode = currentNode.nextNode;
		}
		System.out.println("null");
	}

	public static void main(String[] args) {

		StackLinkedList st = new StackLinkedList();

		int ele = st.pop();
		st.push(1);
		st.push(2);
		st.push(3);
		st.push(4);
		st.push(5);
		st.push(6);
		st.print();
		ele = st.pop();
		System.out.printf("Element popped: ");
		System.out.println(ele);
		st.print();
		ele = st.pop();
		System.out.printf("Element popped: ");
		System.out.println(ele);
		st.print();
	}

}