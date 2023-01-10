package stackArray;


public class StackArray {
	private int size;
	private int top;
	private char[] chArray;
	
	public StackArray(int size) {
		top = -1;
		this.size = size;
		chArray = new char[size];
	}
	
	public boolean isEmpty() {
		return top < 0;
	}
	
	public boolean push(char ch) {
		if(top >= size) 
			return false;
		else {
			chArray[++top] = ch;
			return true;
		}
	}
	
	public char pop() {
		if (top < 0) 
			return 0;
		else 
			return chArray[top--];
	}
	
	public static String reverse(String str) { //HELLO ---> OLLEH
		int length = str.length();
		StackArray obj = new StackArray(length);
		
		for (int i = 0; i < length; i++) {
			obj.push(str.charAt(i));
		}
		
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < length; i++) {
			sb.append(obj.pop());
		}
		return sb.toString();
	}
	
	public static String reverse2(String str) {
		int length = str.length();
		StackArray obj = new StackArray(length);
		
		for (int i = 0; i < length; i++) 
			obj.push(str.charAt(i));
		
		String reversedString = "";
		
		for (int i = 0; i < length; i++) {
			reversedString += obj.pop();
		}
		return reversedString;
	}

}
