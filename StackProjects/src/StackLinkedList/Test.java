package StackLinkedList;

public class Test {
	public static void main(String[] args) {
		StackLinkedList s = new StackLinkedList();
		s.push(43);
		s.push(17);
		s.push(13);
		// 13 17 43
		s.display();
		System.out.println();
		s.pop();
		s.display();
		System.out.println();
		System.out.println(s.peek());
	}
}
