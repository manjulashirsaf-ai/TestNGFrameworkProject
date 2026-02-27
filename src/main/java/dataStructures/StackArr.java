package dataStructures;

public class StackArr {

	int top;
	int[] stkArr;

	StackArr(){

		top = -1;
		stkArr = new int[5];
	}

	private void push(int element) {

		if(top == stkArr.length - 1) {
			System.out.println("Stack is full");
			return;
		}

		top++;
		stkArr[top] = element;
	}

	private int pop() {

		if(top == -1) {
			System.out.println("Stack is empty");
			return 0;
		}

		int element = stkArr[top];
		top--;

		return element;
	}

	private void printElements() {

		for(int i = top;i>-1;i--)
			System.out.println(stkArr[i]);
	}


	public static void main(String[] args) {

		StackArr st = new StackArr();

		int element = st.pop();
		st.push(1);
		st.push(2);
		st.push(3);
		st.push(4);
		st.push(5);
		st.printElements();
		st.push(6);
		element = st.pop();
		System.out.print("Element popped is: ");
		System.out.println(element);
		st.printElements();	
		element = st.pop();
		System.out.print("Element popped is: ");
		System.out.println(element);
		st.printElements();
	}
}