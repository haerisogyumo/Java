package sub2;

import java.util.Stack;

/*
 * 날짜 : 022/09/08
 * 이름 : 진윤희
 * 내용 : Stack
 */
public class StackTest {
	
	public static void main(String[] args) {
		
		
		Stack<Integer> stack = new Stack<>();
		
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);
		
		while(!stack.empty()) {
			System.out.println(stack.pop());
		}
		
		
		
	}

}
