package jsjf;

import java.util.ArrayList;

/**
 * ArrayQueue represents an arry implementation of a queue.
 * 
 * @author Yanek Keshavjee
 * @version 1.0
 */
public class ArrayQueue<T> implements QueueADT<T> {

  ArrayList<T> queue;
  int rear;
  int front;
  int count;

  /**
   * Creates an empty queue.
   */
  public ArrayQueue() {
    queue = new ArrayList<>();
    this.front = 0;
    this.rear = 0;
    this.count = 0;
  }

  /**
   * Adds one element to the rear of this queue.
   * 
   * @param element the element to be added to the rear of the queue
   */
  public void enqueue(T element) {
    queue.add(rear, element);

    rear = (rear + 1) % queue.size();

    count++;

    if (count == 1) {
      front = rear;
    }
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

    T result = queue.get(front);

    front = (front + 1) % queue.size();

    count--;

    return result;
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

    return queue.get(front);
  }

  /**
   * Returns true if this queue contains no elements.
   * 
   * @return true if this queue is empty
   */
  public boolean isEmpty() {
    return count == 0;
  }

  /**
   * Returns the number of elements in this queue.
   * 
   * @return the integer representation of the size of the queue
   */
  public int size() {
    return count;
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

    int index = front;

    for (int i = 0; i < count; i++) {
      result += queue.get(index) + ", ";

      index = (index + 1) % queue.size();
    }

    result = result.substring(0, result.length() - 2);
    return result += "]";
  }

}
