package jsjf;

import java.util.LinkedList;

/**
 * LinkedQueue represents a linked implementation of a queue.
 * 
 * @author Yanek Keshavjee
 * @version 1.0
 */
public class LinkedQueue<T> implements QueueADT<T> {

  LinkedList<T> queue;

  /**
   * Creates an empty queue.
   */
  public LinkedQueue() {
    queue = new LinkedList<>();
  }

  /**
   * Adds one element to the rear of this queue.
   * 
   * @param element the element to be added to the rear of the queue
   */
  public void enqueue(T element) {
    queue.addLast(element);
  }

  /**
   * Removes and returns the element at the front of this queue.
   * 
   * @return the element at the front of the queue
   * @throws EmptyCollectionException if the queue is empty
   */
  public T dequeue() throws EmptyCollectionException {
    if (isEmpty()) {
      throw new EmptyCollectionException("Queue");
    }

    return queue.remove();
  }

  /**
   * Returns without removing the element at the front of this queue.
   * 
   * @return the first element in the queue
   * @throws EmptyCollectionException if the queue is empty
   */
  public T peek() throws EmptyCollectionException {
    if (isEmpty()) {
      throw new EmptyCollectionException("Queue");
    }
    return queue.getFirst();
  }

  /**
   * Returns true if this queue contains no elements.
   * 
   * @return true if this queue is empty
   */
  public boolean isEmpty() {
    return (size() == 0);
  }

  /**
   * Returns the number of elements in this queue.
   * 
   * @return the integer representation of the size of the queue
   */
  public int size() {
    return queue.size();
  }

  /**
   * Returns a string representation of this queue.
   * 
   * @return the string representation of the queue
   */
  public String toString() {
    String result = "[";

    for (T item : queue) {
      result += item + ", ";
    }

    if (!queue.isEmpty()) {
      result = result.substring(0, result.length() - 2);
    }
    return result + "]";
  }

}