package jsjf;

import java.util.ArrayList;

/**
 * ArrayQueue represents an arry implementation of a queue.
 * 
 * @author Yanek Keshavjee
 * @version 1.0
 */
public class ArrayQueue<T> implements QueueADT<T> {

  private ArrayList<T> queue;

  /**
   * Creates an empty queue.
   */
  public ArrayQueue() {
    queue = new ArrayList<>();
  }

  /**
   * Adds one element to the rear of this queue.
   * 
   * @param element the element to be added to the rear of the queue
   */
  public void enqueue(T element) {
    queue.add(element);
  }

  /**
   * Removes and returns the element at the front of this queue.
   * 
   * @return the element at the front of the queue
   * @throws EmptyCollectionException if the queue is empty
   */
  public T dequeue() {
    if (isEmpty()) {
      throw new EmptyCollectionException("Queue");
    }

    return queue.remove(0);
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

    return queue.get(0);
  }

  /**
   * Returns true if this queue contains no elements.
   * 
   * @return true if this queue is empty
   */
  public boolean isEmpty() {
    return queue.isEmpty();
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
    if (isEmpty()) {
      return "[]";
    }

    String result = "[";

    for (int i = 0; i < size(); i++) {
      result += queue.get(i) + ", ";
    }

    result = result.substring(0, result.length() - 2);
    return result += "]";
  }

}
