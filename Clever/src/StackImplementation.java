import java.util.ArrayList;

/**
 * @author Kate Dlugosz
 *
 * A simple stack implementation
 *
 * @param <E>
 */
public class StackImplementation<E> {
	
	int top = -1;
	ArrayList<E> stack = new ArrayList<E>();
	
	/**
	 * @param the element to be added to the top of the stack
	 * @return boolean telling whether push was completed
	 */
	public boolean push(E element) {
		if (element == null)
			return false;
		stack.add(element);
		top++;
		
		return true;
	}
	
	/**
	 * 
	 * @return top element of the stack
	 */
	public E pop() {
		if (top < 0) {
			System.out.println("Stack is empty!");
			return null;
		}
		
		E topElement = stack.get(top);
		top--;
		
		return topElement;
	}
	
	/**
	 * @return number of elements in stack
	 */
	public int size() {
		return top + 1;
	}
	
	/**
	 * @return boolean telling if stack is empty
	 */
	public boolean isEmpty() {
		return (top < 0);
	}

	/**
	 * Tests for class
	 * @param args
	 */
	public static void main(String[] args) {
		StackImplementation<Integer> stack = new StackImplementation<Integer>();
		
		System.out.println(stack.isEmpty() == true);
		
		stack.push(5);
		System.out.println(stack.size() == 1);
		
		stack.push(6);
		System.out.println(stack.size() == 2);
		
		Integer i = stack.pop();
		System.out.println(i.equals(6));
		System.out.println(stack.size() == 1);
		
		i = stack.pop();
		System.out.println(i.equals(5));
		System.out.println(stack.size() == 0);
		
		System.out.println(stack.isEmpty() == true);
		i = stack.pop();
		System.out.println(i == null);

	}

}
