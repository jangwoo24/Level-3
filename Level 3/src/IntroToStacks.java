import java.util.Stack;

public class IntroToStacks {
	public static void main(String[] args) {
		IntroToStacks ITS = new IntroToStacks();
	}
	IntroToStacks() {
		Stack<Float> myStack = new Stack<>();
		myStack.push((float) 2.7);
		myStack.push(33.1f);
		myStack.push(13.864f);
		myStack.push(15.624f);
		myStack.push(14.48f);
		myStack.push(6.9f);
		int x = myStack.size();
		for (int i = 0; i < x; i++) {
			System.out.println(myStack.pop());
		}
		WordStack("I like bacon");
	}
	String WordStack(String word) {
		char q = ' ';
		String drow = "";
		Stack<Character> charStack = new Stack<>();
		for (int i = 0; i < word.length(); i++) {
			charStack.push(q);
			
		}
		int x = charStack.size();
		for (int i = 0; i < x; i++) {
			q = charStack.pop();
			drow+=q;
		}
		System.out.println(drow);
		return drow;
	}
}
