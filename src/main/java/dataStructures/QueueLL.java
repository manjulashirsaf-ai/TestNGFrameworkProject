package dataStructures;

public class QueueLL {

	class Node{

		int element;
		Node nextNode; 

		Node(int data){
			this.element = data;
			this.nextNode = null;
		}
	}

	Node front, rear;

	private void enqueue(int data) {

		Node newNode = new Node(data);
		if(rear == null) {
			front = rear = newNode;
			return;
		}

		rear.nextNode = newNode;
		rear = newNode;
	}

	private int dequeue() {

		if(front == null) {
			System.out.println("Queue empty");
			return 0;
		}
		
		int element = front.element;
		front = front.nextNode;
		return element;
	}

	private void printElements() {

		Node currentNode = front;
		while(currentNode != null) {
			System.out.print(currentNode.element + "->");
			currentNode = currentNode.nextNode;
		}
		System.out.println("null");
	}

	public static void main(String[] args){ 

		QueueLL qu = new QueueLL();

		int element = qu.dequeue();
		qu.enqueue(1);
		qu.enqueue(2);
		qu.enqueue(3);
		qu.enqueue(4);
		qu.enqueue(5);
		qu.printElements();
		qu.enqueue(6);
		element = qu.dequeue();
		System.out.print("Element popped is: ");
		System.out.println(element);
		qu.printElements();	
		element = qu.dequeue();
		System.out.print("Element popped is: ");
		System.out.println(element);
		qu.printElements();
		element = qu.dequeue();
		System.out.print("Element popped is: ");
		System.out.println(element);
		qu.printElements();
	}
}