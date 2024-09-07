import java.util.ArrayList;

public class ArrayStack<T> implements StackADT<T> {

  ArrayList<T> stack;

  public ArrayStack() {
    stack = new ArrayList<>();
  }

  @Override
  public void push(T element) {
    stack.add(element);
  }

  @Override
  public T pop() {
    if (isEmpty()) {
      throw new IllegalArgumentException("Stack");
    }
    return stack.remove(stack.size() - 1);
  }

  @Override
  public T peek() {
    if (isEmpty()) {
      throw new IllegalArgumentException("Stack");
    }
    return stack.get(stack.size() - 1);
  }

  @Override
  public boolean isEmpty() {
    return (stack.size() == 0);
  }

  @Override
  public int size() {
    return stack.size();
  }

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
