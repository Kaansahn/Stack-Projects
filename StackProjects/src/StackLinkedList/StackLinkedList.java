package StackLinkedList;

public class StackLinkedList {
	private Node top;

	public StackLinkedList() {
		top = null;
	}
	
	public boolean isEmpty() {
		return top == null;
	}
	
	void push(int data) {
		Node oldTop = top;
		top = new Node();
		top.setData(data);
		top.setNext(oldTop);
	}
	
	void pop() {
		if (isEmpty()) 
			System.out.println("Stack is empty!");
		else {
			int value = top.getData();
			top = top.getNext();
			System.out.println("Popped value: " + value);
		}
	}
	
	int peek() {
		if (isEmpty()) 
			return -1;
		else {
			return top.getData();
		}
	}
	
	void display() {
		if (isEmpty()) 
			System.out.println("Stack is empty!");
		else {
			Node temp = top;
			while (temp != null) {
				System.out.println(temp.getData() + " ");
				temp = temp.getNext();
			}
		}
	}
	
	
}
