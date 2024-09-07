import java.util.EmptyStackException;

public class Driver {
  public static void main(String[] args) {
    LinkedStack<Integer> stack = new LinkedStack<Integer>();

    // ArrayStack<Character> stack = new ArrayStack<Character>();

    // Test isEmpty on an empty stack
    System.out.println("Is the stack empty? " + stack.isEmpty());

    // Push elements onto the stack
    System.out.println("Pushing elements onto the stack:");
    stack.push(10);
    stack.push(20);
    stack.push(30);

    // Print the stack
    System.out.println("Stack after pushing elements: " + stack);

    // Peek at the top element
    System.out.println("Peek at the top element: " + stack.peek());

    // Pop elements from the stack
    System.out.println("Popping elements from the stack:");
    System.out.println("Popped: " + stack.pop());
    System.out.println("Popped: " + stack.pop());

    // Print the stack after popping
    System.out.println("Stack after popping elements: " + stack);

    // Peek again
    System.out.println("Peek at the top element: " + stack.peek());

    // Pop the last element
    System.out.println("Popped: " + stack.pop());

    // Check if stack is empty after all pops
    System.out.println("Is the stack empty? " + stack.isEmpty());

    // Try to pop from the empty stack (should throw an exception)
    try {
      System.out.println("Trying to pop from an empty stack...");
      stack.pop(); // This should throw an exception
    } catch (EmptyStackException e) {
      System.out.println("Caught EmptyStackException: " + e);
    }
  }
}
