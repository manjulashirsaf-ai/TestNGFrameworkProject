package dataStructures;

public class QueuekArr {

	int front;
	int rear;
	int[] queueArr;

	QueuekArr(){

		front = rear = -1;
		queueArr = new int[5];
	}

	private void enqueue(int element) {

		if(rear == queueArr.length - 1) {
			System.out.println("Queue is full");
			return;
		}else if(rear == -1) {
			
			rear++;
			front++;
			queueArr[rear] = element;
			return;
		}

		rear++;
		queueArr[rear] = element;
	}

	private int dequeue() {

		if(rear == -1) {
			System.out.println("Queue is empty");
			return 0;
		}

		int element = queueArr[front];
		front++;

		return element;
	}

	private void printElements() {

		for(int i = front;i <= rear;i++)
			System.out.println(queueArr[i]);
	}


	public static void main(String[] args) {

		QueuekArr qu = new QueuekArr();

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
	}
}