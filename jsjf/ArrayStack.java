package jsjf;

import java.util.ArrayList;

/**
 * ArrayStack represents an arry implementation of a stack.
 * 
 * @author Yanek Keshavjee
 * @version 1.0
 */
public class ArrayStack<T> implements StackADT<T> {

  private ArrayList<T> stack;

  /**
   * Creates an empty stack.
   */
  public ArrayStack() {
    stack = new ArrayList<>();
  }

  /**
   * Adds the specified element to the top of the stack.
   *
   * @param element the element to be added to the list
   */
  public void push(T element) {
    stack.add(element);
  }

  /**
   * Removes the specified element from the top of the stack
   *
   * @return a reference to the element at the top of the stack
   * @throws EmptyCollectionException if the stack is empty
   */
  public T pop() {
    if (isEmpty()) {
      throw new EmptyCollectionException("Stack");
    }
    return stack.remove(stack.size() - 1);
  }

  /**
   * Returns the element at the top of the stack without removing it.
   *
   * @return the element at the top of the stack
   * @throws EmptyCollectionException if the stack is empty
   */
  public T peek() {
    if (isEmpty()) {
      throw new EmptyCollectionException("Stack");
    }
    return stack.get(stack.size() - 1);
  }

  /**
   * Returns true if this stack is empty and false otherwise.
   *
   * @return true if the stack is empty, false otherwise
   */
  public boolean isEmpty() {
    return (stack.size() == 0);
  }

  /**
   * Returns the number of elements in this stack.
   *
   * @return the number of elements in the stack
   */
  public int size() {
    return stack.size();
  }

  /**
   * Returns a string representation of this stack.
   *
   * @return a string representation of the stack
   */
  public String toString() {
    String result = "[";

    for (T item : stack) {
      result += item + ", ";
    }

    if (!stack.isEmpty()) {
      result = result.substring(0, result.length() - 2);
    }
    return result + "]";
  }

}
