package jsjf;

public class Driver {
  public static void main(String[] args) {
    // Test ArrayStack
    System.out.println("Testing ArrayStack:");
    StackADT<Integer> arrayStack = new ArrayStack<>();
    testStack(arrayStack);

    // Test LinkedStack
    System.out.println("\nTesting LinkedStack:");
    StackADT<Integer> linkedStack = new LinkedStack<>();
    testStack(linkedStack);

    // Test LinkedQueue
    System.out.println("\nTesting LinkedQueue:");
    QueueADT<Integer> linkedQueue = new LinkedQueue<>();
    testQueue(linkedQueue);

    // Test ArrayQueue
    System.out.println("\nTesting ArrayQueue:");
    QueueADT<Integer> arrayQueue = new ArrayQueue<>();
    testQueue(arrayQueue);

  }

  public static void testQueue(QueueADT<Integer> queue) {
    // Test isEmpty on an empty queue
    System.out.println("Is the queue empty? " + queue.isEmpty());

    // Enqueue elements
    System.out.println("Enqueueing elements to the queue:");
    queue.enqueue(10);
    queue.enqueue(20);
    queue.enqueue(30);
    queue.enqueue(40); // Add more elements to test robustness
    queue.enqueue(50);

    // Print the size of the queue
    System.out.println("Queue size after enqueuing 5 elements: " + queue.size());

    // Peek at the front element
    System.out.println("Peek at the front element: " + queue.peek());

    // Dequeue elements from the queue
    System.out.println("Dequeuing elements from the queue:");
    System.out.println("Dequeued: " + queue.dequeue());
    System.out.println("Dequeued: " + queue.dequeue());

    // Check the size of the queue after dequeuing
    System.out.println("Queue size after dequeuing 2 elements: " + queue.size());

    // Peek at the front element again
    System.out.println("Peek at the front element: " + queue.peek());

    // Dequeue all elements until empty
    System.out.println("Dequeued: " + queue.dequeue());
    System.out.println("Dequeued: " + queue.dequeue());
    System.out.println("Dequeued: " + queue.dequeue());

    // Check if the queue is empty
    System.out.println("Is the queue empty after dequeuing all elements? " + queue.isEmpty());

    // Try to dequeue from an empty queue (should throw an exception)
    try {
      System.out.println("Trying to dequeue from an empty queue...");
      queue.dequeue(); // This should throw an exception
    } catch (EmptyCollectionException e) {
      System.out.println("Caught exception: " + e.getMessage());
    }

    // Re-enqueue to test enqueue after the queue is empty
    System.out.println("Re-enqueueing after emptying the queue:");
    queue.enqueue(60);
    queue.enqueue(70);
    System.out.println("Queue size after re-enqueueing: " + queue.size());
    System.out.println("Peek at the front element: " + queue.peek());
  }

  // Generic method to test any stack implementation
  public static void testStack(StackADT<Integer> stack) {
    // Test isEmpty on an empty stack
    System.out.println("Is the stack empty? " + stack.isEmpty());

    // Push elements onto the stack
    System.out.println("Pushing elements onto the stack:");
    stack.push(10);
    stack.push(20);
    stack.push(30);
    stack.push(40); // Add more elements to test robustness
    stack.push(50);

    // Print the stack size
    System.out.println("Stack size after pushing 5 elements: " + stack.size());

    // Peek at the top element
    System.out.println("Peek at the top element: " + stack.peek());

    // Pop elements from the stack
    System.out.println("Popping elements from the stack:");
    System.out.println("Popped: " + stack.pop());
    System.out.println("Popped: " + stack.pop());

    // Check stack size after popping
    System.out.println("Stack size after popping 2 elements: " + stack.size());

    // Peek again
    System.out.println("Peek at the top element: " + stack.peek());

    // Pop all elements until empty
    System.out.println("Popped: " + stack.pop());
    System.out.println("Popped: " + stack.pop());
    System.out.println("Popped: " + stack.pop());

    // Check if stack is empty after all pops
    System.out.println("Is the stack empty? " + stack.isEmpty());

    // Try to pop from the empty stack (should throw an exception)
    try {
      System.out.println("Trying to pop from an empty stack...");
      stack.pop(); // This should throw an exception
    } catch (EmptyCollectionException e) {
      System.out.println("Caught exception: " + e.getMessage());
    }

    // Push again after emptying the stack to test reuse
    System.out.println("Pushing elements again after emptying the stack:");
    stack.push(60);
    stack.push(70);
    System.out.println("Stack size after re-pushing: " + stack.size());
    System.out.println("Peek at the top element: " + stack.peek());
  }
}
